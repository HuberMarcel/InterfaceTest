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
public class Zeitschrift implements IBuyable {

    String name;

    Zeitschrift() {
        name = "Schade, dass Sie für Ihre Zeitschrift den Namen nicht kennen, "
                + "deswegen wird sie ziemlich teuer, denn der Preis der "
                + "Zeitschrift berechnet sich mit Hilfe dieses Strings hier...";
    }

    Zeitschrift(String name) {
        this.name = name;
    }

    @Override
    public double price() {
        return ((double) name.length() / 10);
    }
}
