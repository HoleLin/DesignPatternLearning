package design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * ClassName: ArticleMementoManager
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class ArticleMementoManager {
	private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

	public ArticleMemento getMemento() {
		ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
		return articleMemento;
	}

	public void addMemento(ArticleMemento articleMemento) {
		ARTICLE_MEMENTO_STACK.push(articleMemento);
	}


}
