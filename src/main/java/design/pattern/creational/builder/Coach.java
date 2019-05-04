package design.pattern.creational.builder;

/**
 * ClassName: Coach
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Coach {
	private CourseBuilder mCourseBuilder;

	public void setCourseBuilder(CourseBuilder courseBuilder) {
		mCourseBuilder = courseBuilder;
	}

	public Course makeCourse(String courseName,
	                         String coursePPT,
	                         String courseVideo,
	                         String courseArticle,
	                         String courseQA) {
		this.mCourseBuilder.buildCourseName(courseName);
		this.mCourseBuilder.buildCoursePPT(coursePPT);
		this.mCourseBuilder.buildCourseVideo(courseVideo);
		this.mCourseBuilder.buildCourseArticle(courseArticle);
		this.mCourseBuilder.buildCourseQA(courseQA);
		return this.mCourseBuilder.makeCourse();

	}
}
