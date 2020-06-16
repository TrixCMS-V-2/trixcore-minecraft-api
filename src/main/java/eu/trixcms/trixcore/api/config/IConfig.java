package eu.trixcms.trixcore.api.config;

import java.io.IOException;

public interface IConfig {

    String getSecretKey();

    Integer getServerPort();

    void saveSecretKey(String key) throws IOException;

    void saveServerPort(Integer port) throws IOException;
}
