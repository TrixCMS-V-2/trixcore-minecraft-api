package eu.trixcms.trixcore.api.i18n;

public interface IMessageRepository extends ICache<String, String>, ILang {

    String translate(String message_key);

    String translate(String message_key, Boolean useCache);

    IMessageSource getSource();

}
