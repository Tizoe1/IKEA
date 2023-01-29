package be.jadv;

import java.util.Comparator;

public class LengteSorteerder implements Comparator<Schip> {

    @Override
    public int compare(Schip o1, Schip o2) {
        return Double.compare(o1.getLengte(), o2.getLengte());
    }
}