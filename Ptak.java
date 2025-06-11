public abstract class Ptak extends Zwierze{
    protected double rozpietoscSkrzydel;

    public Ptak(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }
    public double getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }
    public void lataj() {
        System.out.println(nazwa + "Lata, i rozpiętość skrzydeł to" + rozpietoscSkrzydel + "m.");
    }
}
