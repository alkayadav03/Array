import java.util.Scanner;
public class Segregate0sand1s{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
         System.out.print("enter elements(0s and 1s:)");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int numberOfZeros=0;
         int numberOfOnes=0;
         for(int i=0;i<n;i++){ 
            if(arr[i]==0){
                numberOfZeros++;
            }
            else numberOfOnes++;
         }
         for(int i=0;i<numberOfZeros;i++){ 
         System.out.print("0 ");
         }
         for(int i=0;i<numberOfOnes;i++){
            System.out.print("1 ");
         }
    }
}