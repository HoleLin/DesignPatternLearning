package design.pattern.structural.flyweight;

/**
 * ClassName: Manager
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Manager implements Employee {
	@Override
	public void report() {
		System.out.println(reportContent);
	}

	/**
	 * 内部状态
	 */
	private String title = "部门经理";
	/**
	 * 外部状态 是外部传入的
	 */
	private String department;
	private String reportContent;

	public Manager(String department) {
		this.department = department;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
}
