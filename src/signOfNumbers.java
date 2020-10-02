import java.util.Scanner;

public class signOfNumbers {

    public static void main(String[] agrs) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n >= 0)
        {
            System.out.println("The given number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
       /* else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }*/                             //if not negative than its positive even without sign
        
        /*
        try this code...
        String result=n>=0?"Positive no.":"Negative no.";
        System.out.println(result);
        */
    }
}

