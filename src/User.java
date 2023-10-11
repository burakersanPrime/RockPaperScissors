import java.util.Random;
import java.util.Scanner;

public class User {
    public String isim;
    public int puan;
    public Scanner sc = new Scanner(System.in);

    public User(String isim) {
        this.isim = isim;
        this.puan = 0;
    }

    public int oyna() {
        int sonuc = -1;
        while (sonuc == -1) {
            try {
                while (sonuc < 0 || sonuc > 2) {
                    System.out.println("0- TAŞ\n" +
                            "1- KAĞIT\n" +
                            "2- MAKAS\n" +
                            "Lütfen Seçiniz.\n");
                    sonuc = sc.nextInt();
                    if (sonuc < 0 || sonuc > 2) System.out.println("Yanlış Değer Girdiniz.");
                }
            } catch (Exception e) {
                System.out.println("0, 1 veya 2 giriniz;");
            }
        }
        if (sonuc == 0) System.out.println(this.isim + "TAS Secti");
        else if (sonuc == 1) System.out.println(this.isim + "KAGIT Secti");
        else System.out.println(this.isim + "MAKAS Secti");
        return sonuc;
    }
}
