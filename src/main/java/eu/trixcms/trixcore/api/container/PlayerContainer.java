package eu.trixcms.trixcore.api.container;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class PlayerContainer {

    private final String name;

    private final UUID uuid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerContainer that = (PlayerContainer) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uuid);
    }
}
