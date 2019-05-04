package design.pattern.creational.abstractfactory;


/**
 * ClassName: ICourseFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public interface ICourseFactory {
	Video getVideo();
	Article getArticle();

}
