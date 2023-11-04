# Assignment1
Repository ini digunakan saya, Muhammad Yasser Ghifari Tegar Awally NPM:G1A023030, untuk mengumpulkan Assignment 1 mata kuliah Komputer dan Pemrograman dengan soal-soal sebagai berikut:
1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while
3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for


# Nomor 1
### Fungsi Program
Tujuan program ini adalah untuk melakukan perulangan 100 dengan output: 1 2 3 4 5 6 7 8 9 (Your Name) (Your Name) (Your Name).. dan seterusnya.
### Penjelasan Code
  ``` java
for (int i = 1; i <= 100; i++) {
  ```
1.Code diatas adalah for loop yang akan menambah nilai i dengan 1 jika nilai i dibawah 100.
``` java
if (i <= 9) {
                System.out.println(i);
            } else {
                System.out.println("Yasser");
            }
```
2.Statement if else diatas berguna untuk menentukan kapan program harus mulai menghasilkan output (Your Name), _if (i <= 9) { System.out.println(i);_ berarti program akan mengoutput nilai i jika nilai i tersebut kurang dari sama dengan 9, sementara _} else { System.out.println("Yasser"); }_ akan memerintahkan program untuk mengoutput "Yasser" jika kondisi _if (i <= 9)_ tidak terpenuhi.


# Nomor 2
### Fungsi Program
Program ini adalah permainan Gunting Batu Kertas sederhana dimana pemain akan melawan bot, pemain akan diminta memasukkan nilai dari 0-2 sementara bot akan memilih angka 0-2 secara acak, jika pemain atau bot menang, maka mereka akan mendapatkan 1 poin, yang pertama kali mendapatkan 3 poin akan memenangkan permainan.
### Penjelasan Code
``` java
Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int player,bot,round,skrp,skrb;
        round = 1;
        skrp = 0;
        skrb = 0;
```
1.Program ini menggunakan Scanner dan Random untuk menentukan gerakan pemain dan bot, variabel round digunakan untuk menentukan ronde berapa yang sedang berlangsung, variabel skrp dan skrb adalah variabel yang menentukan skor pemain dan bot.
``` java
System.out.println("==Gunting Batu Kertas==");
        System.out.println("Ketik nomor berikut untuk melakukan gerakan:");
        System.out.println("0 = gunting");
        System.out.println("1 = batu");
        System.out.println("2 = kertas");
```
2.Code diatas berfungsi untuk mengeluarkan output teks yang akan menjadi introduksi dan tutorial untuk permainan.


``` java
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
```
3.While loop diatas berguna untuk mengulang code if else sehingga program bisa meraih tujuan.
``` java
            System.out.println(" ");
            System.out.println("===Ronde " + round +"===");
            System.out.println("Gerakan Player");
            player = sc.nextInt();
            System.out.println("Gerakan Bot");
            bot = rand.nextInt(3);
            System.out.println(bot);
```
Code-code diatas berguna untuk memprint teks ronde, _player = sc.nextInt();_ adalah variabel untuk pemain dimana variabel tersebut adalah input user di console, _bot = rand.nextInt(3);_ adalah variabel yang digunakan bot yang bernilai angka acak dari 0 sampai 2.
``` java
if (bot == 0 && player == 2) {
                System.out.println("+1 Skor untuk Bot");
                skrb++;
                round++;
            }
```
Code if diatas adalah salah satu code yang digunakan untuk menentukan bagaimana sebuah ronde berakhir, _if (bot == 0 && player == 2)_ berarti code if akan aktif jika gerakan pilihan bot adalah 0 dan gerakan pilihan pemain adalah 2, _System.out.println("+1 Skor untuk Bot");_ akan memprint teks penambahan skor, _skrb++;_ dan _round++;_ akan menambah nilai 1 pada skor bot dan ronde permainan.
``` java
if (skrp == 3){
                System.out.println("Selamat, Player menang!");
                break;
```
Code diatas adalah kondisi if yang akan aktif jika skor player sama dengan 3, jika kondisi terpenuhi maka program akan mengeluarkan teks "Selamat, Player menang!" lalu menjalankan _break;_ yang akan mengakhiri loop dan program.


# Nomor 3
### Fungsi Program
Program ini bertujuan untuk menentukan zodiac pengguna, pertama pengguna harus menginput tanggal dan bulan kelahiran nya, contoh:1 dan januari. Lalu program akan menentukan zodiac apa yang cocok dengan tanggal dan bulan tersebut.
### Penjelasan Code
``` java
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan tanggal (1-32)");
        int i = sc.nextInt();
        System.out.println("Masukkan bulan (ex: april)");
        String a = sc.next().toLowerCase();
```
1.Diatas adalah variabel-variabel yang digunakan pada code, terdapat Scanner yang digunakan agar pengguna dapat menginput tanggal dan bulan kelahirannya, _int i = sc.nextInt();_ adalah variabel yang akan digunakan sebagai penentu tanggal, bernilai integer yang di input pengguna, _String a = sc.next().toLowerCase();_ adalah variabel yang akan digunakan sebagai penentu bulan, bernilai string yang di input pengguna.

``` java
        if ((a.equals("januari") && i >= 20 && i <= 31) || (a.equals("februari") && i >= 1 && i <= 18)) {
            System.out.println("Aquarius");
```
2.Code diatas adalah salah satu statement if yang digunakan untuk menentukan zodiac pengguna, _if ((a.equals("januari") && i >= 20 && i <= 31)_ berarti jika nilai a adalah januari dan nilai i diantara 20 dan 31 maka program akan mengoutput _System.out.println("Aquarius");_ yaitu zodiac "Aquarius"


# Nomor 4
### Fungsi Program
Program ini berfungsi untuk menampilkan semua nilai yang ada pada variabel tipe data array
### Penjelasan Code
``` java
String[] nilai = {"satu","dua","tiga"};
        for (int i=0;i<=2;i++){
            System.out.println(nilai[i]);
```
1.Code _String[] nilai = {"satu","dua","tiga"};_ akan membuat variabel array bertipe string yang memiliki nilai "satu" "dua" dan "tiga", code _for (int i=0;i<=2;i++){_ akan membuat loop for yang akan menjumlahkan nilai i hingga nilai i bernilai 2, _System.out.println(nilai[i]);_ akan mengoutput nilai array, nilai array mana yang akan di output akan ditentukan dengan nilai i setiap loop nya.



