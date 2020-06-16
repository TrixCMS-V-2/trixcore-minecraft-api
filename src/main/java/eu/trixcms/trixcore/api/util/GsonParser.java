package eu.trixcms.trixcore.api.util;

import com.google.gson.GsonBuilder;

public class GsonParser<T> {

    @SuppressWarnings("unchecked")
    public T deserialize(Class<?> clazz, String json) {
        return (T) new GsonBuilder().serializeNulls().disableHtmlEscaping().create().fromJson(json, clazz);
    }

    public String serialize(Object response) {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create().toJson(response);
    }

}
