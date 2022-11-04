package Ozlemexo;

import java.util.Scanner;

public class charSplit {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("isim soy isim giriniz");

        String isimSoyIsim = input.nextLine();

        char ilkHarfIlkIsim = isimSoyIsim.charAt(0);
        System.out.print(ilkHarfIlkIsim);

        char ilkHarfSonIsim = isimSoyIsim.split(" ")[1].charAt(0);
        System.out.println(ilkHarfSonIsim);
    }
}
