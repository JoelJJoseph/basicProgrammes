import java.util.Scanner;

public class largestNumberOutOfThree {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("The largest no is "+a);
        }
        else if(b>c && b>a)
        {
            System.out.println("The largest no is "+b);
        }
        else
        {
            System.out.println("The largest no is "+c);
        }
    }
}

