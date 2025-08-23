import java.util.Scanner;
public class Minimum_element{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        System.out.print("enter elements");
         int []arr=new int[n];
         int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           if(arr[i]<min){
            min=arr[i];
           }
        }
         System.out.print(min);
    }
}