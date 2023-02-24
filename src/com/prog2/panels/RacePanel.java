package com.prog2.panels;

import javax.swing.*;

public class RacePanel extends JPanel{

    JComboBox<String> raceCombo = new JComboBox<>();
    public RacePanel(){
        super();
        raceCombo.addItem("Dragonborn");
        raceCombo.addItem("Dwarf");
        raceCombo.addItem("Elf");
        raceCombo.addItem("Gnome");
        raceCombo.addItem("Half-Elf");
        raceCombo.addItem("Halfling");
        raceCombo.addItem("Half-Orc");
        raceCombo.addItem("Human");
        raceCombo.addItem("Tiefling");


        raceCombo.setSize(200, 100);

        add(raceCombo);
    }
}
