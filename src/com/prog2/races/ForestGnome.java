package com.prog2.races;

import com.prog2.enums.CreatureSize;

import javax.swing.*;

public class ForestGnome extends Race {
    public ForestGnome(){
        super();
        this.intelligence = 2;
        this.size = CreatureSize.SMALL;
        this.traits.add("Darkvision");
        this.intelligence =+1;
        this.wisdom +=1;
        this.charisma +=1;
        this.languages.add("Gnomish");


        this.dexterity +=1;
        this.spells.add("Cantrip");
        this.languages.add("Small Beasts");


    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }

}
