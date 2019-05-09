package design.pattern.behavioral.strategy;

/**
 * ClassName: EmptyPromotionStrategy
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class EmptyPromotionStrategy implements PromotionStrategy {
	@Override
	public void doPromotion() {
		System.out.println("无促销活动");
	}
}
