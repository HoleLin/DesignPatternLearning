package design.pattern.creational.singleton;

/**
 * ClassName: EnumInstance
 * 枚举类实现单例模式
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public enum EnumInstance {
	INSTANCE {
		@Override
		protected void printTest() {
			System.out.println("Print Test");
		}
	};

	protected abstract void printTest();

	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static EnumInstance getInstance() {
		return INSTANCE;
	}
}
