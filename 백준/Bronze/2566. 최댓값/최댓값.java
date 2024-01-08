import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[][] arrange = new int[9][9];

        for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arrange[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int minValue = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arrange[i][j] > minValue) {
                    minValue = arrange[i][j];
                }
            }
        }
        FINAL : for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arrange[i][j] == minValue) {
                    System.out.println(minValue);
                    System.out.print((i+1) + " " + (j+1));
                    break FINAL;
                }
            }
        }

    }
}