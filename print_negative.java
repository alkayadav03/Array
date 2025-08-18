import java.util.Scanner;
public class print_negative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
         System.out.print("enter the elements of array:");
         int [] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                 System.out.print(arr[i]+" ");
            }
         }

    }
}