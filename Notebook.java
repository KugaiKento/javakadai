/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
public class Notebook {
	private static int LastNumber = 0;
	private int Number;
	private String Title;
	public Notebook(String title) {
		Number = ++LastNumber;
		Title = title;
		System.out.printf("%d 番目のノートを作成しました%n", Number);
	}

	public void dispInformation() {
		System.out.printf("%d 番目のノートのタイトルは%s です%n", Number, Title);
	}
}
