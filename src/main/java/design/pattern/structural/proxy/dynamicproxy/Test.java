package design.pattern.structural.proxy.dynamicproxy;

import design.pattern.structural.proxy.IOrderService;
import design.pattern.structural.proxy.Order;
import design.pattern.structural.proxy.OrderServiceImpl;

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
		IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
		orderService.saveOrder(order);
	}
}
