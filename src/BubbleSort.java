public class BubbleSort
{
	static void bubbleSort(int[] arr) 
	{  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++)
        {  
        	for(int j=1; j < (n-i); j++)
        	{  
        		if(arr[j-1] > arr[j])
        		{  
        			temp = arr[j-1];  
        			arr[j-1] = arr[j];  
        			arr[j] = temp;  
        		}  
                          
        	}  
         }  
	}
	public static void main(String[] args)
	{
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 121;
		arr1[2] = 69;
		arr1[3] = 420;
		arr1[4] = 7;
		bubbleSort(arr1);
		for(int i=0;i<5;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
