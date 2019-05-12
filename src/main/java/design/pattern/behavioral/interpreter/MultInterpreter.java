package design.pattern.behavioral.interpreter;

/**
 * ClassName: MultInterpreter
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class MultInterpreter implements Interpreter {
	private Interpreter firstExpression, secondExpression;

	public MultInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	@Override
	public int interpret() {
		return this.firstExpression.interpret() * this.secondExpression.interpret();
	}

	@Override
	public String toString() {
		return "*";
	}
}
