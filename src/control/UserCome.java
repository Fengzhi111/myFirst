package control;

import java.io.*;


import implement.UserComeImp;
import modle.User;
/**
 * �ӿ�UserComeImp��ʵ����
 * ��½ע��
 * @author 86186
 *
 */

public class UserCome implements UserComeImp {
	//�����ļ�
	public static File file = new File("user.txt");
	//��̬�����
	static{
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //��¼
	@Override
	public boolean isLogin(String userName, String passWord) {
        boolean flag=false;
        try{
            //������Ч�ַ�����������ȡ����
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
            //���û���Ϣ����ļ���
            String info=user.getUserName()+","+user.getUserCode();
            //������Ч�ַ�����������ļ�д�����ݣ�������һ������׷��д���FileWriter���������ļ���֮ǰ���û���Ϣ������
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
