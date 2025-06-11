public class Lew extends Ssak{

    public Lew(String nazwa, int wiek) {
        super(nazwa, wiek, true);
    }
    @Override
    public String wydajDzwiek() {
        return "Roar";
    }
    @Override
    public String poruszajSie() {
        return "Biegnie";
    }
    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna";
    }
    public void poluj() {
        System.out.println("nazwa + poluje");
    }
}
