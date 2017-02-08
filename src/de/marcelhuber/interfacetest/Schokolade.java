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
public class Schokolade implements IBuyable {

    String name;

    Schokolade() {
        name = "Milka";
        System.out.println("Wenn Sie keinen Namen angeben, dann generiere ich "
                + "halt meine Lielingsschokolade: " + name);
    }

    Schokolade(String name) {
        this.name = name;
    }

    @Override
    public double price() {
        return 0.69;
    }

}
