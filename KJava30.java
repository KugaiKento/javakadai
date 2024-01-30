/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava30 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		System.out.printf("出席状況を入力してください-->");
		
		String input;
		char c;
		boolean perfect = true;
		input = stdin.nextLine();
		
		for (int i = 0; i<input.length(); i++) {
			c = input.charAt(i);
			if (!(c == '出' || c == '公')) {
				perfect = false;
				break;
			}
		}

		if (perfect) {
			System.out.print("皆勤です");
		}
		else {
			System.out.print("皆勤ではありません");
		}
		stdin.close();
	}
}
