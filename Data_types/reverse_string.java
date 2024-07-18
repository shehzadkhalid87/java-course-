package Data_types;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args){

        Scanner st = new Scanner(System.in);
        System.out.print("Input a string : " );
        char [] letter = st.nextLine().toCharArray();
        System.out.print("Reverse letter : ");
        for (int i = letter.length - 1 ; i >= 0 ; i--)
        {
            System.out.print(letter [i]);
        }

    }
}
