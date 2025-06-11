public abstract class Gad extends Zwierze{
    protected boolean czyJadowity;

    public Gad(String nazwa, int wiek, boolean czyJadowity) {
        super(nazwa, wiek);
        this.czyJadowity = czyJadowity;
    }
    public boolean isCzyJadowity() {
        return czyJadowity;
    }
    public void zmienSkore() {
        System.out.println(nazwa + "Zmieniia skore");
    }
}
