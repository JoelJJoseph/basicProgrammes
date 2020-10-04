import java.util.Scanner;

public class largestNumberOutOfThree {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,large;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
      
        //Try this out
        large=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("The largest no is "+large);
    }
}
