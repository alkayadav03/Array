import java.util.Scanner;
public class marks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        System.out.print("enter the elements of array");
        int[] mark=new int [n];
        for(int i=0;i<n;i++){
            mark[i]=sc.nextInt();
        }
             System.out.println("marks + result");
              for (int i = 0; i < n; i++) {
            System.out.print(mark[i] + "-> ");
            if(mark[i]<33){
                System.out.println("FAILED");
            }
            else System.out.println("PASSED");
        }
        }
    }
