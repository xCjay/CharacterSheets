package com.prog2.panels;

import com.prog2.charactersheets.CharacterSheet;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AbilityPanel extends JPanel {



    JLabel abilityLabel = new JLabel("Ability: ");


    JButton roll = new JButton("Roll your abilities");

    public AbilityPanel(){
        add(abilityLabel);
        add(roll);
        roll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 = fetchAbility();
                updateLabel();
            }
        });
    }


    public String fetchAbility(){
        String[] abilities = {"Hello", "There", "World"};
        Random rand = new Random();

        return abilities[rand.nextInt(0, abilities.length)];
    }

    public void updateLabel(){
        abilityLabel.setText("Ability: " + ability);
    }
}
