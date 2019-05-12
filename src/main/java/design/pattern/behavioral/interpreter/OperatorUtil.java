package design.pattern.behavioral.interpreter;

/**
 * ClassName: OperatorUtil
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class OperatorUtil {
	public static boolean isOperator(String symbol) {
		return (symbol.equals("+") || symbol.equals("*"));
	}

	public static Interpreter getExpressionObject(Interpreter firstExpression,
	                                              Interpreter secondExpression, String symbol) {
		if (symbol.equals("+")) {
			return new AddInterpreter(firstExpression, secondExpression);
		} else if (symbol.equals("*")) {
			return new MultInterpreter(firstExpression, secondExpression);
		}
		return null;

	}
}
