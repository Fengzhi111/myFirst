package relax;

import java.util.Scanner;

/**
 * ������Ϸ
 * @author 86186
 *
 */
public class RelaxGame {
	
	private RelaxGame() {
	}
 
	public static void start() {
		int count = 0;
		boolean ifcontinue=true;
		// ����1~100֮��������
		int number = (int) (Math.random() * 100) + 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (ifcontinue) {
			System.out.println("��������µ�������1~100֮��໣�");
			// ��ȡ�µ�����
			int guessNumber = sc.nextInt();
			count++;
			// �ж��Ƿ���ȷ
			if(guessNumber!=0) {
				if (guessNumber < number) {
					System.out.println("��µ�����С��Ŷ~����0���˳���");
				} else if (guessNumber > number) {
					System.out.println("��µ����ִ���Ŷ~����0���˳���");
				}else{
					System.out.println("̫ţ������ֻ��" + count + "�ξͲ¶��ˣ�");
					break;
				}
				}else {
				ifcontinue=false;
			}
		}
	}


}
