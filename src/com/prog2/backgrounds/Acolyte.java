package com.prog2.backgrounds;

import com.prog2.enums.Skill;
import com.prog2.panels.InfoPanel;

import javax.swing.*;

public class Acolyte extends Background {

    public Acolyte(){
        this.backgroundName = "Acolyte";
        this.firstSkill = Skill.INSIGHT;
        this.secondSkill = Skill.RELIGION;
        this.proficiencies.add("Insight");
        this.proficiencies.add("Religion");
        // TODO add support for languages once infopanel is setup properly

        this.equipment.add("Holy symbol");
        this.equipment.add("Prayer book");
        this.equipment.add("5 sticks of incense");
        this.equipment.add("Vestments");
        this.equipment.add("Common clothes");

        this.gold += 15;
    }





    @Override
    public JPanel getSpecialUI() {
        return null;
    }
}
