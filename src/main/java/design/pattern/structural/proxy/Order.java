package design.pattern.structural.proxy;

/**
 * ClassName: Order
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class Order {
	private Object orderInfo;
	private Integer userId;

	public Object getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
