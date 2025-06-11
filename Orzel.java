public class Orzel extends Ptak{
    public Orzel(String nazwa, int wiek, double rozpietoscskrzydel){
        super(nazwa, wiek, rozpietoscskrzydel);
    }
    @Override
    public String wydajDzwiek() {
        return "Arr";
    }
    @Override
    public String poruszajSie() {
        return "Szybuje";
    }
    @Override
    public String srodowiskoNaturalne() {
        return "Góry";
    }
    public void wypatrujOfiary() {
        System.out.println(nazwwa +"Wypatruje ofiary");
    }
}
