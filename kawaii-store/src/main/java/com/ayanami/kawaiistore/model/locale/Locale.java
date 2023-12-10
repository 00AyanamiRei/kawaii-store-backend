package com.ayanami.kawaiistore.model.locale;

public enum Locale {
    ENGLISH("en"),
    SPANISH("es"),
    FRENCH("fr"),
    GERMAN("de"),
    UKRAINE("ua");

    private final String code;

    Locale(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
