package design.pattern.structural.facade;

/**
 * ClassName: QualifyService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class QualifyService {
	public boolean isAvailable(PointGift pointGift) {
		System.out.println("校验" + pointGift.getName() + " 积分资格通过");
		return true;
	}
}
