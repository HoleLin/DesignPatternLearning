package design.pattern.behavioral.observer;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Test {
	public static void main(String[] args) {
		Course course = new Course("Java设计模式");
		Teacher teacher = new Teacher("Alpha");
		course.addObserver(teacher);

		// 业务逻辑代码
		Question question = new Question();
		question.setUserName("HoleLin");
		question.setQuestionContent("如何正确使用观察者模式?");
		course.produceQuestion(course, question);
	}
}
