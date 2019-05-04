package design.pattern.creational.builder;

/**
 * ClassName: CourseActualBuilder
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class CourseActualBuilder extends CourseBuilder {
	private Course mCourse = new Course();

	@Override
	public void buildCourseName(String courseName) {
		mCourse.setCourseName(courseName);
	}

	@Override
	public void buildCoursePPT(String coursePPT) {
		mCourse.setCoursePPT(coursePPT);
	}

	@Override
	public void buildCourseVideo(String courseVideo) {
		mCourse.setCourseVideo(courseVideo);
	}

	@Override
	public void buildCourseArticle(String courseArticle) {
		mCourse.setCourseArticle(courseArticle);
	}

	@Override
	public void buildCourseQA(String courseQA) {
		mCourse.setCourseQA(courseQA);
	}

	@Override
	public Course makeCourse() {
		return mCourse;
	}
}
