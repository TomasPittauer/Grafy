package day_01_10;

enum Fixy{
    CERNA("000"),
    MODRA("001"),
    CERVENA("002");

    String hexcode;

    Fixy(String hexcode) {
        
        this.hexcode = hexcode;
    }
}
public class enum_2 {
    public static void main(String[] args) {
        Fixy cerna_fixa = Fixy.CERNA;
        String barva = cerna_fixa.hexcode;
        System.out.println(barva);
    }


}
