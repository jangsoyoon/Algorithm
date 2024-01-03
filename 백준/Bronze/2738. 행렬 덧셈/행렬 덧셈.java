import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st;
//        st = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        Map<Integer, List<Integer>> aMap = new HashMap<>();
//        Map<Integer, List<Integer>> bMap = new HashMap<>();
//        for (int i = 0; i < N; i++) {
//            List<Integer> aList = new ArrayList<>();
//            st = new StringTokenizer(br.readLine(), " ");
//            for (int j = 0; j < M; j++) {
//                aList.add(Integer.parseInt(st.nextToken()));
//            }
//            aMap.put(i, aList);
//        }
//        for (int i = 0; i < N; i++) {
//            List<Integer> bList = new ArrayList<>();
//            st = new StringTokenizer(br.readLine(), " ");
//            for (int j = 0; j < M; j++) {
//                bList.add(Integer.parseInt(st.nextToken()));
//            }
//            bMap.put(i, bList);
//        }
//
//        A:
//        for (Map.Entry<Integer, List<Integer>> aListEntry : aMap.entrySet()) {
//            for (Map.Entry<Integer, List<Integer>> bListEntry : bMap.entrySet()) {
//                if (aListEntry.getKey().equals(bListEntry.getKey())) {
//                    int count = 0;
//                    for (Integer a : aListEntry.getValue()) {
//                        for (int i = count; i < bListEntry.getValue().size(); i++) {
//                            aListEntry.getValue().set(i, a + bListEntry.getValue().get(i));
//                            count++;
//                            break;
//                        }
//                    }
//                    continue A;
//                }
//            }
//        }
//        for (Map.Entry<Integer, List<Integer>> integerListEntry : aMap.entrySet()) {
//            for (Integer i : integerListEntry.getValue()) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int[N][M];
        int B[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = A[i][j] + B[i][j];
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
