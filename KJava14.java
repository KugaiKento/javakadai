/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

import java.util.Scanner;

/**
 * 
 */
public class KJava14 {

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
		if (data2%data1==0) {
			System.out.printf("%dは%dの約数です",data1,data2);
		}
		else {
			System.out.printf("%dは%dの約数ではありません",data1,data2);
		}
		stdin.close();
	}
}
