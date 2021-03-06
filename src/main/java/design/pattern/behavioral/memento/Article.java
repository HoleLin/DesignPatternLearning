package design.pattern.behavioral.memento;

/**
 * ClassName: ArticleApprover
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Article {
	private String title;
	private String content;
	private String imgs;

	public Article(String title, String content, String imgs) {
		this.title = title;
		this.content = content;
		this.imgs = imgs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgs() {
		return imgs;
	}

	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	public ArticleMemento saveToMemento() {
		ArticleMemento articleMemento = new ArticleMemento(this.title, this.content, this.imgs);
		return articleMemento;
	}

	public void undoFromMemento(ArticleMemento articleMemento) {
		this.title = articleMemento.getTitle();
		this.content = articleMemento.getContent();
		this.imgs = articleMemento.getImgs();
	}

	@Override
	public String toString() {
		return "ArticleApprover{" +
				"title='" + title + '\'' +
				", content='" + content + '\'' +
				", imgs='" + imgs + '\'' +
				'}';
	}
}
