package javapractical;

public class Factorial {
	public static void main(String args[]){  
		  int i,fact=1;    // defining fact=1 since least value is 1
		  int number=4;    // given input to calculate factorial
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" = "+fact);    
		 }   
}
