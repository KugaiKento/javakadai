/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class StopWatch {
	private long StartTime;
    private long StopTime;
    private long TotalTime;
    private boolean Status = false;
    
    
	public long getTotalTime() {
		long ret = TotalTime;
		if (Status) {
			ret += System.nanoTime() - StartTime;
		}
		return ret;
	}

	
	public void clearTime() {
		StartTime = 0;
		StopTime = 0;
		TotalTime = 0;
		Status = false;
	}

	public void startTime() {
		if (!Status) {
			StartTime = System.nanoTime();
			Status = true;
		}
	}

	public void stopTime() {
		if (Status)  {
			StopTime = System.nanoTime();	
			TotalTime = StopTime - StartTime;
			Status = false;
		}
	}
}
