package design.pattern.behavioral.observer;

/**
 * ClassName: Question
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Question {
	private String userName;
	private String questionContent;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
}
