import java.awt.*;
import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
//문제
//단어
//$S와 정수
//$i가 주어졌을 때,
//$S의
//$i번째 글자를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
//$S가 주어진다. 단어의 길이는 최대
//$1\,000$이다.
//
//둘째 줄에 정수
//$i$가 주어진다. (
//$1 \le i \le \left|S\right|$)
//
//둘째 줄에 정수
//i가 주어진다. (
//$1 \le i \le \left|S\right|$)
//
//출력
// 
//$S$의
//$i$번째 글자를 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int I = Integer.parseInt(br.readLine());

        for(int i = 0; i < word.length(); i++){
            if(i+1 == I) System.out.println(word.charAt(i));
        }
    }
}
