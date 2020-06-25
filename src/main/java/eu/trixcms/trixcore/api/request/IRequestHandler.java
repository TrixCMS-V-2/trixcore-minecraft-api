package eu.trixcms.trixcore.api.request;

import eu.trixcms.trixcore.api.method.exception.ArgsPreconditionFailedException;
import eu.trixcms.trixcore.api.method.exception.MethodNotFoundException;
import eu.trixcms.trixcore.api.response.IResponse;

public interface IRequestHandler {

    /**
     * Dispatch a request.
     * @param methodName
     * @param args
     * @return reponse
     * @throws MethodNotFoundException
     * @throws ArgsPreconditionFailedException
     */
    IResponse dispatch(String methodName, String[] args) throws MethodNotFoundException, ArgsPreconditionFailedException;

}
