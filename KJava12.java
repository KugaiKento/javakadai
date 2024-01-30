/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava12 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int data1, data2;
		System.out.print("整数値を入力してください-->");
		data1 = Integer.parseInt(stdin.nextLine());
		data2 = data1>=0 ? data1 : -data1;
		System.out.printf("data1:%d, data2:%d", data1, data2);
		stdin.close();
	}
}
