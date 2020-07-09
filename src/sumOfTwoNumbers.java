import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter FIRST number");
        a=sc.nextInt();
        System.out.println("Enter SECOND number");
        b=sc.nextInt();
        c=a+b;
        System.out.println("The sum is "+c);
    }
}

