package design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;


public class Test {
	public static void main(String[] args) {
		Child child = new Child();
		Map map = new HashMap();
		child.method(map);
		System.out.println("========================");
		Base base = new Child();
		HashMap hashMap = new HashMap();
		base.method(hashMap);
	}
}
