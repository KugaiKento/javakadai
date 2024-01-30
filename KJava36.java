/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Calendar;
import java.util.Scanner;
public class KJava36 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int year, nyear;
		String str;
		Calendar cal = Calendar.getInstance();
		nyear = cal.get(Calendar.YEAR);
		Scanner stdin = new Scanner(System.in);
		System.out.printf("西暦を入力してください-->");
		year = stdin.nextInt();
		str = toWareki(year);
		if (str == null)System.out.printf("変換は1868年以降です");
		else System.out.printf("西暦%d年は%sです。この年に生まれた人は今年%d歳になります\n", year, str, nyear - year);
		stdin.close();
	}
	
	static String toWareki(int year) {
		String wareki = null; //1867年以前はnullを返す

		if (year >= 2019) {
			return "令和" + Integer.toString(year - 2019 + 1) + "年";
		}
		if (year >= 1999) {
			return "平成" + Integer.toString(year - 1999 + 1) + "年";
		}
		if (year >= 1926) {
			return "昭和" + Integer.toString(year - 1926 + 1) + "年";
		}
		if (year >= 1912) {
			return "大正" + Integer.toString(year - 1912 + 1) + "年";
		}
		if (year >= 1868) {
			return "明治" + Integer.toString(year - 1868 + 1) + "年";
		}
		return wareki;
	}
}
