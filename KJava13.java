/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava13 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		double data1, data2;
		System.out.print("1つ目の実数値を入力してください-->");
		data1 = stdin.nextDouble();
		System.out.print("2つ目の実数値を入力してください-->");
		data2 = stdin.nextDouble();
		System.out.printf("%f+%f=%f\n", data1, data2,data1+data2);
		System.out.printf("%f-%f=%f\n", data1, data2,data1-data2);
		System.out.printf("%f*%f=%f\n", data1, data2,data1*data2);
		System.out.printf("%f/%f=%f\n", data1, data2,data1/data2);
		System.out.printf("%f%%%f=%f\n", data1, data2,data1%data2);
		stdin.close();
	}
}
