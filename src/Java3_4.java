public class Java3_4 {
    static int findMinDiff(int[] arr, int n)
    {
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));
        return diff;
    }
    int maxDiff(int array[], int arr_size)
    {
        int max_diff = array[1] - array[0];
        int i, j;
        for (i = 0; i < arr_size; i++)
        {
            for (j = i + 1; j < arr_size; j++)
            {
                if (array[j] - array[i] > max_diff)
                    max_diff = array[j] - array[i];
            }
        }
        return max_diff;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 5, 3, 19, 18, 25 };
        System.out.println("Minimum difference is " + findMinDiff(arr, arr.length));
        Java3_4 maxdif = new Java3_4();
        int array[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference is " + maxdif.maxDiff(array, 5));
        System.out.println("This is roshini");
    }

}

