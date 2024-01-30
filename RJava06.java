/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class RJava06 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int Data;
		try (Scanner stdin = new Scanner(System.in)) {
			System.out.printf("整数値を入力してください-->");
			Data = stdin.nextInt();
		}
		if (Data<0) {
			System.out.printf("負の数です");
			
		}else if (Data>0) {
			System.out.printf("正の数で");
			if (Data%7==0) {
				System.out.printf("7の倍数です");
			}else {
				System.out.printf("7の倍数ではありません");
			}
		}else {
			System.out.printf("0です");
		}
	}
}
