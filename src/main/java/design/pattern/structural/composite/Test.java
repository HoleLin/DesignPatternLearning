package design.pattern.structural.composite;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Test {
	public static void main(String[] args) {
		CatelogComponent linuxCourse = new Course("Linux课程", 11);
		CatelogComponent windowsCourse = new Course("Windows课程", 11);
		CatelogComponent javaCourseCatelog = new CourseCatelog("Java目录",2);
		CatelogComponent mmallCourse1 = new Course("Java一期", 99);
		CatelogComponent mmallCourse2 = new Course("Java二期", 99);
		CatelogComponent mmallCourse3 = new Course("Java三期", 99);
		javaCourseCatelog.add(mmallCourse1);
		javaCourseCatelog.add(mmallCourse2);
		javaCourseCatelog.add(mmallCourse3);
		CatelogComponent mainCourseCatelog = new CourseCatelog("主目录",1);
		mainCourseCatelog.add(linuxCourse);
		mainCourseCatelog.add(windowsCourse);
		mainCourseCatelog.add(javaCourseCatelog);
		mainCourseCatelog.print();

	}
}
