package com.prog2.panels;

import com.prog2.classes.Barbarian;

import javax.swing.*;

public class ClassPanel extends JPanel {

    private JPanel classChoicePanel;

    private JComboBox classChoiceCombo;


    public ClassPanel(){
        classChoicePanel = new JPanel();


        Barbarian b = new Barbarian();

        add(b.getSpecialUI());

    }
}
