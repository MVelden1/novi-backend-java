package nl.novi.les1.lesinhoud.variabelenendatatypen;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Hello y'all");

        int i = 12345;
        System.out.println("i = " + i);

        long l =123456789012L;
        l = l + 5;
        l += 5;
        System.out.println("l = " + l);

        byte b = 127;
        b++;
        System.out.println("b = " + b);

        float f = 3.141529f;
        System.out.println("f = " + f);
        System.out.printf("%.2f\n", f);

        double d1 = 0.1;
        double d3 = 0.2;
        System.out.println(d1 + d3);

        char c = 'X';
        String str = "yabbadabbadooh!";
        System.out.println(str + c);

        boolean bb = 3 > 4;
        System.out.println("bb = " + bb);

        Scanner sc = new Scanner(System.in);
        System.out.println("Voer je leeftijd in: ");
        int age = sc.nextInt();
        System.out.println("age = " + age);

        if (bb) {
            System.out.println("Hij is waar");
        } else {
            System.out.println("hij is niet waar");
        }

        System.out.println(calculateSum(100, 200, 300));
        int sum = calculateSum(500, 600, -300);
        System.out.println("sum = " + sum);
    }

    public static int calculateSum(int x, int y, int z) {
        return x + y + z;
    }
}
