package design.pattern.creational.prototype;

/**
 * ClassName: Mail
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class Mail implements Cloneable{
	private String name;
	private String emailAddress;
	private String content;

	public Mail() {
		System.out.println("Mail default Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone mail test");
		return super.clone();

	}

	@Override
	public String toString() {
		return "Mail{" +
				"name='" + name + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
