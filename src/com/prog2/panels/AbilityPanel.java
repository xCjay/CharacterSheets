package com.prog2.panels;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class AbilityPanel extends JPanel {

    JButton roll = new JButton("Roll your abilities");

    JLabel strength = new JLabel("Strength: ");
    JLabel dexterity = new JLabel("Dexterity: ");
    JLabel constitution = new JLabel("Constitution: ");
    JLabel intelligence = new JLabel("Intelligence: ");
    JLabel wisdom = new JLabel("Wisdom: ");
    JLabel charisma = new JLabel("Charisma: ");




    public AbilityPanel(){
        super();

        add(roll);
        add(strength);
        add(dexterity);
        add(constitution);
        add(intelligence);
        add(wisdom);
        add(charisma);

        roll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = new int[4];
                int small = 100;
                int total = 0;

                Random rd = new Random();
                for (int i = 0; i < 4; i++) {
                    arr[i] = rd.nextInt(6) + 1;
                    total += arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] < small){
                        small = arr[i];
                    }
                }
                strength.setText("Strength: " + Integer.toString(total-small));

                small = 100;
                total = 0;


                for (int i = 0; i < 4; i++) {
                    arr[i] = rd.nextInt(6) + 1;
                    total += arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] < small){
                        small = arr[i];
                    }
                }
                dexterity.setText("Dexterity: " + Integer.toString(total-small));

                small = 100;
                total = 0;


                for (int i = 0; i < 4; i++) {
                    arr[i] = rd.nextInt(6) + 1;
                    total += arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] < small){
                        small = arr[i];
                    }
                }
                constitution.setText("Constitution: " + Integer.toString(total-small));

                small = 100;
                total = 0;


                for (int i = 0; i < 4; i++) {
                    arr[i] = rd.nextInt(6) + 1;
                    total += arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] < small){
                        small = arr[i];
                    }
                }
                intelligence.setText("Intelligence: " + Integer.toString(total-small));

                small = 100;
                total = 0;


                for (int i = 0; i < 4; i++) {
                    arr[i] = rd.nextInt(6) + 1;
                    total += arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] < small){
                        small = arr[i];
                    }
                }
                wisdom.setText("Wisdom: " + Integer.toString(total-small));

                small = 100;
                total = 0;


                for (int i = 0; i < 4; i++) {
                    arr[i] = rd.nextInt(6) + 1;
                    total += arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] < small){
                        small = arr[i];
                    }
                }
                charisma.setText("Charisma: " + Integer.toString(total-small));



            }
        });
    }



}
