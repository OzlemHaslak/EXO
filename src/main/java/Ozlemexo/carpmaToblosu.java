package Ozlemexo;

import java.util.Scanner;

public class carpmaToblosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("carpim sayisi girniz");
        int s = input.nextInt();
        int n = 1;
        while (n<11) {
            System.out.println(s + "x" + n + "=" + s * n);
            n++;
        }
    }
}
