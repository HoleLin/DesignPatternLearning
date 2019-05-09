package design.pattern.behavioral.templatemethod;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class Test {
	public static void main(String[] args) {
		System.out.println("设计模式课程start---");
		AbstractCourse designPatternCourse = new DesignPatterCourse();
		designPatternCourse.makeCourse();
		System.out.println("设计模式课程end---");
		System.out.println("前端课程start---");
		AbstractCourse FECourse = new FECourse(false);
		FECourse.makeCourse();
		System.out.println("前端课程end---");
	}
}
