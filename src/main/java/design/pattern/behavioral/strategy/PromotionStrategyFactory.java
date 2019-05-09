package design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: PromotionStrategyFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class PromotionStrategyFactory {
	private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXAIN, new FanXianPromotionStrategy());
	}

	private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

	private PromotionStrategyFactory() {
	}

	public static PromotionStrategy getInstance(String promotionKey) {
		PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
		return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
	}

	private interface PromotionKey {
		String LIJIAN = "LIJIAN";
		String FANXAIN = "FANXAIN";
		String MANJIAN = "MANJIAN";

	}
}
