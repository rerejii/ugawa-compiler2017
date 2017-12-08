import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PiLangLexer;
import parser.PiLangParser;

public class Interpreter extends InterpreterBase {
	static class ReturnValue {
		ReturnValue(int value) {
			this.value = value;
		}
		int value;
	}

	Environment globalEnv;
	ASTProgNode prog;
	ASTFunctionNode lookupFunction(String name) {
		for (ASTFunctionNode func: prog.funcDecls)
			if (func.name.equals(name))
				return func;
		throw new Error("undefined functin: "+name);
	}

	int evalFunction(ASTFunctionNode nd, ArrayList<Integer> args) {
		Environment env = new Environment();
		for (int i = 0; i < nd.params.size(); i++) {
			String name = nd.params.get(i);
			Variable var = new Variable(name);
			int arg = args.get(i);
			var.set(arg);
			env.push(var);
		}

		/* ローカル変数を追加するコードをここに書く */
		for (int i = 0; i < nd.varDecls.size(); i++) {
			String name = nd.varDecls.get(i);
			Variable var = new Variable(name);
			var.set(0);
			env.push(var);
		}

		for (ASTNode stmt: nd.stmts) {
			ReturnValue retval = evalStmt(stmt, env);
			if (retval != null)
				return retval.value;
		}
		return 0;
	}

	ReturnValue evalStmt(ASTNode ndx, Environment env) {
		/* ここを完成させる */
		ReturnValue retval = null;
		if (ndx instanceof ASTCompoundStmtNode) {
			ASTCompoundStmtNode nd = (ASTCompoundStmtNode) ndx;
			ArrayList<ASTNode> stmts = nd.stmts;
			for (ASTNode child: stmts)
				retval = evalStmt(child, env);
		} else if (ndx instanceof ASTAssignStmtNode) {
			ASTAssignStmtNode nd = (ASTAssignStmtNode) ndx;
		    Variable var = env.lookup(nd.var);
		    if (var == null)
		    		var = globalEnv.lookup(nd.var);
		    if (var == null)
		    		throw new Error("undefined variable: "+nd.var);
		    int value = evalExpr(nd.expr, env);
		    var.set(value);
		} else if (ndx instanceof ASTIfStmtNode) {
		    ASTIfStmtNode nd = (ASTIfStmtNode) ndx;
		    if (evalExpr(nd.cond, env) != 0)
		      retval = evalStmt(nd.thenClause, env);
		    else
		    	retval = evalStmt(nd.elseClause, env);
		  } else if (ndx instanceof ASTWhileStmtNode) {
			  ASTWhileStmtNode nd = (ASTWhileStmtNode) ndx;
			  while (evalExpr(nd.cond, env) != 0)
				  retval = evalStmt(nd.stmt, env);
		  } else if (ndx instanceof ASTPrintStmtNode) {
			  ASTPrintStmtNode nd = (ASTPrintStmtNode) ndx;
			  int val = evalExpr(nd.stmt, env);
			  System.out.println(String.format("%08X", val));
		  } else if (ndx instanceof ASTReturnStmtNode) {
			  ASTReturnStmtNode nd = (ASTReturnStmtNode) ndx;
			  int value = evalExpr(nd.expr, env);
			  return new ReturnValue(value);
		  } else
		    throw new Error("Unknown statement: "+ndx);
		return retval;
	}

	int evalExpr(ASTNode ndx, Environment env) {
		/* ここを完成させる */
		if (ndx instanceof ASTBinaryExprNode) {
			ASTBinaryExprNode nd = (ASTBinaryExprNode) ndx;
			int lhsValue = evalExpr(nd.lhs, env);
			int rhsValue = evalExpr(nd.rhs, env);
			if (nd.op.equals("+"))
				return lhsValue + rhsValue;
			else if (nd.op.equals("-"))
				return lhsValue - rhsValue;
			else if (nd.op.equals("*"))
				return lhsValue * rhsValue;
			else if (nd.op.equals("/"))
				return lhsValue / rhsValue;
			else if (nd.op.equals("&"))
				return lhsValue & rhsValue;
			else if (nd.op.equals("|"))
				return lhsValue | rhsValue;
			else
				throw new Error("Unknwon operator: "+nd.op);
		} else if (ndx instanceof ASTNumberNode) {
			ASTNumberNode nd = (ASTNumberNode) ndx;
			return nd.value;
		} else if (ndx instanceof ASTVarRefNode) {
			ASTVarRefNode nd = (ASTVarRefNode) ndx;
			Variable var = env.lookup(nd.varName);
			if (var == null)
				var = globalEnv.lookup(nd.varName);
			if (var == null)
				throw new Error("Undefined variable: "+nd.varName);
			return var.get();
		} else if (ndx instanceof ASTUnaryExprNode) {
			ASTUnaryExprNode nd = (ASTUnaryExprNode) ndx;
			int operandValue = evalExpr(nd.operand, env);
			if (nd.op.equals("-"))
				return operandValue * -1;
			else if (nd.op.equals("~"))
				return ~operandValue;
			else
				throw new Error("Unknwon operator: "+nd.op);
		} else if (ndx instanceof ASTCallNode) {
			  ASTCallNode nd = (ASTCallNode) ndx;
			  ASTFunctionNode func = lookupFunction(nd.name);
			  ArrayList<Integer> args = new ArrayList<Integer>();
			  for (ASTNode argNode: nd.args) {
			    int arg = evalExpr(argNode, env);
			    args.add(arg);
			  }
			  return evalFunction(func, args);
		} else {
			throw new Error("Unknown expression: "+ndx);
		}
	}

	public int eval(ASTNode ast) {
		globalEnv = new Environment();
		prog = (ASTProgNode) ast;
		for (String varName: prog.varDecls) {
			if (globalEnv.lookup(varName) != null)
				throw new Error("Variable redefined: "+varName);
			addGlobalVariable(globalEnv, varName, 0);
		}

		ASTFunctionNode mainFunc = lookupFunction("main");
		ArrayList<Integer> args = new ArrayList<Integer>();
		int answer = evalFunction(mainFunc, args);
		return answer;
	}

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PiLangLexer lexer = new PiLangLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		PiLangParser parser = new PiLangParser(token);
		ParseTree tree = parser.prog();
		ASTGenerator astgen = new ASTGenerator();
		ASTNode ast = astgen.translate(tree);
		Interpreter interp = new Interpreter();
		int answer = interp.eval(ast);
		System.out.println(answer);
	}
}
