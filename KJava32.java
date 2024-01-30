/**
 *0H06011 久貝建都
 *@author kugai 
 *
 */

import java.util.Scanner;

public class KJava32 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        char[] moji = new char[] {'ア','イ','ウ','エ'};
        int[] data = new int[80];
        double[][] pattern = new double[4][4];

        for (int i = 0; i < data.length; i++) {
            System.out.printf("問%dの解答-->", i + 1);
            int answer = stdin.nextInt();

            // 入力された解答が0から3の範囲内であるか確認
            if (answer < 0 || answer > 3) {
                System.out.println("解答は0から3の範囲で入力してください。");
                i--; // ループをやり直す
                continue;
            }

            data[i] = answer;
        }

        for (int i = 0; i < data.length - 1; i++) {
            pattern[data[i]][data[i + 1]]++;
        }

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                pattern[i][j] /= (data.length - 1); // 確率計算
                System.out.printf("%c->%c:%f%%\n", moji[i], moji[j], pattern[i][j] * 100);
            }
        }
        stdin.close();
    }
}

