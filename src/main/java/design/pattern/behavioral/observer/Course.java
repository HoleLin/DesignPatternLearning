package design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * ClassName: CourseVidoeState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Course extends Observable {
	private String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void produceQuestion(Course course, Question question) {
		System.out.println(question.getUserName() + "在" + course.courseName + "提出一个问题");
		// 改变了主题状态
		setChanged();
		notifyObservers(question);
	}
}
