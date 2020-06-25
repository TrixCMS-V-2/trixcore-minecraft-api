package eu.trixcms.trixcore.api.util;

import com.google.gson.GsonBuilder;

public class GsonParser<T> {

    /**
     * Deserialize a json string and convert it to an object
     * @param clazz output class
     * @param json string
     * @return Object
     */
    public T deserialize(Class<?> clazz, String json) {
        return (T) new GsonBuilder().serializeNulls().disableHtmlEscaping().create().fromJson(json, clazz);
    }

    /**
     * Serialize an object and return the created json string
     * @param response can be everything
     * @return json string
     */
    public String serialize(Object response) {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create().toJson(response);
    }

}
