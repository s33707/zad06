public abstract class Ssak extends Zwierze {
    protected boolean czyDrapieznik;

    public Ssak(String nazwa, int wiek, boolean czyDrapieznik) {
        super(nazwa, wiek);
        this.czyDrapieznik = czyDrapieznik;
    }
    public boolean isCzyDrapieznik() {
        return czyDrapieznik;
    }
    public void ssieMleko() {
        System.out.println(nazwa + "jest ssakiem więc pije mleko matki");
    }
}
