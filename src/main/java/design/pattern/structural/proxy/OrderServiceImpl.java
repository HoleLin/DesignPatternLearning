package design.pattern.structural.proxy;

/**
 * ClassName: OrderServiceImpl
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class OrderServiceImpl implements IOrderService {

	private IOrderDao mIOrderDao;

	@Override
	public int saveOrder(Order order) {
		mIOrderDao = new OrderDaoImpl();
		System.out.println("Service层调用Dao层添加Order");
		return mIOrderDao.insert(order);
	}
}
