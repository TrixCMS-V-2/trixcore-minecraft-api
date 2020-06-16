package eu.trixcms.trixcore.api.i18n;

import java.util.Map;

public interface ICache<T, V> {

    Map<T, V> get();

    void clear();

}
