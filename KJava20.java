/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava20 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int data1, data2;
		int sum = 0;
		System.out.print("最初の値を入力してください-->");
		data1 = Integer.parseInt(stdin.nextLine());
		System.out.print("最後の値を入力してください-->");
		data2 = Integer.parseInt(stdin.nextLine());
		if (data1 < data2) {
			for (int i = data1; i <= data2; i++) {
				sum += i;
			}
			System.out.printf("%dから%dまでの和は%dです", data1, data2,sum);
		}
		else {
			System.out.print("値に問題があります");
		}
		stdin.close();
	}
}
