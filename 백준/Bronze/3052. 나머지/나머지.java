import java.io.*;
import java.util.HashSet;

public class Main {
//문제
//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//출력
//첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

    //예제 입력 1                    //예제 출력 1
//1                            //10
//2
//3
//4
//5
//6
//7
//8
//9
//10
    public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    int[] numbers = new int[10];
//
//    for(int i = 0; i < 10; i++){
//        int number = Integer.parseInt(br.readLine());
//        int result = number%42;
//        numbers[i] = result;
//    }
//
//    for(int i = 0; i < numbers.length; i++){
//        for(int j = i+1; j < numbers.length; j++){
//            if(numbers[i] == numbers[j]) numbers[j] = -1;
//        }
//    }
//    int count = 0;
//    for (int number : numbers) {
//        if(number == -1) count++;
//    }
//    System.out.print(count);


//        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0 ; i < 10 ; i++) {
//            arr[Integer.parseInt(br.readLine()) % 42] = true;
            numbers.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.print(numbers.size());
//        int count = 0;
//        for(boolean value : arr) {
//            if(value){    // value 가 true 라면
//                count++;
//            }
//        }
//        System.out.println(count);
    }

}
