package design.principle.openclose;

/**
 * InterfaceName: ICourse
 * 课程接口
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */
public interface ICourse {
	/**
	 * 获取课程编号
	 *
	 * @return 课程编号
	 */
	Integer getID();

	/**
	 * 获取课程名字
	 *
	 * @return 课程名字
	 */
	String getName();

	/**
	 * 获取课程价格
	 *
	 * @return 课程价格
	 */
	Double getPrice();
}
