/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava19GameStudent extends RJava19Student implements RJava19IStudent{
	private String GameName;
	public RJava19GameStudent(String name, String address) {
		super(name,address);
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}
	
	public void doJobHunting() {
		if (GameName!=null) {
			System.out.printf("作成した%sをアピールします\n",GameName);
		}else {
			System.out.printf("長所をアピールします\n", GameName);
		}
	}
	
	public void doStudy(PC pc) {
		System.out.printf("%sはPCを使ってC#でゲームを作成します\n",Name);
	}
}