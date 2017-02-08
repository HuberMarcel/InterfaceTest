/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.interfacetest;

/**
 *
 * @author viona25
 */
public class InterfaceTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Schokolade kleineSchokoladenTafel = new Schokolade();
        Schokolade ritterSport = new Schokolade("Ritter Sport");
        Zeitschrift kenneKeinenZeitschriftenNamen = new Zeitschrift();
        Zeitschrift titanic = new Zeitschrift("Titanic");
        new InterfaceTests().showSchokoladeAndPrice(kleineSchokoladenTafel);
        new InterfaceTests().showSchokoladeAndPrice(ritterSport);
        new InterfaceTests().showZeitschriftAndPrice(kenneKeinenZeitschriftenNamen);
        new InterfaceTests().showZeitschriftAndPrice(titanic);

    }

    void showSchokoladeAndPrice(Schokolade kleineSchokoTafel) {
        System.out.println(kleineSchokoTafel.name + ".\n"
                + "Sie schulden mir dafür " + kleineSchokoTafel.price() + " Euro"
        );
    }

    void showZeitschriftAndPrice(Zeitschrift zeitschrift) {
        System.out.println(zeitschrift.name + ".\n"
                + "Sie schulden mir dafür " + zeitschrift.price() + " Euro"
        );
    }

}
