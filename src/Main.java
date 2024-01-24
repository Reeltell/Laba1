import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        double x = input.nextDouble();
        System.out.println("Введите ограничение:");
        double n = input.nextDouble();
        double summa = x;
        if (Math.abs(x) < 1) {
            for (double i = 0; i < n; i++) {
                 double a = 1;
                 double b = 1;
                 for (double j = 1; j <= n; j++){
                     a *= 2 * j - 1;
                 }
                 b *= Math.pow(x, 2 * n + 1);
                for (double j = 1; j <= n; j++){
                    b *= 2 * j;
                }
                summa += a / b;
            }
            System.out.println(Math.PI / 2 - summa);
        }
        else{
            System.out.println("Введите число, модуль которого меньше 1.");
        }
    }
}