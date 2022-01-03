package control;

import java.io.*;


import implement.UserComeImp;
import modle.User;
/**
 * 接口UserComeImp的实现类
 * 登陆注册
 * @author 86186
 *
 */

public class UserCome implements UserComeImp {
	//创建文件
	public static File file = new File("user.txt");
	//静态代码块
	static{
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //登录
	@Override
	public boolean isLogin(String userName, String passWord) {
        boolean flag=false;
        try{
            //创建高效字符输入流来读取数据
            @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("user.txt"));
            String line;
            while ((line=br.readLine())!=null) {
                String[] s=line.split(",");
                if (s[0].equals(userName)&&s[1].equals(passWord)) {
                    flag=true;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return flag;
    }

	@Override
	public void regist(User user) {
        try{
            //把用户信息存进文件里
            String info=user.getUserName()+","+user.getUserCode();
            //创建高效字符输出流来给文件写入数据，创建了一个可以追加写入的FileWriter，避免了文件中之前的用户信息被覆盖
            BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
            bw.write(info);
            bw.newLine();
            bw.flush();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
	

	


}
