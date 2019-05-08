package design.pattern.structural.composite;

/**
 * ClassName: Course
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Course extends CatelogComponent {
	private String courseName;
	private double price;

	public Course(String courseName, double price) {
		this.courseName = courseName;
		this.price = price;
	}

	@Override
	public String getName(CatelogComponent catelogComponent) {
		return this.courseName;
	}

	@Override
	public double getPrice(CatelogComponent catelogComponent) {
		return this.price;
	}

	@Override
	public void print() {
		System.out.println("CourseName: " + courseName + " CoursePrice: " + price);
	}
}
