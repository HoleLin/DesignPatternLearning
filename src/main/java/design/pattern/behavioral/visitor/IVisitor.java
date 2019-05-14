package design.pattern.behavioral.visitor;

/**
 * ClassName: IVisitor
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public interface IVisitor {
	void visit(FreeCourse freeCourse);
	void visit(CodingCourse codingCourse);
}
