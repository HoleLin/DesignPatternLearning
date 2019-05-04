package design.pattern.creational.abstractfactory;

/**
 * ClassName: PythonCourseFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class PythonCourseFactory implements ICourseFactory {
	@Override
	public Video getVideo() {
		return new PythonVideo();
	}

	@Override
	public Article getArticle() {
		return new PythonArticle();
	}
}
