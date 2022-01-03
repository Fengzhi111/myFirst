package implement;

import modle.User;

public interface UserComeImp {
	/**
	 * 登录检测，成功true，失败false
	 * @param userName
	 * @param userCode
	 */
	public abstract boolean isLogin(String userName, String userCode);
	 
	/**
	 * 注册方法，将注册信息打包传入
	 * @param user
	 * 
	 */
	public abstract void regist(User user);

}
