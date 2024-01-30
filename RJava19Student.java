/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.ArrayList;
public class RJava19Student {
	private static int LastId = 0;
	public int Id;
	public String Name;
	private String Address;
	private ArrayList<String> AcquaintanceList = new ArrayList<String>();
	
	public RJava19Student(String name, String address) {
		Id = ++LastId;
		Name = name;
		this.Address = address;
	}
	
	public void doStudy(PC pc) {
		System.out.printf("%sはシリアル番号%dのPCを使って実習をしています\n", Name,pc.getSerialNnumber());
	}
	
	public void doStudy(ExerciseBook book) {
		System.out.printf("%sは問題演習をします\n", Name);
	}
	
	public void answerAddress(String name) {
		boolean flag = true;
		for (String acquaintance  : AcquaintanceList) {
			if (acquaintance.equals(name)){
				System.out.printf("%sから来ています\n", Address);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.printf("地球から来ています");
		}
	}
}