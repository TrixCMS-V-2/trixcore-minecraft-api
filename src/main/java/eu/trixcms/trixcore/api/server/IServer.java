package eu.trixcms.trixcore.api.server;

import eu.trixcms.trixcore.api.command.ICommandManager;
import eu.trixcms.trixcore.api.config.IConfig;
import eu.trixcms.trixcore.api.config.exception.InvalidConfigException;
import eu.trixcms.trixcore.api.i18n.ITranslator;
import eu.trixcms.trixcore.api.method.IMethod;
import eu.trixcms.trixcore.api.method.exception.DuplicateMethodNameException;
import eu.trixcms.trixcore.api.method.exception.InvalidMethodDefinitionException;
import eu.trixcms.trixcore.api.scheduler.IScheduler;
import eu.trixcms.trixcore.api.server.exception.InvalidPortException;
import eu.trixcms.trixcore.api.util.ServerTypeEnum;

import java.io.IOException;
import java.net.UnknownHostException;

public interface IServer<T, U> {

    void start() throws InvalidPortException, InvalidConfigException;

    void stop();

    IConfig config();

    IServer<T, U> config(IConfig config) throws InvalidPortException, IOException;

    IScheduler scheduler();

    IServer<T, U> scheduler(IScheduler scheduler);

    IServer<T, U> serverType(ServerTypeEnum serverType);

    IServer<T, U> registerMethod(IMethod IMethod) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    IServer<T, U> registerMethods(IMethod... IMethod) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    IServer<T, U> setPort(Integer port) throws InvalidPortException, IOException;

    IServer<T, U> setSecretKey(String key) throws IOException;

    IServer<T, U> translator(ITranslator<U> translator);

    ICommandManager<T> commandManager();

    IServer<T, U> commandManager(ICommandManager<T> manager);
}
