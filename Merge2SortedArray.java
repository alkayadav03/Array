import java.util.Scanner;
import java.util.ArrayList;
public class Merge2SortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int a= sc.nextInt();

        int[] arr = new int[a];
        System.out.println("Enter elements of array 1:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

         System.out.print("Enter size of array 2: ");
        int b= sc.nextInt();

        int[] brr = new int[b];
        System.out.println("Enter elements of array 2:");
        for (int j = 0; j < b; j++) {
            brr[j] = sc.nextInt();
        }

        int[] c=new int[a+b];
        System.out.print("Before merging");
         for(int ele:c) System.out.print(ele+" ");
        System.out.println();
           System.out.print("After merging");
        merge(c,arr,brr);
        for(int ele:c) System.out.print(ele+" ");
        System.out.println();
    }
    public static void merge(int[]c,int[]arr,int[]brr ){
        int i=0,j=0,k=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                c[k]=arr[i];
                i++;
                k++;
            }
            else{
                c[k]=brr[j];
                j++;
                k++;
            }
            if(i==arr.length){
                while(j<brr.length){
                    c[k]=brr[j];
                    j++;
                    k++;
                }
            }
                if(j==brr.length){
                    while(i<arr.length){
                    c[k]=arr[i];
                    i++;
                    k++;
                }
            }
    }
    }
}
