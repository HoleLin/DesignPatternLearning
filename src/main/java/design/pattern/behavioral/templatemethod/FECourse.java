package design.pattern.behavioral.templatemethod;

/**
 * ClassName: FECourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class FECourse extends AbstractCourse {
	private boolean needWriteArticleFlag = false;

	@Override
	void packageCourse() {
		System.out.println("提供课程前端代码");
		System.out.println("提供课程的图片等多媒体素材");
	}

	public FECourse(boolean needWriteArticleFlag) {
		this.needWriteArticleFlag = needWriteArticleFlag;
	}

	@Override
	protected boolean needWriteArticle() {
		return needWriteArticleFlag;
	}
}
