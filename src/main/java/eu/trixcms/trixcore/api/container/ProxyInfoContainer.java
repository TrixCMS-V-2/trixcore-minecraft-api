package eu.trixcms.trixcore.api.container;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
public class ProxyInfoContainer {

    private final String ip;
    private final String version;
    private final List<ProxyServerContainer> servers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyInfoContainer that = (ProxyInfoContainer) o;
        return Objects.equals(ip, that.ip) &&
                Objects.equals(servers, that.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, servers);
    }
}