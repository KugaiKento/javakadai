/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava26 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int today;
		double clear1 = 0, cloudy1 = 0, rainy1 = 0;
		double clear2 = 0, cloudy2 = 0, rainy2 = 0;
		System.out.print("今日の天気を入力してください(0:晴れ,1:曇り,2:雨)-->");
		today = Integer.parseInt(stdin.nextLine());
		
		switch (today) {
		case 0:
			clear1 = 1.0;
			break;
		case 1:
			cloudy1 = 1.0;
			break;
		case 2:
			rainy1 = 1.0;
			break;
		}
		
		for (int i=0; i<7; i++) {
			clear2 = clear1 * 0.4 + cloudy1 * 0.3 + rainy1 * 0.3;
			cloudy2 = clear1 * 0.4 + cloudy1 * 0.4 + rainy1 * 0.5;
			rainy2 = clear1 * 0.2 + cloudy1 * 0.3 + rainy1 * 0.2;
			
			clear1 = clear2;
			cloudy1 = cloudy2;
			rainy1 = rainy2;
			
			System.out.printf("%d日後が晴れの確率は%.3f、曇りの確率は%.3f、雨の確率は%.3f\n",
					i+1, clear2, cloudy2, rainy2);		
		}
		stdin.close();
	}
}
