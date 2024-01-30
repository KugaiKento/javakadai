/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class RJava12{
	public static void main(String[] args) {
		RJava12Student aota;
		aota = new RJava12Student();
		aota.Id = 1;
		aota.Name = "青田相子";
		aota.Address = "神戸市";
		System.out.printf("%d番の%sさんは%sから来ています\n",
				aota.Id, aota.Name, aota.Address);
		
		aota.doStudy();
	}
}
