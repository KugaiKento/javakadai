/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class RJava05 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int Data1, Data2;
		try (Scanner stdin = new Scanner(System.in)) {
			System.out.printf("1つ目の整数値を入力してください-->");
			Data1 = stdin.nextInt();
			System.out.printf("2つ目の背数値を入力してください-->");
			Data2 = stdin.nextInt();
		}
		System.out.printf("%d+%d=%d%n",Data1,Data2,Data1+Data2);
		System.out.printf("%d-%d=%d%n",Data1,Data2,Data1-Data2);
		System.out.printf("%d*%d=%d%n",Data1,Data2,Data1*Data2);
		System.out.printf("%d/%d=%d%n",Data1,Data2,Data1/Data2);
		System.out.printf("%d%%%d=%d%n",Data1,Data2,Data1%Data2);
	}
}
