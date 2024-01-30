/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
import java.util.Scanner;
public class KJava33 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		System.out.print("一つ目のデータを入力してください-->");
		double a = stdin.nextDouble();
		System.out.print("二つ目のデータを入力してください-->");
		double b = stdin.nextDouble();
		dispMax(a,b);
		stdin.close();
	}
	
	static void dispMax(double d1,double d2) {
		double sub = d1 - d2;
		
		if (sub == 0) {
			System.out.printf("等しいです");
		}
		else if (sub > 0) {
			System.out.printf("第1引数の方が%fだけ大きい", sub);
		}
		else {
			System.out.printf("第2引数の方が%fだけ大きい", -sub);
		}
	}
}
