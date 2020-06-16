package eu.trixcms.trixcore.api.container;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class CommandContainer {

    private final int time;
    private final String cmd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandContainer that = (CommandContainer) o;
        return time == that.time &&
                Objects.equals(cmd, that.cmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, cmd);
    }
}
