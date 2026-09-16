package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        /*
         * Fibonacci Series
         * ----------------
         * Definition:
         * A Fibonacci series is a sequence in which each number
         * is the sum of the previous two numbers.
         *
         * Series:
         * 0 1 1 2 3 5 8 13 21 34 ...
         *
         * Logic:
         * first = 0
         * second = 1
         * next = first + second
         *
         * After printing next:
         * first = second
         * second = next
         *
         * Example (n = 7):
         * first = 0, second = 1
         *
         * Output:
         * 0 1 1 2 3 5 8
         */

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}

//Dry Run
//n = 7
//
//first = 0
//second = 1
//
//Iteration 1: print 0
//next = 0 + 1 = 1
//first = 1
//second = 1
//
//Iteration 2: print 1
//next = 1 + 1 = 2
//first = 1
//second = 2
//
//Iteration 3: print 1
//next = 1 + 2 = 3
//first = 2
//second = 3
//
//Iteration 4: print 2
//next = 2 + 3 = 5
//first = 3
//second = 5
//
//Iteration 5: print 3
//Iteration 6: print 5
//Iteration 7: print 8
//
//Output:
//0 1 1 2 3 5 8
