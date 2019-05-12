package design.pattern.behavioral.memento;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Test {
	public static void main(String[] args) {
		ArticleMementoManager articleMementoManager = new ArticleMementoManager();
		Article article = new Article("设计模式1", "备忘录模式1", "图片1");
		// 暂存
		ArticleMemento articleMemento = article.saveToMemento();
		articleMementoManager.addMemento(articleMemento);

		System.out.println("标题:" + article.getTitle() + " 内容:" + article.getContent() + " 图片:" + article.getImgs());
		System.out.println("手记完整信息: " + article);

		System.out.println("修改手记start");
		article.setTitle("设计模式2");
		article.setContent("备忘录模式2");
		article.setImgs("图片2");
		System.out.println("修改手记end");
		System.out.println("手记完整信息: " + article);

		// 暂存
		articleMemento = article.saveToMemento();
		articleMementoManager.addMemento(articleMemento);

		article.setTitle("设计模式3");
		article.setContent("备忘录模式3");
		article.setImgs("图片3");
		System.out.println("手记完整信息: " + article);

		// 暂存回退
		System.out.println("暂存回退start");
		System.out.println("回退一次");
		articleMemento = articleMementoManager.getMemento();
		article.undoFromMemento(articleMemento);

		System.out.println("回退两次");
		articleMemento = articleMementoManager.getMemento();
		article.undoFromMemento(articleMemento);

		System.out.println("暂存回退end");


		System.out.println("手记完整信息: " + article);


	}
}
