package design.pattern.behavioral.chainofresponsibility;

/**
 * ClassName: CourseVidoeState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class Course {
	private String name;
	private String article;
	private String video;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
}
