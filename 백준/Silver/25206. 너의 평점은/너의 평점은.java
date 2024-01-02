import java.awt.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st;
//
//        Map<String, Double> gradeMap = new HashMap<>();
//        gradeMap.put("A+", 4.5);
//        gradeMap.put("A0", 4.0);
//        gradeMap.put("B+", 3.5);
//        gradeMap.put("B0", 3.0);
//        gradeMap.put("C+", 2.5);
//        gradeMap.put("C0", 2.0);
//        gradeMap.put("D+", 1.5);
//        gradeMap.put("D0", 1.0);
//        gradeMap.put("F", 0.0);
//
//        double sum = 0;
//        double sumScore = 0;
//        for (int i = 0; i < 20; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            String subject = st.nextToken();
//            double score = Double.parseDouble(st.nextToken());
//
//            String grade = st.nextToken();
//            if (!grade.equals("P")) {
//                for (Map.Entry<String, Double> stringDoubleEntry : gradeMap.entrySet()) {
//                    if (stringDoubleEntry.getKey().equals(grade)) {
//                        sum += score * stringDoubleEntry.getValue();
//                        sumScore += score;
//                        break;
//                    }
//                }
//            }
//        }
//
//        System.out.println(sum/sumScore);
//
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        double gradeScore = 0;
        double sum = 0;
        double sumScore = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken();

            double score = Double.parseDouble(st.nextToken());

            String grade = st.nextToken();
            if (!grade.equals("P")) {
                switch (grade) {
                    case "A+" :
                        gradeScore = 4.5;
                        break;
                    case "A0" :
                        gradeScore = 4.0;
                        break;
                    case "B+" :
                        gradeScore = 3.5;
                        break;
                    case "B0" :
                        gradeScore = 3.0;
                        break;
                    case "C+" :
                        gradeScore = 2.5;
                        break;
                    case "C0" :
                        gradeScore = 2.0;
                        break;
                    case "D+" :
                        gradeScore = 1.5;
                        break;
                    case "D0" :
                        gradeScore = 1.0;
                        break;
                    case "F" :
                        gradeScore = 0.0;
                        break;
                }
                sum += gradeScore * score;
                sumScore += score;
            }
        }

        System.out.println(sum/sumScore);
    }
}