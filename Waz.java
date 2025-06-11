public class Waz extends Gad{

    public Waz(String nazwa, int wiek, boolean czyJadowity){
        super(nazwa, wiek, czyJadowity);
    }
    @Override
    public String wydajDzwiek() {
        return "Sss";
    }
    @Override
    public String poruszajSie() {
        return "Pełza";
    }
    @Override
    public String srodowiskoNaturane() {
        return "Dżungla";
    }
    public void ukryjSie() {
        System.out.println(nazwa + "ukrywa się");
    }
}
