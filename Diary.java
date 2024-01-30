/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class Diary extends Notebook{

	private String _date;
	
	public Diary(String title, String date) {
		
		super(title);
		setDate(date);
	}
	
	public void setDate(String date) {
		_date = date;
	}
	
	public void dispInformation() {
		super.dispInformation();
		System.out.printf("この日記の開始日は%sです\n", _date);
	}
}
