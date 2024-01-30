/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KJava06 {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("生年月日の年を西暦で入力してください->");
		int year = Integer.parseInt(br.readLine());
		System.out.print("月を入力してください->");
		int month = Integer.parseInt(br.readLine());
		System.out.print("日を入力してください->");
		int day = Integer.parseInt(br.readLine());
		System.out.printf("生年月日は%04d/%02d/%02dです", year,month,day);
	}
}