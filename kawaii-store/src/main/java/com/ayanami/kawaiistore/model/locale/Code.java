package com.ayanami.kawaiistore.model.locale;

public enum Code {
    EN("en_US"),
    UA("uk_UA");

    private final String localeCode;

    Code(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getLocaleCode() {
        return localeCode;
    }
}

