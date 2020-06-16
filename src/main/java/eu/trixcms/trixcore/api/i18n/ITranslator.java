package eu.trixcms.trixcore.api.i18n;

public interface ITranslator<T> extends ICache<Lang, T> {

    String translate(Lang lang, String message_key, String... toReplace);

    String translate(Lang lang, String message_key, Boolean useCache, String... toReplace);

    String translate(String message_key, Boolean useCache, String... toReplace);

    String translate(String message_key, String... toReplace);

    String translateFull(String message);

    String translateFull(Lang lang, String message);

    Lang getActiveLanguage();

    // ALIASES
    String of(String message_key, String... toReplace);

    String of(String message_key, Boolean useCache, String... toReplace);
}
