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
import java.util.List;

public interface IServer<T, U> {

    /**
     * Start the web server
     * @throws InvalidPortException
     * @throws InvalidConfigException
     */
    void start() throws InvalidPortException, InvalidConfigException;

    /**
     * Stop the web server
     */
    void stop();

    /**
     * Get TrixCore configuration instance
     * @return config
     */
    IConfig config();

    /**
     * Set TrixCore configuration
     * @param config
     * @return self
     * @throws InvalidPortException
     * @throws IOException
     */
    IServer<T, U> config(IConfig config) throws InvalidPortException, IOException;

    /**
     * Get TrixCore Scheduler instance
     * @return scheduler
     */
    IScheduler scheduler();

    /**
     * Set TrixCoe scheduler
     * @param scheduler
     * @return self
     */
    IServer<T, U> scheduler(IScheduler scheduler);

    /**
     * Set actual supported platform
     * @param serverType
     * @return self
     */
    IServer<T, U> serverType(ServerTypeEnum serverType);

    /**
     * Register a method, this is just an alias for IMethodsManager::addMethod method
     * @param method
     * @return self
     * @throws DuplicateMethodNameException
     * @throws InvalidMethodDefinitionException
     * @see eu.trixcms.trixcore.api.method.IMethodsManager#addMethod(IMethod)
     */
    IServer<T, U> registerMethod(IMethod method) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    /**
     * Register methods, this is just an alias for IMethodsManager::addMethods method
     * @param methods
     * @return self
     * @throws DuplicateMethodNameException
     * @throws InvalidMethodDefinitionException
     * @see eu.trixcms.trixcore.api.method.IMethodsManager#addMethods(List))
     */
    IServer<T, U> registerMethods(IMethod... methods) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    /**
     * Override a method already present, this is just an alias for IMethodsManager::overrideMethod method
     * @param oldMethodName
     * @param newMethod
     * @return self
     * @throws InvalidMethodDefinitionException
     * @see eu.trixcms.trixcore.api.method.IMethodsManager#overrideMethod(String, IMethod) 
     */
    IServer<T, U> overrideMethod(String oldMethodName, IMethod newMethod) throws InvalidMethodDefinitionException;

    /**
     * Set the port of the web server
     * The new port will also be saved (will trigger IConfig::saveServerPort method)
     * @param port
     * @return self
     * @throws InvalidPortException will occurs if port is less than 1000
     * @throws IOException
     * @see IConfig#saveServerPort(Integer)
     */
    IServer<T, U> setPort(Integer port) throws InvalidPortException, IOException;

    /**
     * Set the secret key
     * The new port will also be saved (will trigger IConfig::saveSecretKey method)
     * @param key
     * @return self
     * @throws IOException
     * @see IConfig#saveSecretKey(String)
     */
    IServer<T, U> setSecretKey(String key) throws IOException;

    /**
     * Set TrixCore translator instance
     * @param translator
     * @return self
     */
    IServer<T, U> translator(ITranslator<U> translator);

    /**
     * Get TrixCore ICommandManager instance
     * @return ICommandManager
     */
    ICommandManager<T> commandManager();

    /**
     * Set TriCore ICommandManager instance
     * @param manager
     * @return self
     */
    IServer<T, U> commandManager(ICommandManager<T> manager);
}
