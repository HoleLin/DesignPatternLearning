package design.pattern.behavioral.interpreter;

/**
 * ClassName: NumberInterpreter
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class NumberInterpreter implements Interpreter {
	private int number;

	public NumberInterpreter(int number) {
		this.number = number;
	}

	public NumberInterpreter(String number) {
		this.number = Integer.parseInt(number);
	}


	@Override
	public int interpret() {
		return this.number;
	}
}
