package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner use = new Scanner(System.in);
        System.out.println("Вычисление значения выражения 2**n:\nВвести значение степени n:");
        int n = 2;
        int mw = use.nextInt();
        int k = 1;
        int i = 0;
        while (i < mw) {
            k = k * n;
            ++i;
        }
        System.out.println("2**"+mw+" = "+k);

        System.out.println("Расчет факториала для произвольного числа n < 10:");
        int fa=use.nextInt();
        int l = 1;
        int j = 1;
        while (j <= fa)
        {
            l = l * j;
            ++j;
        }
        System.out.println(fa+"! = "+l);

        System.out.println("Ввести первое число:");
        int num = use.nextInt();
        System.out.println("Ввести второе число:");
        int num_2 = use.nextInt();
        int sum = num + num_2;
        System.out.println("Сумма: "+sum);
        int dif = num - num_2;
        System.out.println("Разность: "+dif);
        int mul = num * num_2;
        System.out.println("Произведение: "+mul);

        System.out.print("\nВвести высоту падения:");
        double h = use.nextDouble();
        double res1 = (2 * h) / 9.8;
        double temp = Math.sqrt(res1);
        System.out.print("Ускорение свободного падения = 9.8 м/сек**2\n");
        System.out.print("Время падения объекта: sqrt(2*h/9.8)\n");
        System.out.print("Время падение = "+temp+" с.\n");

        System.out.println("Нахождения длины катета прямоугольного треугольника:");
        System.out.println("Гипотенуза:");
        double c = use.nextDouble();
        System.out.println("Катет а:");
        double a = use.nextDouble();
        System.out.println("Теорема Пифагора: c**2 = a**2 + b**2");
        double csq = Math.pow(c,2);
        System.out.println("с**2 = "+csq);
        double asq = Math.pow(a,2);
        System.out.println("а**2 = "+asq);
        double bsq = csq-asq;
        System.out.println("b**2 = "+bsq);
        double b = Math.sqrt(csq - asq);
        System.out.print("Катет b = "+b);
    }
}
