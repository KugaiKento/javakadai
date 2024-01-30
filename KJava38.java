/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava38 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double Data1;
		double Data2;
		double Ans;

		Scanner stdin = new Scanner(System.in);
		System.out.print("1個目のデータ-->");
		Data1 = stdin.nextDouble();
		System.out.print("2個目のデータ-->");
		Data2 = stdin.nextDouble();
		Ans = getArea(Data1);
		System.out.printf("1辺%fの正方形の面積は%fです\n", Data1, Ans);
		Ans = getArea(Data1, Data2);
		System.out.printf("幅高さ%f,%fの長方形の面積は%fです\n", Data1,Data2, Ans);
		stdin.close();
	}
	
	static double getArea(double d1) {
		double ans = 0.0;
		if (d1 > 0) {
		ans = d1 * d1;
		}
	return ans;
}
static double getArea(double d1 , double d2) {
	double ans = 0.0;
	if (d1>0 && d2>0) {
		ans = d1 * d2;
	}
	return ans;
	}
}
