import java.util.*;
public class Java3_1
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n=inp.nextInt();
        int i,sum=0;
        int arr[]=new int[n];
        System.out.print("\n Enter: ");
        for(i=0;i<n;i++)
        {
            arr[i]=inp.nextInt();
        }

        int max=arr[0],min=arr[0];

        for(i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];

            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("\n Maximum Number: "+max);
        System.out.println("\n Minimum Number: "+min);
        System.out.println("The size of the array is " + arr.length);
        int [] array = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("Array in reverse order: ");
        for (int j = array.length-1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }

    }
}