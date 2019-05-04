package design.principle.openclose;

import design.principle.openclose.ICourse;
import design.principle.openclose.JavaCourse;
import design.principle.openclose.JavaDiscountCourse;

/**
 * ClassName: design.principle.openclose.Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class Test {
	public static void main(String[] args) {
		ICourse iCourse = new JavaDiscountCourse(96, "JavaSSM从入门到实战", 348d);
		JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
		System.out.println("ID: " + javaCourse.getID() +
				" Name: " + javaCourse.getName() +
				" OriginPrice: " + javaCourse.getOriginPrice() +
				" NowPrice: " + javaCourse.getPrice());
	}
}
