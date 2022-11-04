package arrays1;

public class Arrays2 {
    public static void main(String[] args) {
        String arr1[] = {"ali","veli","ayse"};

        System.out.println(arr1.length); //3
        System.out.println(arr1[0]+" "+ arr1[arr1.length-1]);


        int [] array = new int[]{90,23,5,109,12,22,67,34};

        for (int i :  array){
            System.out.print(i +" ");



        }System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");

        }
    }
}
