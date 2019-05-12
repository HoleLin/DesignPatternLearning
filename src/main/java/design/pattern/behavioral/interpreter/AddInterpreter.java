package design.pattern.behavioral.interpreter;

/**
 * ClassName: AddInterpreter
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class AddInterpreter implements Interpreter {
	private Interpreter firstExpression, secondExpression;

	public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	@Override
	public int interpret() {
		return this.firstExpression.interpret() + this.secondExpression.interpret();
	}

	@Override
	public String toString() {
		return "+";
	}
}
