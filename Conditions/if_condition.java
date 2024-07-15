package Conditions;

import java.util.Scanner;

public class if_condition {
    public static void main(String[] args) {
        int age = 20;
        if (age > 17) {
            System.out.println("Your  aligable for vote " + age);
        } else {
            System.out.println("your are not aligable for vote " + age);
        }
        int cash = 3000;
        int drawable;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of withdrawal");
        drawable = sc.nextInt();
        if (drawable > cash){
            System.out.println("insufficient balance");
        }
        else {
            System.out.println("Withdrawal Money " + drawable);
            int remaining = cash - drawable;
            System.out.println("Remaining Amount " + remaining);
        }

    }
}
