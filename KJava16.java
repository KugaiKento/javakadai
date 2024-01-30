/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava16 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int month;
		System.out.print("月を入力してください-->");
		month = Integer.parseInt(stdin.nextLine());	
		if (month == 12 || month == 1 || month == 2) {
			System.out.print("冬です");
		}
		else if (month == 3 || month == 4 || month == 5) {
			System.out.print("春です");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.print("夏です");
		}
		else if (month == 9 || month == 10 || month == 11) {
			System.out.print("秋です");
		}
		stdin.close();
	}
}
