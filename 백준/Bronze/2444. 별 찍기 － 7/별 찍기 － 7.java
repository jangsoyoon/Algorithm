import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
//문제
//예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//출력
//첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
//예제 입력 1
//5
//예제 출력 1
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = N-1; i >= 1; i--) {
            for (int j = 1; j <= N-i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}