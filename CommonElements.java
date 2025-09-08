import java.util.*;

public class CommonElements{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        ArrayList<Integer> common = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
           
                common.add(arr1[i]);
                i++;
                j++;
            }
             else if (arr1[i] < arr2[j]) {
                i++; 
            } 
            else {
                j++;
            }
        }

        System.out.println("Common elements: " + common);
    }
}
