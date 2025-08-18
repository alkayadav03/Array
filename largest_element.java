import java.util.Scanner;
public class largest_element{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
         System.out.print("enter the elements of array:");
         int [] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
            int max=arr[0];
             for(int i=0;i<n;i++){
                if(arr[i]> max){
                    max=arr[i];
                }
                //  System.out.print(max);
             }
              System.out.print(max);
    }
}