package design.pattern.behavioral.visitor;

/**
 * ClassName: CourseVidoeState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public abstract class Course {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void accept(IVisitor visitor);
}
