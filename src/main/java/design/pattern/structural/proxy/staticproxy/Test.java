package design.pattern.structural.proxy.staticproxy;

import design.pattern.structural.proxy.Order;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class Test {
	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(2);
		OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
		orderServiceStaticProxy.saveOrder(order);
	}
}
