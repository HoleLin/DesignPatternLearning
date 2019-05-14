package design.pattern.behavioral.visitor;

/**
 * ClassName: Visitor
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class Visitor implements IVisitor {

	@Override
	public void visit(FreeCourse freeCourse) {
		System.out.println("免费课程: " + freeCourse.getName());
	}

	@Override
	public void visit(CodingCourse codingCourse) {
		System.out.println("实战课程" + codingCourse.getName() + " 价格:" + codingCourse.getPrice());
	}
}
