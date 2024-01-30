/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class KJava19 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int today;
		double clear = 0, cloudy = 0, rainy = 0;
		System.out.print("今日の天気を入力してください(0:晴れ,1:曇り,2:雨)-->");
		today = Integer.parseInt(stdin.nextLine());
		switch(today) {
		case 0:
			clear = 0.4;
			cloudy = 0.4;
			rainy = 0.2;
			break;
		case 1:
			clear = 0.3;
			cloudy = 0.4;
			rainy = 0.3;
			break;
		case 2:
			clear = 0.3;
			cloudy = 0.5;
			rainy = 0.2;
			break;
		}
		System.out.printf("明日の晴れの確率は%.2f、曇りの確率は%.2f、雨の確率は%.2fです",
				clear,cloudy, rainy);
		stdin.close();	
	}
}
