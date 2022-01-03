package examsys;
import java.io.*;
/**
 * 答题系统
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
        //匹配答案
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
            	//非【答案】行直接输出
                if(s.startsWith("【答案】")==false){
                    System.out.println(s);
                }else {
                	//在答案处停留，因为要在此输入答案
                    String CorrAnswer="";
                    //查找正确答案
                    matcher=pattern.matcher(s);
                    while(matcher.find()){
                    	CorrAnswer+=matcher.group();
                    }
                    //键入自己的答案
                    String selfAnswer=scanner.nextLine();
                    if(selfAnswer.equals("0")) {
                    	//输入零终止答题返回上级
                    	break;
                    }else if(selfAnswer.equals(CorrAnswer)){
                        System.out.println("------回答正确------\n（温馨提示：输入0可退出作答，答案中请不要输入任何多余空格");
                
                        
                    }else{
                        System.out.println("------回答错误------\n（温馨提示：输入0可退出作答，答案中请不要输入任何多余空格）");
                        //答案错误输出正确答案
                        System.out.println("正确答案："+CorrAnswer);
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

