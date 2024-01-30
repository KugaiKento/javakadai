/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class Account {
	
	protected long Amount = 0L;
	
	private double Rate = 0.0;
	private double Interest = 0.0;


	public Account(long money, double rate) {

		deposit(money);
		setRate(rate);
	}
	

	public boolean deposit(long money) {
		
		boolean ret = true;
		
		if (money >= 0) {
			Amount += money;
		} 
		else {
			ret = false;
		}
		return ret;
	}

	
	public boolean drawing(long money) {
		
		boolean ret = true;
		
		if (Amount >= money) {
			Amount -= money;

		} 
		else {
			ret = false;
		}
		return ret;
	}

	
	public boolean setRate(double rate) {

		boolean ret = true; 
	
		if (rate >= 0) 
		{
			Rate = rate;
		} 
		else {
			ret = false;
		}
		return ret;
	}


	public void calcInterest() {

		Interest += Amount * (Rate / 365);
	}


	public void addInterest() {

		Amount += (long) Interest;
		Interest = 0L;
	}
	
	public long getAmount() {
		return Amount;
	}
}
