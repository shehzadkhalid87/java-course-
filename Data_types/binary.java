package Data_types;

import java.util.Scanner;

public class binary {
    public static  void main(String [] args){
        long binary1, binary2;
        int i = 0 , remainder = 0;
        int [] sum = new int[20];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first binary number : ");
        binary1 = input.nextLong();

        System.out.println("Enter 2nd binary number : ");
        binary2 = input.nextLong();

        while ((binary1 != 0) || (binary2 != 0)){
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder ) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1  / 10;
            binary2 = binary2 / 10;

        }
        if (remainder != 0){
            sum [i++] = remainder;
        }
        --i;
        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");
    }
}
