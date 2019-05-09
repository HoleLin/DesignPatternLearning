package design.pattern.structural.proxy;

/**
 * ClassName: OrderDaoImpl
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class OrderDaoImpl implements IOrderDao {
	@Override
	public int insert(Order order) {
		System.out.println("Dao层添加Order成功");
		return 1;
	}
}
