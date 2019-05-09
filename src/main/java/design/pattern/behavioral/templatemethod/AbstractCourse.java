package design.pattern.behavioral.templatemethod;

/**
 * ClassName: AbstractCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public abstract class AbstractCourse {
	protected final void makeCourse() {
		this.makePPT();
		this.makeVideo();
		if (needWriteArticle()) {
			this.writeArticle();
		}
		this.packageCourse();
	}

	final void makePPT() {
		System.out.println("制作PPT");
	}

	final void makeVideo() {
		System.out.println("制作视频");
	}

	final void writeArticle() {
		System.out.println("编写手记");
	}

	/**
	 * 钩子方法
	 * 是否需要手记
	 *
	 * @return
	 */
	protected boolean needWriteArticle() {
		return false;
	}

	abstract void packageCourse();

}
