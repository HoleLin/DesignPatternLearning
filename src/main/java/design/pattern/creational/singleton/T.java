package design.pattern.creational.singleton;

/**
 * ClassName: T
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class T implements Runnable {
	@Override
	public void run() {
//		LazySingleton lazySingleton = LazySingleton.getInstance();
//		System.out.println(Thread.currentThread().getName() + " " + lazySingleton);

//		StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
//		System.out.println(Thread.currentThread().getName() + " " + staticInnerClassSingleton);

//		ContainerSingleton.register("Object", new Object());
//		Object instance = ContainerSingleton.getInstance("Object");
//		System.out.println(Thread.currentThread().getName() + " " + instance);
		ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
		System.out.println(Thread.currentThread().getName() + " " + instance);

	}
}
