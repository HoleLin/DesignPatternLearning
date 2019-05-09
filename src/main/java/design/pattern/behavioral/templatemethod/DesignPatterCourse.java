package design.pattern.behavioral.templatemethod;

/**
 * ClassName: DesignPatterCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class DesignPatterCourse extends AbstractCourse {
	@Override
	void packageCourse() {
		System.out.println("提供课程Java源代码");
	}

	@Override
	protected boolean needWriteArticle() {
		return true;
	}
}
