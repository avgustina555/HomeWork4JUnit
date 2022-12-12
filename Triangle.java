import java.util.Scanner;

import static java.lang.System.in;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;

public class Triangle {
    static int function(int a, int b, int c) {
        int p = a + b + c;
        return p;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Для вычисления площади треугольника введите 3 числа");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();
        System.out.println("Сначала вычислим периметр");
        System.out.println("Периметр равен:" + function(a, b, c) + " см");
        double p1 = (double) (a + b + c) / 2;
        System.out.println("Теперь вычислим площадь треугольника");
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("Площадь треугольника равна: " + s + " кв.см");
        try {
            if (((a + b) <c) || ((a +c) <b) || ((b +c) <a)) {
                throw new MyException();
            }
        } catch (MyException e) {
           System.out.println("Ошибка: " + e.toString());
            System.out.println("Эти стороны не образуют треугольника");
            System.exit(0);
            //return s;
        }
    }

    // driver.quit();
}



