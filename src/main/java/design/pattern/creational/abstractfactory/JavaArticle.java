package design.pattern.creational.abstractfactory;

/**
 * ClassName: JavaArticle
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class JavaArticle extends Article {
	@Override
	public void produce() {
		System.out.println("编写Java手记");
	}
}
