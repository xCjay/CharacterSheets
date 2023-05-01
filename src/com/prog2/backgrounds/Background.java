package com.prog2.backgrounds;

import com.prog2.enums.Language;
import com.prog2.enums.Skill;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Background {
    public String backgroundName;

    public Skill firstSkill;
    public Skill secondSkill;

    public ArrayList<String> proficiencies;
    public ArrayList<Language> languages;
    public ArrayList<String> equipment;

    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int plat;

    public Background() {
        proficiencies = new ArrayList<>();
        languages = new ArrayList<>();
        equipment = new ArrayList<>();
    }

    public abstract JPanel getSpecialUI();

    @Override
    public String toString() {
        return backgroundName;
    }
}
