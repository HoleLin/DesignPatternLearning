package design.pattern.behavioral.visitor;

/**
 * ClassName: FreeCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class FreeCourse extends Course {
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
