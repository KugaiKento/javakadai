/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava17GameStudent extends RJava15Student{
	private String GameName;
	
	public RJava17GameStudent(String name, String address) {
		super(name,address);
	}
	
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	
	public void doJobHunting() {
		if (GameName != null) {
			System.out.printf("作成した%sをアピールします\n", GameName);
		}else {
			System.out.printf("長所をアピールします\n", GameName);
		}
	}
	
	public void doStudy(PC pc) {
		System.out.printf("%sはPCを使ってC＃でゲームを製作します\n", Name);
	}
}