package design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * ClassName: VideoApprover
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class VideoApprover extends Approver {
	@Override
	public void deploy(Course course) {
		if (StringUtils.isNotEmpty(course.getVideo())) {
			System.out.println(course.getName() + "含有视频,批准");
			if (mApprover != null) {
				mApprover.deploy(course);
			}
		} else {
			System.out.println(course.getName() + "不含有视频,不批准,流程结束");
			return;
		}
	}
}
