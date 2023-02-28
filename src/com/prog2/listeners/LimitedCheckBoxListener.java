package com.prog2.listeners;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LimitedCheckBoxListener implements ItemListener {


    private JCheckBox[] boxes;
    private int selectedCount; // the number of checkboxes currently selected
    private int MAX_CHOICES; // the maximum number of checkboxes I can select;

    public LimitedCheckBoxListener(int choiceLimit, JCheckBox... boxes){
        this.MAX_CHOICES = choiceLimit;
        this.boxes = boxes;


        selectedCount = 0;
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox source = (JCheckBox) e.getSource();

        if (source.isSelected()){
            selectedCount++;

            if (selectedCount >= MAX_CHOICES){
                for (JCheckBox box : boxes) {
                    if (!box.isSelected()) box.setEnabled(false);
                }
            }
        } else {
            if (selectedCount >= MAX_CHOICES){
                for (JCheckBox box : boxes) {
                    box.setEnabled(true);
                }
            }
            selectedCount--;
        }
    }
}
