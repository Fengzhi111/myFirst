package studycont;

import java.io.*;
import java.util.Scanner;
/**
 * 党史学习
 * @author 86186
 *
 */

public class StudyCont {
	
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("1 人物长廊");
		System.out.println("2 重要事件");
		System.out.println("3 重要会议");
		System.out.print("请键入数字代表您的选择：");
		
		String choice = input.nextLine();
		
		switch(choice) {
		case"1":
			File ctoFile1 = new File("renwu.txt");
			InputStreamReader rdCto1 = new InputStreamReader(new FileInputStream(ctoFile1));
			BufferedReader bfReader1 = new BufferedReader(rdCto1);

			String txtline1 = null;
			//输出文件内容
			while ((txtline1 = bfReader1.readLine()) != null) {
				System.out.println(txtline1);
			}
			bfReader1.close();
			System.out.println("0 返回");
			System.out.println("2 继续学习");
			System.out.print("请键入数字代表您的选择：");
			String choice1 = input.nextLine();
			//输入零返回
			if(choice1.equals("0")) {break;}
		case"2":
			File ctoFile2 = new File("shijian.txt");
			InputStreamReader rdCto2 = new InputStreamReader(new FileInputStream(ctoFile2));
			BufferedReader bfReader2 = new BufferedReader(rdCto2);

			String txtline2 = null;

			while ((txtline2 = bfReader2.readLine()) != null) {
				System.out.println(txtline2);
			}
			
			bfReader2.close();
			System.out.println("0 返回");
			System.out.println("2 继续学习");
			System.out.print("请键入数字代表您的选择：");
			String choice2 = input.nextLine();
			if(choice2.equals("0")) {break;}
			
		case"3":
			File ctoFile3 = new File("huiyi.txt");
			InputStreamReader rdCto3 = new InputStreamReader(new FileInputStream(ctoFile3));
			BufferedReader bfReader3 = new BufferedReader(rdCto3);

			String txtline3 = null;
			while ((txtline3 = bfReader3.readLine()) != null) {
				System.out.println(txtline3);
			}
			
			bfReader3.close();
			break;
			
		}
		
		


		
		};
}

