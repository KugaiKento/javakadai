/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava15 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int data1, data2;
		System.out.print("1つ目の整数値を入力してください-->");
		data1 = Integer.parseInt(stdin.nextLine());
		System.out.print("2つ目の整数値を入力してください-->");
		data2 = Integer.parseInt(stdin.nextLine());
		if (data1 > data2) {
			System.out.print("1つ目のデータの方が大きいです。");
		}
		else if (data1 < data2) {
			System.out.print("2つ目のデータの方が大きいです。");
		}
		else {
			System.out.print("等しいです。");
		}
		stdin.close();
	}
}
