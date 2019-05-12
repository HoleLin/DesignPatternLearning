package design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * ClassName: GeelyExpressionParser
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class GeelyExpressionParser {
	private Stack<Interpreter> mStack = new Stack<>();


	public int parse(String inputStr) {
		String[] strItemArray = inputStr.split(" ");
		for (String symbol : strItemArray) {
			if (!OperatorUtil.isOperator(symbol)) {
				Interpreter numberExpression = new NumberInterpreter(symbol);
				mStack.push(numberExpression);
				System.out.println(String.format("入栈: %d", numberExpression.interpret()));
			} else {
				Interpreter firstExpression = mStack.pop();
				Interpreter secondExpression = mStack.pop();
				System.out.println(String.format("出栈: %d 和 %d", firstExpression.interpret(), secondExpression.interpret()));
				Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
				System.out.println("运算符: " + operator);
				int result = operator.interpret();
				NumberInterpreter numberInterpreter = new NumberInterpreter(result);
				mStack.push(numberInterpreter);
				System.out.println("阶段结果为: " + numberInterpreter.interpret());
			}
		}
		int result = mStack.pop().interpret();
		return result;
	}
}
