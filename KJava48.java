/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava48 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account2 account2 = new Account2(100000000, 0.0002, 200);
		int i, j, m=0;
		loop2: while(true) {
			for (i =1; i<=12; i++) {
				m++;
				for (j=1; j<=30;j++) {
					if (j==20) {
						if (account2.getAmount() < 200000) {
							break loop2;
						}
						account2.drawing(200000);
					}
					account2.calcInterest();
				}
			}
			if (i==3 || i==9) {
				account2.addInterest();
			}
			if (i==12) {
				if (account2.getAmount() < 300000) {
					break loop2;
				}
				account2.drawing(300000);
			}
		}
		System.out.printf("%dか月後に残金が足りなくなりました\n", m);
	}
}
