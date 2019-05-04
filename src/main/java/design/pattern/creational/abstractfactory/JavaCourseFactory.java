package design.pattern.creational.abstractfactory;

/**
 * ClassName: JavaCourseFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class JavaCourseFactory implements ICourseFactory {
	@Override
	public Video getVideo() {
		return new JavaVideo();
	}

	@Override
	public Article getArticle() {
		return new JavaArticle();
	}
}
