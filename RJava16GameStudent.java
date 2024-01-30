/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava16GameStudent extends RJava15Student {
	private String GameName;
	public RJava16GameStudent(String name, String address) {
		super(name,address);
	}
	
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	
	public void doJobHunting() {
		if (GameName!=null) {
			System.out.printf("作成した%sをアピールします\n", GameName);
		}else {
			System.out.printf("長所をアピールします\n");
		}
	}
}