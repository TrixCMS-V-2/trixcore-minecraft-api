package eu.trixcms.trixcore.api.command;

import java.io.IOException;
import java.util.List;

public interface ICommandManager<T> {

    void add(T t) throws IOException;

    List<T> get();

    void clear();

}
