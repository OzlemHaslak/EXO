package Ozlemexo;

public class forIf {
    public static void main(String[] args) {
     /* 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız.*/

        ;

    /*   for(int i=120; i>10; i--){
        if (i % 4==0 && i % 6==0){
            System.out.print(i+" ");}

    }}}*/




        /*2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; accessories ´ ces*/
      /* String su ="accessories";
        String d= " ";
        for(int i=0; i<su.length(); i++){
            String c =su.substring(i,i+1);
            if(su.indexOf(c)!=su.lastIndexOf(c)){
                if( !d.contains(c)){
                    d=d+c;
                }
        }
                }

        System.out.println(d);}}*/


    /*Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır*/

    String isim = "arcbbcra";
    String l = " ";
            for(int i = 0;i<isim.length();i++){
                char c=isim.charAt(i);
                if(c!='a'){
                    continue;}
                System.out.print((i+" "));
            }}}




