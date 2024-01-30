/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava17 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int month;
		System.out.print("月を入力してください-->");
		month = Integer.parseInt(stdin.nextLine());
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.print("冬です");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("春です");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("夏です");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("秋です");
			break;
		default:
			System.out.print("エラー");
		}
		stdin.close();
	}
}
