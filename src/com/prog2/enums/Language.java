package com.prog2.enums;

import java.util.Locale;

public enum Language {
    COMMON, DWARVISH, ELVISH, INFERNAL, CELESTIAL, DRACONIC;

    private String displayName;

    Language(){
        String s = name().toLowerCase();
        this.displayName = s.substring(0,1).toUpperCase() + s.substring(1);
    }

    @Override
    public String toString() {
        return displayName;
    }
}
