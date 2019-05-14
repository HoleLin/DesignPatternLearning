package design.pattern.behavioral.chainofresponsibility;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class Test {
	public static void main(String[] args) {
		Approver articleApprover = new ArticleApprover();
		Approver videoApprover = new VideoApprover();
		Course course = new Course();
		course.setName("设计模式");
		course.setArticle("设计模式手记");
		course.setVideo("设计模式视频");
		articleApprover.setNextApprover(videoApprover);
		articleApprover.deploy(course);

	}
}
