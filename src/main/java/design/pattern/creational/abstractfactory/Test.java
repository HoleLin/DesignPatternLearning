package design.pattern.creational.abstractfactory;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Test {
	public static void main(String[] args) {
		ICourseFactory courseFactory = new JavaCourseFactory();
		Video video = courseFactory.getVideo();
		Article article = courseFactory.getArticle();
		video.produce();
		article.produce();
	}
}
