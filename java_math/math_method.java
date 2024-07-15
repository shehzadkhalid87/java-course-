package java_math;

public class math_method {
    public static void main(String[] args){
        //Math.max method
        System.out.println("Math.max method");
        int max = Math.max(5,10);
        System.out.println(max + "\n");

        //math.min method
        System.out.println("math.min method");
        double min = Math.min(99.9d, 62.1d);
        System.out.println(min + '\n');

        //math.sqrt method
        System.out.println("Square root method");
        double Sqrt = Math.sqrt(22.4);
        System.out.println(Sqrt);

        //Random number
        int RandomNum = (int) (Math.random() * 10);
        System.out.println(RandomNum);
    }
}
