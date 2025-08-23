public class EvenOddPuzzel{
    public static void main(String[] args){
        int [] arr={1,2,34,56,3,15};
        for(int i=0;i<arr.length;i++){
        if(i%2==0){
            arr[i]=arr[i]+10;
        }
        else{
             arr[i]=arr[i]*2;
        }
        }
        print(arr);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+ " ");
        }
         System.out.println();
    }
}