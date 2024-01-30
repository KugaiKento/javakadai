/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;
public class Test03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num;
		int base;	
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("整数値を入力>>>");
			num = scanner.nextInt();
			System.out.print("表記法を指定>>>");
			base = scanner.nextInt();
		}
		String value = "";
		if (base==8) value = Integer.toOctalString(num);
		else if (base==10) value = String.valueOf(num);
		else if (base==16) value = Integer.toHexString(num);
		System.out.printf("%dの%d進数表記=%sです",num,base,value);
	}

}
