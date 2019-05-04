package design.pattern.creational.builder;

/**
 * ClassName: CourseBuilder
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public abstract class CourseBuilder {

	public abstract void buildCourseName(String courseName);

	public abstract void buildCoursePPT(String coursePPT);

	public abstract void buildCourseVideo(String courseVideo);

	public abstract void buildCourseArticle(String courseArticle);

	public abstract void buildCourseQA(String courseQA);
	public abstract Course makeCourse();




}
