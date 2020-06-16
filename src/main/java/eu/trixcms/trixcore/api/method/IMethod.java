package eu.trixcms.trixcore.api.method;

import eu.trixcms.trixcore.api.response.IResponse;

public interface IMethod {

    IResponse exec(String[] args);
}
