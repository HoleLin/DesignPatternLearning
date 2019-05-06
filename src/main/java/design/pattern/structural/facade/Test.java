package design.pattern.structural.facade;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class Test {
	public static void main(String[] args) {
		PointGift pointGift = new PointGift("T恤");
		GiftEXchageService giftEXchageService = new GiftEXchageService();
		giftEXchageService.giftExchage(pointGift);

	}
}
