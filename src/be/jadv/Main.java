package be.jadv;

import be.jadv.exception.SchipNietGevondenException;

public class Main {
    public static void main(String[] args) throws SchipNietGevondenException {
        Vrachtschip vrachtschip = new Vrachtschip("SuperMaramiu", 300.0, 7500);
        Zeilboot zeilboot = new Zeilboot("smalleSally", 15.0, 1);

        System.out.println(vrachtschip.toString());
        System.out.println(zeilboot.toString());
        System.out.println(vrachtschip.getID());
        System.out.println(zeilboot.getID());



        Vrachtschip vrachtschip1 = new Vrachtschip("GroteFrans", 100, 2500);
        Vrachtschip vrachtschip2 = new Vrachtschip("SuperMaramiu", 400, 7500);
        Zeilboot zeilboot1 = new Zeilboot("Wally-Kiwi", 15, 1);


        System.out.println("-----------   Haven Hawa-Kiwi    ----------- ");

        Haven haven = new Haven();
        haven.setNaam("SmalleSally");
        haven.setMaximeLengte(150);

        haven.aanmeren(vrachtschip1);
        vrachtschip1.loods();
        haven.aanmeren(zeilboot);

        haven.aanmeren(vrachtschip2);

        haven.afmeren(vrachtschip1);
        haven.afmeren(zeilboot);
        haven.afmeren(vrachtschip2);








    }
}