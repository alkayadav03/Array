import java.util.Arrays;
public class SortArrayBuildIn{
    public static void main(String[] args){
        int [] arr={1,97,34,56,23,34};
        print(arr);
        Arrays.sort(arr);
         print(arr);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+ " ");
        }
         System.out.println();
    }
}