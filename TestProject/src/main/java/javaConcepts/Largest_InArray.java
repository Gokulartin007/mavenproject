package javaConcepts;

public class Largest_InArray {

	static int arr[] = {10, 324, 45, 90, 9808, 66};
    
    // Method to find maximum in arr[]
    public static int largest()
    {
        int i;
         
        // Initialize maximum element
        int max = arr[0];
      
        // Traverse array elements from second and
        // compare every element with current max 
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
      System.out.println(max);
        return max;
    }
     
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
       }
}


