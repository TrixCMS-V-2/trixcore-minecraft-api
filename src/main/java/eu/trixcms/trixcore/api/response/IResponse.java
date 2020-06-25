package eu.trixcms.trixcore.api.response;

public interface IResponse {

    /**
     * Get the returned HTTP Status Code
     * @return int
     */
    int statusCode();

    /**
     * Get the returned data
     * @return Object
     */
    Object data();

}
