package arrays1;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
      int arr[] ={31, 14, 2, 11, 8};

for(int w:arr) {
    if (w == 11) {
        System.out.println(w + " var");
        break;
    }else
        System.out.println("yok");
    }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,14));
        System.out.println(Arrays.binarySearch(arr,35));
}
    }
