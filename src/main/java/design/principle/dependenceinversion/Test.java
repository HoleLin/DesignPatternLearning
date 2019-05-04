package design.principle.dependenceinversion;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class Test {
	//v1
//    public static void main(String[] args) {
//        HoleLin holeLin = new HoleLin();
//        holeLin.studyJavaCourse();
//        holeLin.studyFECourse();
//    }

	//v2
//    public static void main(String[] args) {
//        HoleLin holeLin = new HoleLin();
//        holeLin.studyImoocCourse(new JavaCourse());
//        holeLin.studyImoocCourse(new FECourse());
//        holeLin.studyImoocCourse(new PythonCourse());
//    }

	//v3 构造器注入
//    public static void main(String[] args) {
//        HoleLin holeLin = new HoleLin(new JavaCourse());
//        holeLin.studyImoocCourse();
//    }
	//v4
	public static void main(String[] args) {
		HoleLin holeLin=new HoleLin();
		holeLin.setICourse(new JavaCourse());
		holeLin.studyCourse();
		holeLin.setICourse(new PythonCourse());
		holeLin.studyCourse();

	}
}
