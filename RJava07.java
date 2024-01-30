/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava07 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 1; i <= 5;i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==j) {
					System.out.print("@");
				}else {
					System.out.print("＋");
				}
			}
			System.out.println();
		}
	}
}
