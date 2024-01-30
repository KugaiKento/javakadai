/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */
import java.util.Scanner;

public class KJava31 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int totalScore = 0;

        for (int student = 0; student < 5; student++) {
            System.out.println("学生番号 " + (student + 1));
            int studentTotal = 0;

            for (int subject = 0; subject < 3; subject++) {
                while (true) {
                    System.out.printf("科目%dの得点を入力してください: ", subject + 1);
                    int score = stdin.nextInt();

                    if (score == -1) {
                        System.out.println("プログラムを終了します。");
                        System.exit(0);
                    } else if (score == -2) {
                        break; // 科目を変更
                    } else if (score < 0 || score > 100) {
                        System.out.println("得点は0から100の間で入力してください。");
                        continue; // 得点を再入力
                    } else {
                        studentTotal += score;
                        break; // 次の科目
                    }
                }
            }

            totalScore += studentTotal;
        }
        System.out.printf("全学生の総合計点は %d です\n", totalScore);
		stdin.close();
    }
}
