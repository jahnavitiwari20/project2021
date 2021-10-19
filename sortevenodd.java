import java.util.*;

public class sortevenodd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l = 0, r = 5;
		int[] arr= {1,2,9,8,10,5};
		int k = 0;
		 
        while (l < r)
        {
         
            
            while (arr[l] % 2 != 0)
            {
                l++;
                k++;
            }
 
            
            while (arr[r] % 2 == 0 && l < r)
                r--;
 
            
            if (l < r)
            {
             
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
 
        
        
        Arrays.sort(arr, k, 6);
        System.out.print("{");
        
        
        for(int i=5;i>=k;i--)
        {
        	System.out.print(arr[i]+",");
        }
        
        
        Arrays.sort(arr, 0, k);
        
        for(int i=k-1;i>=0;i--)
        {
        	if(i>0)
        		System.out.print(arr[i]+",");
        	
        	else
        		System.out.print(arr[i]);
        }
        
        System.out.print("}");
		sc.close();
	}

}
