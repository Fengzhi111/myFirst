package examsys;
import java.io.*;
/**
 * ����ϵͳ
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modle.User;

public class Examm{
    File testFile;
    
    public void setTestFile(File f){
        testFile=f;
    }
    public void startExam(){
        @SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
        //ƥ���
        Pattern pattern=Pattern.compile("[A-Z]");
        Matcher matcher;
        @SuppressWarnings("unused")
		User user = new User();
        try {
            FileReader inOne=new FileReader(testFile);
            @SuppressWarnings("resource")
			BufferedReader inTwo=new BufferedReader(inOne);
            String s;
            while((s=inTwo.readLine())!=null){
            	//�ǡ��𰸡���ֱ�����
                if(s.startsWith("���𰸡�")==false){
                    System.out.println(s);
                }else {
                	//�ڴ𰸴�ͣ������ΪҪ�ڴ������
                    String CorrAnswer="";
                    //������ȷ��
                    matcher=pattern.matcher(s);
                    while(matcher.find()){
                    	CorrAnswer+=matcher.group();
                    }
                    //�����Լ��Ĵ�
                    String selfAnswer=scanner.nextLine();
                    if(selfAnswer.equals("0")) {
                    	//��������ֹ���ⷵ���ϼ�
                    	break;
                    }else if(selfAnswer.equals(CorrAnswer)){
                        System.out.println("------�ش���ȷ------\n����ܰ��ʾ������0���˳����𣬴����벻Ҫ�����κζ���ո�");
                
                        
                    }else{
                        System.out.println("------�ش����------\n����ܰ��ʾ������0���˳����𣬴����벻Ҫ�����κζ���ո�");
                        //�𰸴��������ȷ��
                        System.out.println("��ȷ�𰸣�"+CorrAnswer);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 
    }
 
 
}

