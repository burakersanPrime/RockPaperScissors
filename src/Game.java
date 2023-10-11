import java.util.Random;

public class Game {

    public void oyunOyna() {
        Pc p = new Pc("BOT ");
        User k = new User("Burak ");
        while (p.puan < 3 && k.puan < 3) {
            int userSecim = k.oyna();
            int pcSecim = p.oyna();
            if (userSecim == pcSecim) {
                System.out.println("Berabere");
            } else if ((userSecim == 0 && pcSecim == 2) ||
                    (userSecim == 1 && pcSecim == 0) ||
                    (userSecim == 2 && pcSecim == 1)) {
                System.out.println(k.isim + "Kazandı.");
                k.puan++;
            } else {
                System.out.println(p.isim + "Kazandı.");
                p.puan++;
            }
        }
        if (p.puan == 3) System.out.println(p.isim + "Oyunu Kazandı.");
        else System.out.println(k.isim + "Oyunu Kazandı.");
    }
}
