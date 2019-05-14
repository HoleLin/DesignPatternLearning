package design.pattern.behavioral.visitor;

/**
 * ClassName: CodingCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */


public class CodingCourse extends Course {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
