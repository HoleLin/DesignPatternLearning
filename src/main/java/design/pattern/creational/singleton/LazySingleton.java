package design.pattern.creational.singleton;

/**
 * ClassName: LazySingleton
 * 懒汉式单例模式
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class LazySingleton {
	private static LazySingleton sLazySingleton = null;

	private LazySingleton() {
		if (sLazySingleton != null) {
			throw new RuntimeException("单例构造器禁止反射调用");
		}
	}

//	public static LazySingleton getInstance() {
//		// 线程不安全
//		// 当有两个线程进入该方法
//		// 线程A执行到"if (sLazySingleton == null)"后发现sLazySingleton为空则进入if准备执行"sLazySingleton = new LazySingleton();"
//		// 此时线程B也执行到"if (sLazySingleton == null)"而线程A此时"sLazySingleton = new LazySingleton();"这行代码还没执行,
//		// 所以线程B也进入if准备执行"sLazySingleton = new LazySingleton();"
//		// 此时"sLazySingleton = new LazySingleton();"被执行了两次,导致sLazySingleton并不是单例
//		if (sLazySingleton == null) {
//			sLazySingleton = new LazySingleton();
//		}
//		return sLazySingleton;
//	}

	/**
	 * 使用 synchronized 关键字
	 *
	 * @return
	 */
	public synchronized static LazySingleton getInstance() {
		if (sLazySingleton == null) {
			sLazySingleton = new LazySingleton();
		}
		return sLazySingleton;
	}
}
