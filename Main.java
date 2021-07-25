public class Main {
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Radix Sort");
        System.out.println("--------------------");
        int arr_radix[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n_radix = arr_radix.length;
        RadixSort oi = new RadixSort();
        System.out.println("Given Array:");
        for (int i = 0;i < n_radix;i++ ) 
        {
            System.out.print(arr_radix[i]+" ");    
        }
        System.out.println();
        System.out.println();
        oi.radixsort(arr_radix, n_radix);
        System.out.println("Sorted Array:");
        oi.print(arr_radix, n_radix);
        System.out.println();
        System.out.println();
    }
}