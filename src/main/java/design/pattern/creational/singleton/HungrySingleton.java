package design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * ClassName: HungrySingleton
 * 饿汉式单例模式
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class HungrySingleton implements Serializable {
	private static final HungrySingleton sHungrySingleton = new HungrySingleton();

	private HungrySingleton() {
		if (sHungrySingleton != null) {
			throw new RuntimeException("单例构造器禁止反射调用");
		}
	}

	public static HungrySingleton getInstance() {
		return sHungrySingleton;
	}

	/**
	 * 针对序列化和反序列化破坏单例模式的解决方案
	 *
	 * @return
	 */
	private Object readResolve() {
		return sHungrySingleton;
	}
}
