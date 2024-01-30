/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava19ITStudent extends RJava19Student implements RJava19IStudent{
	private boolean FE;
	public RJava19ITStudent(String Name, String Address, boolean FE) {
		super(Name,Address);
		setFE(FE);
	}
	
	public RJava19ITStudent(String name, String address) {
		this(name, address, false);
	}
	
	public void setFE(boolean FE) {
		this.FE = FE;
	}
	
	public void doJobHunting() {
		if (FE) {
			System.out.printf("基本情報を取得したことをアピールします\n");
		}else {
			System.out.printf("基本情報を目指し頑張っていることをアピールします\n");
		}
	}
	
	public void doStudy(PC pc) {
		super.doStudy(pc);
		System.out.printf("%sはPCを使ってJavaのプログラムを作成します\n",Name);
	}
}
