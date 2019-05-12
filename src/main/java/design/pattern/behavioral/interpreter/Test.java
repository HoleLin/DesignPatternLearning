package design.pattern.behavioral.interpreter;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Test {
	public static void main(String[] args) {
		String inputStr = "6 100 11 + *";
		GeelyExpressionParser mExpressionParser = new GeelyExpressionParser();
		int result = mExpressionParser.parse(inputStr);
		System.out.println("result = " + result);
	}
}
