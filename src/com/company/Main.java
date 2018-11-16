package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Example_1();
        Example_2();
        Example_3();
        Example_4();
    }
    private static void Example_1() {
        System.out.println("Пример 1");
        Scanner scanner = new Scanner(System.in);
        float D;
        int a = 0, b = 0, c = 0;
        System.out.print("Введите  а: ");
        a = scanner.nextInt();
        System.out.print("Введите  b: ");
        b = scanner.nextInt();
        System.out.print("Введите  c: ");
        c = scanner.nextInt();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else System.out.println("Уравнение не имеет действительных корней");
    }
    private static void Example_2() {
        System.out.println("Пример 2");
        int a=0, b=0, per=0, square=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону а: ");
        a = scanner.nextInt();
        System.out.print("Введите сторону b: ");
        b = scanner.nextInt();
        per=(a+b)*2;
        square= a*b;
        System.out.println("Периметр: " + per);
        System.out.println("Площадь: " + square);
    }
    private static void Example_3() {
        System.out.println("Пример 3");
       double per=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите периметр: ");
        per = scanner.nextDouble();
        double a = per/4;
        System.out.println("Сторона квадрата: " + a);
    }
    private static void Example_4() {
        System.out.println("Пример 4");
        double a=0, b=0, c=0, x=0, y=0, one=0, two=0, three=0, four=0, five=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        a = scanner.nextDouble();
        System.out.print("Введите b: ");
        b = scanner.nextDouble();
        System.out.print("Введите c: ");
        c = scanner.nextDouble();
        System.out.print("Введите y: ");
        y = scanner.nextDouble();
        System.out.print("Введите x: ");
        x = scanner.nextDouble();
        // например, проверка на 0 в знаменателе
        if (a == 0)
        {
            System.out.println("Нет решений");
        }
        else
        {
            one = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) + (Math.pow(a, 3) * c) + Math.pow(b, -2);
            two= Math.pow(x, 2)+ Math.pow(x, 3);
            three= x - (Math.pow(x, 3)/3+ Math.pow(x, 5)/5);
            four = ((x+y)/(y+1))-((x*y-12)/(34+x));
            five = Math.sin(Math.sqrt(x+1))-Math.sin(Math.sqrt(x-1));
            System.out.println("one= "+one);
            System.out.println("two= "+two);
            System.out.println("three= "+three);
            System.out.println("four= "+four);
            System.out.println("five= "+five);
        }
            
    }
}
