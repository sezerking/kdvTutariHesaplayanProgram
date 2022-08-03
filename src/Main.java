import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran;

        Scanner scn = new Scanner(System.in);
        System.out.println("Ucret tutarını giriniz: ");
        tutar=scn.nextDouble();

        kdvOran=(tutar>=0 &&tutar<=1000)?0.18:0.08;

        double kdvTutar=tutar*kdvOran;
        double kdvliTutar=tutar+kdvTutar;

        System.out.println("Kdvsiz tutar: "+tutar);
        System.out.println("Kdv orani: "+kdvOran);
        System.out.println("Kdv tutari: "+kdvTutar);
        System.out.println("Kdvli tutar: "+kdvliTutar);
    }
}
