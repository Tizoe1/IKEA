package be.jadv;

public class Vrachtschip extends Schip implements Loodsbaar {
    private double laadVermogen;


    public Vrachtschip(String naam, double lengte, double laadVermogen) {
        super(naam, lengte);
        this.laadVermogen = laadVermogen;
    }

    public double getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(double laadVermogen) {
        this.laadVermogen = laadVermogen;
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + getNaam()  + ", lengte " + getLengte()+ " laadvermogen: " + getLaadVermogen() + ": ton]";
    }

    @Override
    public void loods() {
        System.out.println( getClass().getSimpleName()+ " " + getNaam() + " loodsen.");
    }
}
