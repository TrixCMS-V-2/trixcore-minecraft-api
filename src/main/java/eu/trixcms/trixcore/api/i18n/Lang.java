package eu.trixcms.trixcore.api.i18n;

public enum Lang {

    FRENCH("fr", "French"),
    ENGLISH("en", "English");

    private String locale;
    private String langName;

    private Lang(String locale, String langName) {
        this.locale = locale;
        this.langName = langName;
    }

    public static Lang getLangByValue(String locale) {
        for (Lang lang : Lang.values())
            if (lang.locale.equalsIgnoreCase(locale)) return lang;

        return Lang.ENGLISH;
    }

    public String getLocale() {
        return locale;
    }

    public String getLangName() {
        return langName;
    }
}
