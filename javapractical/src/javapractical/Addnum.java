package javapractical;

import java.util.Scanner;

public class Addnum {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("First Number: ");
        int a=sc.nextInt();
        
        System.out.println("Second Number:");
        int b = sc.nextInt();
        
        
        System.out.println("Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);
        sc.close();
        
        double addition  = a+b;
        double subtraction  = a-b;
        double multiplication  = a*b;
        double division  = a/b;
        
        switch(op)
        {
            case '+' :
            {
                System.out.print("Total after Addition is : "+addition);
                break;
            }
            case '-' :
            {
                System.out.print("Total after Subtraction is : " +subtraction);
                break;
            }
            case '*' :
            {
                System.out.print("Total after Multiplication is : "+multiplication);
                break;
            }
            case '/' :
            {
                System.out.print("Total after Division is : "+division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }
        }

	}

}
