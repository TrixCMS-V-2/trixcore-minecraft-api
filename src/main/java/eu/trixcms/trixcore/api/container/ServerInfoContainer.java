package eu.trixcms.trixcore.api.container;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class ServerInfoContainer {

    private final String name;
    private final String ip;
    private final String motd;
    private final String version;
    private final ServerCapacityContainer capacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerInfoContainer that = (ServerInfoContainer) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(motd, that.motd) &&
                Objects.equals(version, that.version) &&
                Objects.equals(capacity, that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ip, motd, version, capacity);
    }
}
