package modle;


/**
 * 用户
 */

public class User{

	/**
	 * 用户昵称
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String userCode;

	//构造方法
	public User() {
		super();
	}
	public User(String userName, String userCode) {
		super();
		this.userName = userName;
		this.userCode = userCode;
	}
	
	//setter and getter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


}
	


