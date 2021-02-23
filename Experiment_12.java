import java.util.*;
public class ExceptionHandling{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Enter any two values");
			int a=sc nextInt();
			int b= sc.nextInt();
			int c=a/b;
		}
		catch(ArithmeticExcxeption ae){
			System.out.print("Arithmatic Exception occured");
		}
		catch(InputMismatchException ie){
			System.out.print("Input mismatch exception occured");
		}
	}
}
