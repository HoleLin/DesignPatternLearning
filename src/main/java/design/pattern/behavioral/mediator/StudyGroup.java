package design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * ClassName: StudyGroup
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class StudyGroup {
	public static void showMessage(User user,String message){
		System.out.println(new Date().toString()+" ["+user.getName()+"] "+message);
	}
}
