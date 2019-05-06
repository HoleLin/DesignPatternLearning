package design.pattern.structural.facade;

/**
 * ClassName: GiftEXchageService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class GiftEXchageService {
	private QualifyService mQualifyService=new QualifyService();
	private PointPaymentService mPointPaymentService=new PointPaymentService();
	private ShippingService mShippingService =new ShippingService();


	public void giftExchage(PointGift pointGift) {
		if (mQualifyService.isAvailable(pointGift)) {
			// 资格校验通过
			if (mPointPaymentService.pay(pointGift)) {
				String shippingOrderNo = mShippingService.shipGift(pointGift);
				System.out.println("物流订单编号: " + shippingOrderNo);
			}
		}
	}
}
