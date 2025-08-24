import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.print("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        int i=0;
        int j=n-1; 
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}