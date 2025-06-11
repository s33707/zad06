public class Main {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Simba", 3);
        Zwierze orzel = new Orzel("Bielik", 2, 3.1);
        Zwierze waz = new Waz("Pyton", 1, true);

        Zwierze[] zwierzeta = {lew, orzel, waz};

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dzwięk:" + z.wydajDzwiek());
            System.out.println("Ruch:" + z.poruszajSie());
            System.out.println("Srodowisko:" + z.srodowiskoNaturalne());
            System.out.println();
        }

        ((Lew) lew).poluj();
        ((Orzel) orzel).wypatrujOfiary();
        ((Waz) waz).ukryjSie();
    }
}