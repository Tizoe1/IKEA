package be.jadv;

import be.jadv.exception.SchipNietGevondenException;
import com.sun.source.tree.Tree;

import java.util.*;

public class Haven {
    private String naam;
    private double maximeLengte = 150;
    private int aantalSchepen = 0;

    private HashSet<Schip> schepen = new HashSet<>();


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getMaximeLengte() {
        return maximeLengte;
    }

    public void setMaximeLengte(double maximeLengte) {
        this.maximeLengte = maximeLengte;
    }

    public int getAantalSchepen() {
        return aantalSchepen;
    }

    public void setAantalSchepen(int aantalSchepen) {
        this.aantalSchepen = aantalSchepen;
    }

    public Set<Schip> getSchepen() {
        return schepen;
    }

   // public void setSchepen(Set<Schip> schepen) {
     //   this.schepen = schepen;
    //}


    public boolean aanmeren(Schip schip) {
        System.out.println("Aanmeren van " + schip.toString());
        double curentLengte = 0;

        for (Schip s : this.schepen) {
            curentLengte += s.getLengte();
        }
        double availablePlaces = maximeLengte - curentLengte;
        if (availablePlaces < maximeLengte) {
            if (schip.getClass().getSimpleName().equals("Vrachtschip")) {
                Vrachtschip vrachtschip = (Vrachtschip) schip;
                vrachtschip.loods();
            }
            this.schepen.add(schip);
            return true;
        }
        // else {
        return false;
        //}
    }

    public void afmeren(Schip schip) throws SchipNietGevondenException {
        boolean bestaat = false;

        for (Schip s : this.schepen) {
            if (s.getNaam().equals(schip.getNaam())) {
                bestaat = true;
            }
        }
        if (!bestaat) {
            throw new SchipNietGevondenException("Afmeren mislukt: Schip " + schip.getNaam() + " ligt niet in onze haven");
        }

    }

    public List<Schip> geefSchepenGesorteerdOpNaam() {
        List<Schip> gesorteerdeSchepen = new ArrayList<>(this.schepen);
        Collections.sort(gesorteerdeSchepen);
        return gesorteerdeSchepen;

    }
    public ArrayList<Schip> geefSchepenGestorteerdOpLengte() {
        ArrayList<Schip> gesorteerdeSchepen = new ArrayList<>(this.schepen);
        Collections.sort(gesorteerdeSchepen, new LengteSorteerder());
        return gesorteerdeSchepen;
    }

}
