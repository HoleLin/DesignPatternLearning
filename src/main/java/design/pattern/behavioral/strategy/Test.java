package design.pattern.behavioral.strategy;


public class Test {
	public static void main(String[] args) {
		String promotionKey = "MANJIAN";
		PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getInstance(promotionKey));
		promotionActivity.executePromotionStrategy();
	}
}
