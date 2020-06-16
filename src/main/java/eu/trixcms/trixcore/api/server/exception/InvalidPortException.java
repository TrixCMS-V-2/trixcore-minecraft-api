package eu.trixcms.trixcore.api.server.exception;

public class InvalidPortException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidPortException(Integer port) {
        super("Invalid port : " + port);
    }
}
