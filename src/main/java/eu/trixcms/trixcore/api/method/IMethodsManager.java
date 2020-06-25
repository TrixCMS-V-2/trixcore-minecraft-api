package eu.trixcms.trixcore.api.method;

import eu.trixcms.trixcore.api.method.exception.DuplicateMethodNameException;
import eu.trixcms.trixcore.api.method.exception.InvalidMethodDefinitionException;
import eu.trixcms.trixcore.api.request.IRequestHandler;

import java.util.List;
import java.util.Map;

public interface IMethodsManager extends IRequestHandler {

    /**
     * Register a method
     * @param IMethod
     * @throws DuplicateMethodNameException
     * @throws InvalidMethodDefinitionException
     */
    void addMethod(IMethod IMethod) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    /**
     * Register methods
     * @param IMethods
     * @throws DuplicateMethodNameException
     * @throws InvalidMethodDefinitionException
     */
    void addMethods(List<IMethod> IMethods) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    /**
     * Remove a method by it's instance
     * @param method
     */
    void removeMethod(IMethod method);

    /**
     * Remove a method by it's name
     * @param methodName
     */
    void removeMethod(String methodName);

    /**
     * Override a method defined by it's instance
     * @param oldMethod
     * @param newMethod
     * @throws InvalidMethodDefinitionException
     */
    void overrideMethod(IMethod oldMethod, IMethod newMethod) throws InvalidMethodDefinitionException;

    /**
     * Override a method defined by it's name
     * @param oldMethodName
     * @param newMethod
     * @throws InvalidMethodDefinitionException
     */
    void overrideMethod(String oldMethodName, IMethod newMethod) throws InvalidMethodDefinitionException;

    /**
     * Return true if method exists
     * @param methodName
     * @return methid exists
     */
    boolean methodExist(String methodName);

    /**
     * Get registered methods
     * @return methods
     */
    Map<String, IMethod> getMethods();
}
