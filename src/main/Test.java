package main;


import java.io.IOException;
import java.util.Scanner;
import control.UserCome;
import examsys.Exammain;
import implement.UserComeImp;
import modle.User;
import relax.RelaxGame;
import studycont.StudyCont;

/**
 * 测试
 * @author 86186
 *
 */

public class Test {
	public static void main(String[] args) throws IOException {
		UserComeImp usercome =new UserCome();
		@SuppressWarnings("resource")
		int i=1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//创建用户
		User user = new User();
		while(i==1)
		{
			System.out.println("-----欢迎来到党史学习系统-----");
			System.out.println("1 我要登陆");
			System.out.println("2 我要注册");
			System.out.println("3 退出");
			System.out.print("请键入数字代表您的选择：");
			@SuppressWarnings("resource")
			String choice1 = sc.nextLine();
			switch (choice1) {
			case "1":
				// 登录
				System.out.println("---------欢迎登陆---------");
				System.out.print("请输入您的用户名：");
				String username = sc.nextLine();
				System.out.print("请输入您的密码:");
				String password = sc.nextLine();
				// 登陆成功
				if (usercome.isLogin(username, password)) {
					System.out.println("登陆成功！");
					i=0;
					break;
				}
				//登陆失败
				else {
					System.out.println("您的用户名或密码不正确，请重新登录");
					break;
				}
			case "2":
				// 注册
				System.out.println("---------欢迎注册---------");
				System.out.print("请输入您要设置的用户名：");
				String Username = sc.nextLine();
				System.out.print("请输入您的密码：");
				String Usercode = sc.nextLine();
				//设置信息
				user.setUserName(Username);
				user.setUserCode(Usercode);
				//注册
				usercome.regist(user);
				System.out.println("注册成功！");
				break;
			case "3":
				System.out.println("---------拜拜啦~---------");
				//直接退出
				System.exit(0);
				break;
			default:
				System.out.println("您的输入不合法哦~");
				}
			}
		int j=1;
		while(j==1)
		{
			System.out.println("-----欢迎来到党史学习系统系统-----");
			System.out.println("1 我要答题！！");
			System.out.println("2 我要学习！！");
			System.out.println("3 放松一下~");
			System.out.println("4 退出");
			System.out.print("请键入数字代表您的选择：");
			
			String choice2 = sc.nextLine();
			
			switch(choice2) {
			case"1":
				//答题
				Exammain.main(args);
				break;
			case"2":
				//学习
				StudyCont.main(args);
				break;
			case"3":
				//放松一下：猜数小游戏
				System.out.println("耍不耍猜数游戏？?(不想玩随便扣，想玩请扣1)");
				while (true) {
					String res = sc.nextLine();
					if (res.equals("1")) {
						RelaxGame.start();
						System.out.println("是否继续玩?（不想玩随便扣，想玩请扣1）");
					} else {
						break;
					}
				}
				System.out.println("欢迎下次再玩~");
				break;
			case"4":
				//退出
				System.out.println("--------拜拜啦---------");
				System.exit(0);
				break;
			default:
				System.out.println("输入不合法哦~");
			
		
			
				}
			}
		}
	}



