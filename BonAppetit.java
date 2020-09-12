import java.io.*;
import java.util.*;
public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the various dishes they eat");
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the item that Anna didn't eat ");
		int k=in.nextInt();
		System.out.println("The amount charged by Anna");
		int b=in.nextInt();
		int actualsum=0,finalsum=0,sum=0;
		for(i=0;i<n;i++)
		{
			actualsum=(actualsum+a[i]);
			sum=actualsum/2;
		}
		System.out.println(sum);
		finalsum=(actualsum-a[k])/2;
		System.out.println("Final sum "+finalsum);
		if(b==finalsum)
		{
			System.out.println("Bon Appetit");
		}
		else
		{

			System.out.println("difference is "+(sum-finalsum));
		}
	}

}
