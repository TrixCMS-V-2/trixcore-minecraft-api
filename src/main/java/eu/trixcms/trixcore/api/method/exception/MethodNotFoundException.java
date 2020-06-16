package eu.trixcms.trixcore.api.method.exception;

public class MethodNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public MethodNotFoundException(String method) {
        super("Method " + method + " doesn't exist.");
    }

}
