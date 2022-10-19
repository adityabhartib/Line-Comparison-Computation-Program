package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String args[]) {


        Integer lengthOfLine1 = (int) computeLength();
        Integer lengthOfLine2 = (int) computeLength();

        //objects of compareto and equals method
        CompareToMethod compareToMethod = new CompareToMethod(lengthOfLine1, lengthOfLine2);
        EqualMethod equalMethod = new EqualMethod(lengthOfLine1, lengthOfLine2);

    }
    //length computation method
    public static double computeLength() {
        Scanner sc=new Scanner(System.in);
        lines line=new lines();
        System.out.println("Enter the value of x1 :");
        line.setX1(sc.nextInt());
        System.out.println("Enter the value of y1 :");
        line.setY1(sc.nextInt());
        System.out.println("Enter the value of x2 :");
        line.setX2(sc.nextInt());
        System.out.println("Enter the value of y2 :");
        line.setY2(sc.nextInt());


        Integer lengthOfLine = (int)Math.sqrt((line.getX2()-line.getX1())*(line.getX2()-line.getX1()) +
                (line.getY2()-line.getY1())*(line.getY2()-line.getY1()));

        return lengthOfLine;
    }
}
//compare method class
class CompareToMethod{

    //constructor
    public CompareToMethod(Integer lengthOfLine1, Integer lengthOfLine2) {

        System.out.println("Compare To Method Result:");
        int res = lengthOfLine1.compareTo(lengthOfLine2);

        //comparing line
        if(res < 0)
            System.out.println("Line 1 is smaller than Line 2.");
        else if(res > 0)
            System.out.println("Line 1 is greater than Line 2.");
        else
            System.out.println("Line 1 is equals to the Line 2.");

        System.out.println("");
    }
}

//equals method class
class EqualMethod{

    //constructor
    public EqualMethod(Integer lengthOfLine1, Integer lengthOfLine2) {
        System.out.println("Equals Method Result:");
        if (lengthOfLine1.equals(lengthOfLine2))
            System.out.println("Both line 1 nad 2 have same length of " + lengthOfLine1);
        else
            System.out.println("Both have different length");
    }


}