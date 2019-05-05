package design.pattern.creational.singleton;

/**
 * ClassName: StaticInnerClassSingleton
 * 静态内部类实现单例模式
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class StaticInnerClassSingleton {
	private static class InnerClass {
		private static StaticInnerClassSingleton sStaticInnerClassSingleton = new StaticInnerClassSingleton();
	}

	private StaticInnerClassSingleton() {
		if (InnerClass.sStaticInnerClassSingleton != null) {
			throw new RuntimeException("单例构造器禁止反射调用");
		}
	}

	public static StaticInnerClassSingleton getInstance() {
		return InnerClass.sStaticInnerClassSingleton;
	}
}
