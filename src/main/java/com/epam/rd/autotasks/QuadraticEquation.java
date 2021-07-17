package com.epam.rd.autotasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b * b - 4.0 * a * c;

        if (d> 0.0)
        {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.print(x1 + x2);
        }

        else if (d == 0.0)
        {
            double x1 = -b / (2 * a);
            System.out.print(x1);

        }
        else
        {
            System.out.println("no roots");
        }
    }
}