package design.pattern.structural.proxy.dynamicproxy;

import design.pattern.structural.proxy.Order;
import design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: OrderServiceDynamicProxy
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class OrderServiceDynamicProxy implements InvocationHandler {
	private Object target;

	public OrderServiceDynamicProxy(Object target) {
		this.target = target;
	}

	public Object bind() {
		Class cls = target.getClass();
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				cls.getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object argObject = args[0];
		beforeMethod(argObject);
		Object object = method.invoke(target, args);
		afterMethod();
		return object;
	}

	private void beforeMethod(Object obj) {
		int userId = 0;
		System.out.println("动态代理 before code");
		if (obj instanceof Order) {
			Order order = (Order) obj;
		}
		int dbRouter = userId % 2;
		System.out.println("动态代理分配到 [db" + dbRouter + "] 处理数据");
		// TODO: 2019/5/9 设置dataSource;
		DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));

	}

	private void afterMethod() {
		System.out.println("动态代理 after code");
	}
}
