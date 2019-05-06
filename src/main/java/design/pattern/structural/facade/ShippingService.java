package design.pattern.structural.facade;

/**
 * ClassName: ShippingService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class ShippingService {
	public String shipGift(PointGift pointGift) {
		// 物流系统的对接逻辑
		System.out.println(pointGift.getName() + "进入物流系统");
		String shippingOrderNo = "666";
		return shippingOrderNo;
	}
}
