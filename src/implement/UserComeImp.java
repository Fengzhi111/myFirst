package implement;

import modle.User;

public interface UserComeImp {
	/**
	 * ��¼��⣬�ɹ�true��ʧ��false
	 * @param userName
	 * @param userCode
	 */
	public abstract boolean isLogin(String userName, String userCode);
	 
	/**
	 * ע�᷽������ע����Ϣ�������
	 * @param user
	 * 
	 */
	public abstract void regist(User user);

}
