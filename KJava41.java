/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava41 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StopWatch watch = new StopWatch();
		Scanner stdin = new Scanner(System.in);
		watch.startTime();
		watch.stopTime();
		long t = watch.getTotalTime();
		double d = (double) t / 1000000000;
		System.out.printf("%.1f秒でした\n", d);
		d -= 5;
		if (d<0) {
			d = -d;
		}
		if (d<=0.5) {
			System.out.printf("正確\n");
		}else if (d <= 1) {
			System.out.printf("ほぼ正確\n");
		}else {
			System.out.printf("不正確\n");
		}
		stdin.close();
	}
}
