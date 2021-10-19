import java.util.*;

public class sortevenodd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int left = 0, right = 5;
		int[] arr= {1,2,9,8,10,5};
		int k = 0;
		 
        while (left < right)
        {
         
          while (arr[left] % 2 != 0)
            {
                left++;
                k++;
            }
 
            
           while (arr[right] % 2 == 0 && left < right)
            {
               	right--;
            }
 
            
            if (left < right)
            {
             
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
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
