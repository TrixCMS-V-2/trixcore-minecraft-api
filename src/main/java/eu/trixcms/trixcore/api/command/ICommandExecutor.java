package eu.trixcms.trixcore.api.command;

public interface ICommandExecutor<T> {

    boolean executeCommand(T t);

}
