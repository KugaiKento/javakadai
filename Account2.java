/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class Account2 extends Account {

	private int Fee = 0;


	public Account2(long money, double rate, int fee) {

		super(money, rate);
		setFee(fee);
	}


	public boolean setFee(int fee) {

		boolean ret = true;

		if (fee >= 0) {
			Fee = fee;
		} 
		else {
			ret = false;

		}
		return ret;
	}
	

	public boolean drawing(long money) {
		
		boolean ret = true;

		if (Amount >= (money + Fee)) {

			Amount -= (money + Fee);
		} 
		else {
			ret = false;
		}
		
		return ret;
	} 
}

