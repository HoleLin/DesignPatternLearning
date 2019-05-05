package design.pattern.creational.singleton;

/**
 * ClassName: ThreadLocalInstance
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class ThreadLocalInstance {
	private static final ThreadLocal<ThreadLocalInstance> sThreadLocalInstance = new ThreadLocal<ThreadLocalInstance>() {
		@Override
		protected ThreadLocalInstance initialValue() {
			return super.initialValue();
		}
	};

	private ThreadLocalInstance() {

	}

	public static ThreadLocalInstance getInstance() {
		return sThreadLocalInstance.get();
	}
}
