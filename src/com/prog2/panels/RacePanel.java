package com.prog2.panels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RacePanel extends JPanel{

    JComboBox<String> raceCombo = new JComboBox<>();
    JComboBox<String> subRace = new JComboBox<>();
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


        raceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(subRace);
                switch(raceCombo.getSelectedItem().toString()){
                    case "Dwarf":
                        subRace.removeAll();
                        subRace.addItem("Hill Dwarf");
                        subRace.addItem("Mountain Dwarf");
                        add(subRace);
                        break;


                    default:
                        subRace.removeAll();
                        break;
                }



            }
        });

        add(raceCombo);
    }
}
