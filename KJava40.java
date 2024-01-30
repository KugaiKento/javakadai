/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava40 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if (args.length == 3) {
			char enzansi = args[0].charAt(0);	
			double num1 = Double.parseDouble(args[1]);
			double num2 = Double.parseDouble(args[2]);
			double ans = 0.0; //解答用
			
			switch(enzansi) {
			case '+':
				ans = num1 + num2;
				break;
			case '-':
				ans = num1 - num2;
				break;
			case '/':
				ans = num1 / num2;
				break;
			case '%':
				ans = num1 % num2;
				break;
			}
			System.out.printf("答えは%dです", ans);
		}
		else {
			System.out.print("引数の個数が正しくありません");
		}
	}
}
