/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava14Student {
	public int Id = 1;
	public String Name;
	private String Address;
	public RJava14Student(int Id, String name, String address) {
		this.Id = Id;
		Name = name;
		this.Address = address;
	}
	public void doStudy() {
		System.out.printf("%sは勉強します\n", Name);
	}
	public void answerAddress(String name) {
		if (name.equals("飯田生子")) {
			System.out.printf("%sから来ています\n", Address);
		}else {
			System.out.printf("地球から来ています\n");
		}
	}
}