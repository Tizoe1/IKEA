package be.jadv;

public abstract class Schip implements Comparable<Schip> {
    private double ID;
    private String naam;
    private double lengte;

    private static int aantalSchepen = 0;


    public Schip(String naam, double lengte) {
        this.naam = naam;
        this.lengte = lengte;
        aantalSchepen++;
        ID = aantalSchepen;
    }


    //getters & setters
    protected double getID() {
        return ID;
    }


    protected String getNaam() {
        return naam;
    }

    protected void setNaam(String naam) {
        this.naam = naam;
    }

    protected double getLengte() {
        return lengte;
    }

    protected void setLengte(double lengte) {
        this.lengte = lengte;
    }


    @Override
    public int compareTo(Schip o) {
        return this.naam.compareTo(o.getNaam());
    }
}


