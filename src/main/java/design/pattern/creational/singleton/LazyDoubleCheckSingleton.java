package design.pattern.creational.singleton;

/**
 * ClassName: LazyDoubleCheckSingleton
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class LazyDoubleCheckSingleton {
	private volatile static LazyDoubleCheckSingleton sLazyDoubleCheckSingleton = null;

	private LazyDoubleCheckSingleton() {
	}

	public static LazyDoubleCheckSingleton getInstance() {

		if (sLazyDoubleCheckSingleton == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (sLazyDoubleCheckSingleton == null) {
					// 指令重排序
					// 1. 分配内存给这个对象
					// 2. 初始化对象
					// 3. 设置 sLazyDoubleCheckSingleton 指向刚刚分配的内存地址
					sLazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
				}
			}
		}
		return sLazyDoubleCheckSingleton;
	}
}
