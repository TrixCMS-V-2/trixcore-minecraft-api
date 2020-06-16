package eu.trixcms.trixcore.api.container;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class ServerCapacityContainer {

    private final int actual;
    private final int maximum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerCapacityContainer that = (ServerCapacityContainer) o;
        return actual == that.actual &&
                maximum == that.maximum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actual, maximum);
    }
}
