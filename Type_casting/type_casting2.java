import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class type_casting2 {
    public static void main(String[] args){
       String myString = "Shehzad";
       char[] myChars = myString.toCharArray();
       for (char myChar : myChars) {
           System.out.println(myChar);
       }
       Double myDouble = 99.99d;
       int myFloat= myDouble.intValue();
       System.out.println(myDouble);
        System.out.println(myFloat);

    }
}
