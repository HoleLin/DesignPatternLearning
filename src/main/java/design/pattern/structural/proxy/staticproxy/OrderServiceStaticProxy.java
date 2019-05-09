package design.pattern.structural.proxy.staticproxy;

import design.pattern.structural.proxy.IOrderService;
import design.pattern.structural.proxy.Order;
import design.pattern.structural.proxy.OrderServiceImpl;
import design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * ClassName: OrderServiceStaticProxy
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class OrderServiceStaticProxy {
	private IOrderService mIOrderService;

	public int saveOrder(Order order) {
		beforeMethod(order);
		mIOrderService = new OrderServiceImpl();
		int result = mIOrderService.saveOrder(order);
		afterMethod();
		return result;
	}

	private void beforeMethod(Order order) {
		Integer userId = order.getUserId();
		int dbRouter = userId % 2;
		System.out.println("静态代理分配到 [db" + dbRouter + "] 处理数据");
		// TODO: 2019/5/9 设置dataSource;
		DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
		System.out.println("静态代理 before code");
	}

	private void afterMethod() {
		System.out.println("静态代理 after code");
	}
}
