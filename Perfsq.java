import java.util.*;
public class Perfsq 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		double[] arr= {8,9,10,15,16};
		int[] perf=new int[5];
		double[] nonp=new double[5];
		int k=0,l=0;
		
		for(int i=0;i<5;i++)
		{
			double sq=Math.sqrt(arr[i]);
			if(sq-Math.floor(sq)==0)
			{
				k++;
				perf[k-1]=(int)Math.sqrt(arr[i]);
				
			}
			else
			{
				l++;
				nonp[l-1]=Math.sqrt(arr[i]);
			}
		}
		
		Arrays.sort(perf);
		System.out.print("{");
		
		for(int i=4;i>=0;i--)
		{	
			if(perf[i]==0)
				continue;
			
			else
				System.out.print( perf[i]+" ");
		}
		
		Arrays.sort(nonp);
		for(int i=4;i>=0;i--)
		{	
			if(nonp[i]==0)
				continue;
			
			else
				System.out.print( nonp[i]+" ");
		}
		
		System.out.print("}");
		
	}

}
