//Nomor 2
import java.util.Random;
import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int player,bot,round,skrp,skrb;
        round = 1;
        skrp = 0;
        skrb = 0;
        System.out.println("==Gunting Batu Kertas==");
        System.out.println("Ketik nomor berikut untuk melakukan gerakan:");
        System.out.println("0 = gunting");
        System.out.println("1 = batu");
        System.out.println("2 = kertas");

        while (true) {
            System.out.println(" ");
            System.out.println("===Ronde " + round +"===");

            System.out.println("Gerakan Player");
            player = sc.nextInt();
            System.out.println("Gerakan Bot");
            bot = rand.nextInt(3);
            System.out.println(bot);

            //seri
            if (player == bot) {
                System.out.println("Seri");
                round++;
            }

            //bot win
            if (bot == 0 && player == 2) {
                System.out.println("+1 Skor untuk Bot");
                skrb++;
                round++;
            }
            if (bot == 1 && player == 0) {
                System.out.println("+1 Skor untuk Bot");
                skrb++;
                round++;
            }
            if (bot == 2 && player == 1){
                System.out.println("+1 Skor untuk Bot");
                skrb++;
                round++;
            }

            // pleyer win
            if (player == 0 && bot == 2) {
                System.out.println("+1 Skor untuk Player");
                skrp++;
                round++;
            }
            if (player == 1 && bot == 0) {
                System.out.println("+1 Skor untuk Player");
                skrp++;
                round++;
            }
            if (player == 2 && bot == 1){
                System.out.println("+1 Skor untuk Player");
                skrp++;
                round++;

            //gerakan tidak valid
            } else if (player < 0 || player > 2){
                System.out.println("Gerakan tidak valid, masukkan angka 0-2");
            }
            System.out.println("=============");
            System.out.println("Skor Player:" + skrp);
            System.out.println("Skor Bot:" + skrb);
            System.out.println("=============");
            //hasil
            if (skrp == 3){
                System.out.println("Selamat, Player menang!");
                break;
            }
            if (skrb == 3){
                System.out.println("Bot menang!");
                break;
            }
        }

    }

    }

