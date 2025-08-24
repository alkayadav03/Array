import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        
         int [] arr=new int[n];
        System.out.print("enter the elements of array: ");
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           
           
             System.out.print("enter the target element: ");
          int target=sc.nextInt();
          
          int flag=0;
          for(int i=0;i<n;i++){
        if(arr[i]==target){
            flag=1;
             System.out.print("element found at index: " +(i+1));
             break;
        }
          }
        
        if(flag==0)System.out.print("element not found");
}
}