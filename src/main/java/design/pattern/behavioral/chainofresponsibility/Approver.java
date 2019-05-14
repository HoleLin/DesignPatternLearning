package design.pattern.behavioral.chainofresponsibility;

/**
 * ClassName: Approver
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public abstract class Approver {
	protected Approver mApprover;

	public void setNextApprover(Approver approver) {
		this.mApprover = approver;
	}

	public abstract void deploy(Course course);
}
