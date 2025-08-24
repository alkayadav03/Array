import java.util.Scanner;
public class ReverseArray_02{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.print("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}