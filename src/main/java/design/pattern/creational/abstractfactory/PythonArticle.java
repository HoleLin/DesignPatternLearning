package design.pattern.creational.abstractfactory;

/**
 * ClassName: PythonArticle
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class PythonArticle extends Article {
	@Override
	public void produce() {
		System.out.println("编写Python手记");

	}
}
