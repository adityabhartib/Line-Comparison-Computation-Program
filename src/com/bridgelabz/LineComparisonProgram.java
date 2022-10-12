package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[] args) {
        System.out.println("-----------Welcome to Line Comparison Computation Program----------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 of First Point: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1 of First Point: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2 of Second Point: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2 of Second Point: ");
        int y2 = scanner.nextInt();

        System.out.print("Enter x1 of Third Point: ");
        int p1 = scanner.nextInt();
        System.out.print("Enter y1 of Third Point: ");
        int q1 = scanner.nextInt();
        System.out.print("Enter x2 of Forth Point: ");
        int p2 = scanner.nextInt();
        System.out.print("Enter y2 of Forth Point: ");
        int q2 = scanner.nextInt();

        Double lengthOfLine1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
        double lengthOfLine2 = Math.sqrt(Math.pow(p2-p1, 2) + Math.pow(q2-q1, 2));

        System.out.println("------------------------------------------");
        System.out.println("Length of First Line is :"+ lengthOfLine1);
        System.out.println("------------------------------------------");
        System.out.println("length of Second Line :"+ lengthOfLine2);
        System.out.println("------------------------------------------");

        boolean ans = lengthOfLine1.equals(lengthOfLine2);
        if(ans)
            System.out.println("Both Lines are Equal");
        else
            System.out.println("Both Lines are not Equal");
    }
}