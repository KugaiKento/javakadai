/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava11 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int data1;
		System.out.print("整数値を入力してください-->");
		data1 = Integer.parseInt(stdin.nextLine());
		int a = data1 << 3;
		int b = data1 <<1;
		System.out.printf("%d×10=%d", data1, a+b);
		stdin.close();
	}
}
