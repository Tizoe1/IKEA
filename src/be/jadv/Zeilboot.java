package be.jadv;

public class Zeilboot extends Schip {
    private int aantalMasten;


    public Zeilboot(String naam, double lengte, int aantalMasten) {
        super(naam, lengte);
        this.aantalMasten = aantalMasten;

    }

    public int getAantalMasten() {
        return aantalMasten;
    }

    public void setAantalMasten(int aantalMasten) {
        this.aantalMasten = aantalMasten;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName()+ ": " + getNaam()  + ", lengte " + getLengte()+ "met " + getAantalMasten() + ": mast(en)]";
    }
}
