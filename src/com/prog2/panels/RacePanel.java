package com.prog2.panels;

import com.prog2.races.Dwarf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RacePanel extends JPanel{

    JComboBox<String> raceCombo = new JComboBox<>();
    JComboBox<String> subRaceCombo = new JComboBox<>();

    JLabel raceLabel = new JLabel("Select Race");
    JLabel subRaceLabel = new JLabel("Select Sub-Race");
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

        add(raceLabel);
        add(raceCombo);
        add(subRaceLabel);
        add(subRaceCombo);
        raceCombo.setSelectedIndex(-1);





        raceCombo.setSize(200, 100);


        raceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch(raceCombo.getSelectedItem().toString()){
                    case "Dragonborn":
                        subRaceCombo.removeAllItems();
                        subRaceCombo.addItem("Standard");
                        subRaceCombo.addItem("Draconblood");
                        subRaceCombo.addItem("Ravenite");
                        subRaceCombo.addItem("Chromatic Dragonborn");
                        subRaceCombo.addItem("Gem Dragonborn");
                        subRaceCombo.addItem("Metalic Dragonborn");
                        break;

                    case "Dwarf":
                        subRaceCombo.removeAllItems();
                        subRaceCombo.addItem("Hill Dwarf");
                        subRaceCombo.addItem("Mountain Dwarf");
                        break;



                    default:
                        subRaceCombo.removeAllItems();
                        break;
                }
            }
        });
    }

}
