import java.io.*;
import java.util.HashSet;

public class Main {
    //문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
//예제 입력 1               //예제 출력 1
//Mississipi              //?
//예제 입력 2               //예제 출력 2
//zZa                     //Z
//예제 입력 3               //예제 출력 3
//z                       //Z
//예제 입력 4               //예제 출력 4
//baaa                    //A
// A ~ Z 65 ~ 90
// a ~ z 97 ~ 122
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] codeArray = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
                codeArray[s.charAt(i) - 65]++;
            } else {
                codeArray[s.charAt(i) - 97]++;
            }
        }
        int minValue = Integer.MIN_VALUE;
        char ch = '?';
        for (int i = 0; i < codeArray.length; i++) {
            if (codeArray[i] > minValue) {
                minValue = codeArray[i];
                ch = (char) (i + 65);
            }else if(codeArray[i] == minValue){
                ch = '?';
            }
        }
            System.out.println(ch);
    }

}