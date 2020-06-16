package eu.trixcms.trixcore.api.method;

import eu.trixcms.trixcore.api.method.exception.DuplicateMethodNameException;
import eu.trixcms.trixcore.api.method.exception.InvalidMethodDefinitionException;
import eu.trixcms.trixcore.api.request.IRequestHandler;

import java.util.List;
import java.util.Map;

public interface IMethodsManager extends IRequestHandler {

    void addMethod(IMethod IMethod) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    void addMethods(List<IMethod> IMethods) throws DuplicateMethodNameException, InvalidMethodDefinitionException;

    void removeMethod(IMethod IMethod);

    void removeMethod(String methodName);

    void overrideMethod(IMethod oldIMethod, IMethod newIMethod) throws InvalidMethodDefinitionException;

    void overrideMethod(String oldMethodName, IMethod newIMethod) throws InvalidMethodDefinitionException;

    boolean methodExist(String methodName);

    Map<String, IMethod> getMethods();
}
