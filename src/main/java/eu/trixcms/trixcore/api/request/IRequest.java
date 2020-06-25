package eu.trixcms.trixcore.api.request;

public interface IRequest {

    /**
     * Get the called method from the request
     * @return method
     */
    String method();

    /**
     * Get all arguments sent with the request
     * @return args
     */
    String[] args();

}
