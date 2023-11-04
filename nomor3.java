//Nomor 3
import java.util.Scanner;
public class nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan tanggal (1-32)");
        int i = sc.nextInt();
        System.out.println("Masukkan bulan (ex: april)");
        String a = sc.next().toLowerCase();

        System.out.println("Zodiac anda adalah:");


        if ((a.equals("januari") && i >= 20 && i <= 31) || (a.equals("februari") && i >= 1 && i <= 18)) {
            System.out.println("Aquarius");

        } else if ((a.equals("februari") && i >= 19 && i <= 28) || (a.equals("maret") && i >= 1 && i <= 20)) {
            System.out.println("Pisces");

        } else if ((a.equals("maret") && i >= 21 && i <= 31) || (a.equals("april") && i >= 1 && i <= 19)) {
            System.out.println("Aries");

        } else if ((a.equals("april") && i >= 20 && i <= 30) || (a.equals("mei") && i >= 1 && i <= 20)) {
            System.out.println("Taurus");

        } else if ((a.equals("mei") && i >= 21 && i <= 31) || (a.equals("juni") && i >= 1 && i <= 20)) {
            System.out.println("Gemini");

        } else if ((a.equals("juni") && i >= 21 && i <= 30) || (a.equals("juli") && i >= 1 && i <= 22)) {
            System.out.println("Cancer");

        } else if ((a.equals("juli") && i >= 23 && i <= 31) || (a.equals("agustus") && i >= 1 && i <= 22)) {
            System.out.println("Leo");

        } else if ((a.equals("agustus") && i >= 23 && i <= 31) || (a.equals("september") && i >= 1 && i <= 22)) {
            System.out.println("Virgo");

        } else if ((a.equals("september") && i >= 23 && i <= 30) || (a.equals("oktober") && i >= 1 && i <= 22)) {
            System.out.println("Libra");

        } else if ((a.equals("oktober") && i >= 23 && i <= 31) || (a.equals("november") && i >= 1 && i <= 21)) {
            System.out.println("Scorpio");

        } else if ((a.equals("november") && i >= 22 && i <= 30) || (a.equals("desember") && i >= 1 && i <= 21)) {
            System.out.println("Sagittarius");

        } else if ((a.equals("desember") && i >= 22 && i <= 31) || (a.equals("januari") && i >= 1 && i <= 19)) {
            System.out.println("Capricorn");
        } else {
            System.out.println("Silahkan masukkan tanggal dan bulan yang valid");
        }
    }
}
