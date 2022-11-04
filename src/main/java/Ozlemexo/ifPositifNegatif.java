package Ozlemexo;

import java.util.Scanner;

public class ifPositifNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tam isminiz giriniz");

        String ilkIsim = input.nextLine();

        char ilkHarfIlkIsim= ilkIsim.charAt(0);
        System.out.print(ilkHarfIlkIsim);

        char ilkHarfIkinciIsim= ilkIsim.split(" ")[1].charAt(0);
        System.out.println(ilkHarfIkinciIsim);
        }
    }

