package com.prog2;

import com.prog2.enums.Skill;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Map;

public abstract class CharacterClass {

    /*
   So first, make an abstract class called CharacterClass that contains information that is affected by all classes:

The type of hit dice you use
Proficiencies (armor, weapons, tools)
Saving Throws
Skill Choices
Starting Equipment Choice 1
Starting Equipment Choice 2
Starting Equipment Choice 3
Starting Equipment Choice 4 (Bard, Cleric, Fighter, Paladin, Ranger, Rogue, Sorcerer, Warlock, Wizard)
Starting Equipment Choice 5 (Cleric only)
Traits
Some classes have an origin to choose at level 1. For example, Sorcerers have to choose an origin of their powers. Warlocks have to choose who/what they made a pact with, etc. For this, we would need a way to update the UI based on the class choice when you choose certain classes. For now though, lets just get the basics down.
     */


    public int hitDiceType;

    public String equip1;
    public String equip2;
    public String equip3;

    public String equip4;
    public String equip5;

    public boolean equip4Avaliable;
    public boolean equip5Avavliable;



    public ArrayList<String> proficiencies;
    public Map<Skill, Boolean> skills;
    public Map<String, Boolean> savingThrows;


    public abstract JPanel getSpecialUI();
}
