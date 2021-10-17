package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1 = 0;
        int operand2 = 0;
        String sign = "";
        //char num = '';
        //String symbol = "";
        System.out.println("Необходимо внести первое число");
        operand1 = scan.nextInt();
        System.out.println("Необходимо внести второе число");
        operand2 = scan.nextInt();
        //symbol = scan.next();
        System.out.println("Необходимо внести -; +; *; или /");
        sign = scan.next(); // + - * /

        switch (sign) {
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 != 0) {
                    System.out.println(operand1 / operand2);
                } else {
                    System.out.println(" На ноль делить нельзя");
                }
                break;
            default:
                System.out.println("Неверная операция");
        }
    }
}
