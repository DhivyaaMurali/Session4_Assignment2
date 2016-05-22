package session4_assignment;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) 
	{
		int num, i, j, temp,pos,x;
		Scanner s = new Scanner(System.in);
 
		System.out.println("Enter the length of the Array:");
		num = s.nextInt();
		int array[] = new int[num+1];
 		System.out.println("Enter elements of the Array: ");
 
 		for (i = 0; i < num; i++)
 			array[i] = s.nextInt();
    
 		//Inserting an element inside the array
 		System.out.println("Enter the position where you want to insert element:");
 		pos = s.nextInt();
 		System.out.println("Enter the element you want to insert:");
 		x = s.nextInt();
 		for(i = (num-1); i >= (pos-1); i--)
 		{
    	array[i+1] = array[i];
 		}
 		array[pos-1] = x;
 		System.out.println("After inserting:");
 		for(i = 0; i < num; i++)
 		{
        System.out.println(array[i]);
 		}
 		System.out.println(array[num]);
    
    
 		//Sorting the array
 		for (i = 0; i < ( num - 1 ); i++)
 		{
 			for (j = 0; j < num - i - 1; j++) 
 			{
 				if (array[j] > array[j+1]) 
 				{
 					temp = array[j];
 					array[j] = array[j+1];
 					array[j+1] = temp;
 				}
 			}
 		}
 
 		System.out.println("Sorted Array elements are:");
 
 		for (i = 0; i < num+1; i++) 
 			System.out.println(array[i]);
      
    }
}


