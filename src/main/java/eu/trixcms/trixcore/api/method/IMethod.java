package eu.trixcms.trixcore.api.method;

import eu.trixcms.trixcore.api.response.IResponse;

public interface IMethod {

    /**
     * Execute method
     * @param args
     * @return Response
     */
    IResponse exec(String[] args);
}
