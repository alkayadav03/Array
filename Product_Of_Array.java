import java.util.Scanner;
public class Product_Of_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
         System.out.print("enter the elements of array:");
         int [] arr=new int[n];
          int product=1;
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            // int product=1;
            product=product*arr[i];
            //  System.out.print(product+" ");
         }
         System.out.print(product+" ");
    }
}
