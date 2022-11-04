package stringBuilder1;

public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("java guzel");

        System.out.println(st1.length()); //14
        System.out.println(st1.capacity()); //30

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());//10  capacity 14

        System.out.println(st1.indexOf("j"));

    }
}
