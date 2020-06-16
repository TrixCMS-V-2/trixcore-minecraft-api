package eu.trixcms.trixcore.api.container;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class ProxyServerContainer {

    private final String name;
    private final String motd;
    private final int playerCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyServerContainer that = (ProxyServerContainer) o;
        return playerCount == that.playerCount &&
                Objects.equals(name, that.name) &&
                Objects.equals(motd, that.motd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, motd, playerCount);
    }
}