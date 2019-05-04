package design.principle.openclose;

/**
 * ClassName: JavaDiscountCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class JavaDiscountCourse extends JavaCourse {
	public JavaDiscountCourse(Integer id, String name, Double price) {
		super(id, name, price);
	}

	public Double getOriginPrice() {
		return super.getPrice();
	}

	@Override
	public Double getPrice() {
		return super.getPrice() * 0.8;
	}

}
