public class type_Casting {
    public static void main(String[] args){
        //widening type casting
        System.out.println("Widening type casting");
        int myInt = 8;
        System.out.println(myInt);
        System.out.println((double) myInt);
        System.out.println("\n");


        // narrowing type casting
        System.out.println("Narrowing type casting");
        double myDouble = 9.0;
        int myIntg = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myIntg);

    }
}
