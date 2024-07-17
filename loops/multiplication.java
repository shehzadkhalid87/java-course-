package loops;

import java.util.Scanner;

 class multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 1;
        System.out.println("Enter a Number : ");
        num = input.nextInt();
        var i = 1;
        do {
            System.out.println(num + " x " + i  + " = " + (num) * i);
            ++i;

        }
        while (i <= 10);

    }
}
