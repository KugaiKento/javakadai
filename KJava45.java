/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class KJava45 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account account = new Account(100000000, 0.0002);
		
		int i, j, m=0;
		loop: while(true) {
			for (i =1; i<=12; i++) {
				m++;
				for (j=1; j<=30;j++) {
					if (j==20) {
						if (account.getAmount() < 200000) {
							break loop;
						}
						account.drawing(200000);
					}
					account.calcInterest();
				}
			}
			if (i==3 || i==9) {
				account.addInterest();
			}
			if (i==12) {
				if (account.getAmount() < 300000) {
					break loop;
				}
				account.drawing(300000);
			}
		}
		System.out.printf("%dか月後に残金が足りなくなりました\n", m);
	}

}
