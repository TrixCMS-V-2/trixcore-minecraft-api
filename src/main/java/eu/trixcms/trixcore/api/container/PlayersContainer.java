package eu.trixcms.trixcore.api.container;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Getter
@AllArgsConstructor
public class PlayersContainer {

    private List<PlayerContainer> playerList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayersContainer that = (PlayersContainer) o;
        return Objects.equals(playerList, that.playerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerList);
    }
}
