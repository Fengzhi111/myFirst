package modle;


/**
 * �û�
 */

public class User{

	/**
	 * �û��ǳ�
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String userCode;

	//���췽��
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
	


