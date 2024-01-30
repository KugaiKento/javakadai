/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

/**
 * 
 */
public class RJava15Student {
	public static int LastId = 0;
	public int Id;
	public String Name;
	public String Address;
	
	public RJava15Student(String name, String address) {
		Id = ++LastId;
		Name = name;
		this.Address = address;
	}
	
	public void doStudy(PC pc) {
		System.out.printf("%sはシリアル番号%dのPCを使って実習をします\n", 
				Name, pc.getSerialNnumber());
	}
	
	public void doStudy(ExerciseBook book) {
		System.out.printf("%sは問題演習をします\n", Name);
	}
	
	public void answerAddress(String name) {
		if (name.equals("飯田生子")) {
			System.out.printf("%sから来ています", Address);
		}else {
			System.out.printf("地球から来ています");
		}
	}
}