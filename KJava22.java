/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava22 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		double sum = 0, value; 
		System.out.print("データを入力してください-->");
		while(stdin.hasNextDouble()) {
			value = stdin.nextDouble();
			sum += value;
			System.out.print("データを入力してください-->");
		}
		System.out.printf("合計は%fです", sum);
		stdin.close();
	}
}
