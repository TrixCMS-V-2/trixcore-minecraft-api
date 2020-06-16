package eu.trixcms.trixcore.api.request;

import eu.trixcms.trixcore.api.method.exception.ArgsPreconditionFailedException;
import eu.trixcms.trixcore.api.method.exception.MethodNotFoundException;
import eu.trixcms.trixcore.api.response.IResponse;

public interface IRequestHandler {

    IResponse dispatch(String methodName, String[] args) throws MethodNotFoundException, ArgsPreconditionFailedException;

}
