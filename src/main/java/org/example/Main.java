package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        scan.close();

        if (A*x + B*y + C == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}