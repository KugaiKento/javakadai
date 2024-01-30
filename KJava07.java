/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava07 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int studentNum;
		String name;
		Scanner stdin = new Scanner(System.in);
		System.out.print("学籍番号を入力してください-->");
		studentNum = Integer.parseInt(stdin.nextLine());
		System.out.print("氏名を入力してください-->");
		name = stdin.nextLine();		
		System.out.printf("学籍番号%dの%sです", studentNum, name);
		stdin.close();
	}
}