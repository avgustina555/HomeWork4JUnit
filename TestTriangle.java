import java.util.Scanner;

import static java.lang.System.in;

public class TestTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        // сначала вводим числа a, b, c
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();

        // вычисление площади
        double p1 = (double) (a + b + c) / 2;
        System.out.println("Теперь вычислим площадь треугольника");
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("Площадь треугольника равна: " + s + " кв.см");
    }
    // driver.quit();
}


