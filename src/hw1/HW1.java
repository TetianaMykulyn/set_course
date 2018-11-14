package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Task 1

        System.out.println("Enter a");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter b");
        int b = Integer.parseInt(br.readLine());

        int plus;
        int minus;
        int multiple;
        int divide;

        plus = a + b;
        minus = a - b;
        multiple = a * b;
        divide = a / b;

        System.out.println("a + b = " + plus);
        System.out.println("a - b = " + minus);
        System.out.println("a * b = " + multiple);
        System.out.println("a / b = " + divide);

//        Task 2

//        System.out.println("How are you?");
//        String answer = br.readLine();
//        System.out.println("You are " + answer);
    }
}
