package arrays1;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        String arr []={"S","M","A","T"};
        System.out.println(Arrays.toString(arr));// S M A T
    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //A M S T


        //verilen bir array de en kucuk ve en buyuk degerleri yazdirin

        int arr1 []={3,5,6,1,9,45,25,4,9,0};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("en kucuk sayi "+ arr1[0]+" en buyuk sayi "+arr1[arr1.length-1]);

        System.out.println(arr1[0]+arr1[arr1.length-1]);

        for (int w : arr1){
        if ( w == 5){
            System.out.println(w);
            break;

        }

        System.out.println(Arrays.binarySearch(arr1,6));
        System.out.println(Arrays.binarySearch(arr1,57));
    }
}}
