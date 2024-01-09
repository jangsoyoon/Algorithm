import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] words = new String[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                words[i][j] = "-1";
            }
        }

        for (int i = 0; i < 5; i++) {
            String word = br.readLine();
            for (int j = 0; j < word.length(); j++) {
                words[i][j] = String.valueOf(word.charAt(j));
            }
        }
        A:
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (!words[j][i].equals("-1")) System.out.print(words[j][i]);
            }
        }
    }
}
