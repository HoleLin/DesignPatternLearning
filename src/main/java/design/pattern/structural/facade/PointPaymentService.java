package design.pattern.structural.facade;

/**
 * ClassName: PointPaymentService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class PointPaymentService {
	public boolean pay(PointGift pointGift) {
		// 扣减积分
		System.out.println("支付" + pointGift.getName() + "成功");
		return true;
	}
}
