package design.principle.openclose;

/**
 * ClassName: JavaCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class JavaCourse implements ICourse {

	private Integer id;
	private String name;
	private Double price;

	public JavaCourse() {
	}

	public JavaCourse(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "JavaCourse{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}

