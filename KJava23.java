/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava23 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int value, count = 1; 
		System.out.print("データを入力してください-->");
		value = Integer.parseInt(stdin.nextLine());
		while(value >= 0) {
			System.out.print("データを入力してください-->");
			value = Integer.parseInt(stdin.nextLine());
			count++;
		}
		System.out.printf("%d回目で入力されました", count);
		stdin.close();
	}
}
