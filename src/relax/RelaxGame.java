package relax;

import java.util.Scanner;

/**
 * 猜数游戏
 * @author 86186
 *
 */
public class RelaxGame {
	
	private RelaxGame() {
	}
 
	public static void start() {
		int count = 0;
		boolean ifcontinue=true;
		// 产生1~100之间的随机数
		int number = (int) (Math.random() * 100) + 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (ifcontinue) {
			System.out.println("请输入你猜的数：（1~100之间嗷）");
			// 读取猜到的数
			int guessNumber = sc.nextInt();
			count++;
			// 判断是否正确
			if(guessNumber!=0) {
				if (guessNumber < number) {
					System.out.println("你猜的数字小了哦~（扣0可退出）");
				} else if (guessNumber > number) {
					System.out.println("你猜的数字大了哦~（扣0可退出）");
				}else{
					System.out.println("太牛啦！你只用" + count + "次就猜对了！");
					break;
				}
				}else {
				ifcontinue=false;
			}
		}
	}


}
