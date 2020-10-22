/*7. Write a java program to make rolling a pair of dice 10,000 times and counts the number of times doubles of are rolled for each different pair of doubles. Hint: Math.random() */

import java.util.Random;
public class Experiment_07
{
	public static void main(String[] args) {
	    Random rn=new Random();
		int count=0;
		int ar1[] = new int[10000];
		int ar2[] = new int[10000];
		System.out.println("pair of dices with same number are");
		for(int i=0;i<10000;i++){
		    ar1[i]=1+rn.nextInt(6);
		    ar2[i]=1+rn.nextInt(6);
		    
		    if(ar1[i]==ar2[i]){
			System.out.print("( "+ar1[i]+","+ar2[i]+" )\t");
		        count++;
		    }
		}
		System.out.println("\nNumber of doubles = "+count);
	}
}
