import java.util.Scanner;
import java.util.Arrays;

public class Array {

  static int sum(int[] arr)
  {
    int sum = 0;
    for(int i=0; i<arr.length; i++)
    {
      sum = sum + arr[i];
    }
    return sum;

  }

  static int largest(int[] arr)
  {
    int largest = arr[0];
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]>largest)
      {
        largest = arr[i];
      }
    }
    return largest;
  }

  static int smallest(int[] arr)
  {
    int smallest = arr[0];
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]<smallest)
      {
        smallest = arr[i];
      }
    }
    return smallest;
  }

  static int isEven(int[] arr) 
  {
    int count = 0;
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i] % 2 == 0)
      {
        count++;
      }
    }
    return count;
  }

  static int target(int[] arr, int target)
  {
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  static int[] reverse(int[] arr)
  {
    int beg;
    int end;
    for (int i = 0; i < arr.length/2; i++) 
      {
        beg = arr[i];
        end = arr[arr.length - 1 - i];
        
        arr[i] = end;
        arr[arr.length - 1 - i] = beg;
      }
      return arr;
    }
  
  public static void main(String[] args)
  {
    System.out.print("Enter the size of the array - ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int arr[] = new int[size];
    System.out.print("Enter the elements of array : ");
    for(int i=0; i<size; i++)
    {
      arr[i] = sc.nextInt();
    }

    System.out.println("Sum of elements of array is : " + sum(arr));
    System.out.println("Largest element of array is : " + largest(arr));
    System.out.println("Smallest element of array is : " + smallest(arr));
    System.out.println("Number of even elements of array are : " + isEven(arr));

    System.out.print("Enter the target element to search in array : ");
    int target = sc.nextInt();
    System.out.println("Index of target element is : " + target(arr, target));

    int[] result = reverse(arr);
    System.out.println("Reversed array is : " + Arrays.toString(result));
    
    sc.close();

  }
}
