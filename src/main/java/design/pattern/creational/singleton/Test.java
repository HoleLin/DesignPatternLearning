package design.pattern.creational.singleton;

import org.aspectj.weaver.ClassAnnotationValue;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

		// 多线程测试单例模式
		Thread t1 = new Thread(new T());
		Thread t2 = new Thread(new T());
		t1.start();
		t2.start();
		System.out.println(" END ");

		/*
		// 序列化与反序列化测试单例模式
		HungrySingleton instance = HungrySingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("singleton_file"));
		oos.writeObject(instance);
		File file = new File("singleton_file");
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file)
		);
		HungrySingleton newInstance = (HungrySingleton) ois.readObject();
		System.out.println("instance = " + instance);
		System.out.println("newInstance = " + newInstance);
		System.out.println(instance == newInstance);
		*/
		// 反射测试单例模式
		// 饿汉式测试
//		Class objectClass = HungrySingleton.class;
		// 静态内部式测试
//		Class objectClass = StaticInnerClassSingleton.class;
//		Class objectClass = LazySingleton.class;
//		Constructor constructor = objectClass.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		LazySingleton instance = LazySingleton.getInstance();
//		LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//		StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//		StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//		HungrySingleton instance = HungrySingleton.getInstance();
//		HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//		System.out.println("newInstance = " + newInstance);
//		System.out.println("instance = " + instance);
//		System.out.println(instance == newInstance);
		/*
		结果：
		newInstance = design.pattern.creational.singleton.HungrySingleton@34a245ab
		instance = design.pattern.creational.singleton.HungrySingleton@7cc355be
		false
		*/

		// 序列化与反序列化测试枚举类单例模式
//		EnumInstance instance = EnumInstance.getInstance();
//		instance.setData(new Object());
//		ObjectOutputStream oos = new ObjectOutputStream(
//				new FileOutputStream("singleton_file"));
//		oos.writeObject(instance);
//		File file = new File("singleton_file");
//		ObjectInputStream ois = new ObjectInputStream(
//				new FileInputStream(file)
//		);
//		EnumInstance newInstance = (EnumInstance) ois.readObject();
//		System.out.println("instance = " + instance.getData());
//		System.out.println("newInstance = " + newInstance.getData());
//		System.out.println(instance.getData() == newInstance.getData());

		// 反射测试单例模式
		// 枚举类测试
//		Class objectClass = EnumInstance.class;
//		Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//		constructor.setAccessible(true);
//		EnumInstance instance = EnumInstance.getInstance();
//		EnumInstance newInstance = (EnumInstance) constructor.newInstance("HoleLin", 666);
//		System.out.println("newInstance = " + newInstance);
//		System.out.println("instance = " + instance);
//		System.out.println(instance == newInstance);

//		EnumInstance enumInstance=EnumInstance.getInstance();
//		enumInstance.printTest();
	}
}
