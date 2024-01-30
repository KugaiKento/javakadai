/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class Temperature {
	private double AbTemp;
	
	public boolean setFTemperature(double atemp) {
		boolean ret = true;
		double temp = (atemp + 459.67) * 5 / 9;
		
		if (temp >= 0) { 
		
			AbTemp = temp;
		} else {
			ret = false;
		}

		return ret;
	}

	public boolean setCTemperature(double ctemp) {
		boolean ret = true;
		double temp = ctemp + 273.15;

		if (temp >= 0) {
			AbTemp = temp;
		} else {
			ret = false;
		}
		return ret;
	}

	
	public double getAbTemperature() {
		return AbTemp;
	}

	
	public double getFTemperature() {
		return AbTemp * 9  / 5 - 459.67;
	}


	public double getCTemperature() {
		return AbTemp - 273.15;
	}
}
