package eu.trixcms.trixcore.api.method.exception;

public class InvalidMethodDefinitionException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidMethodDefinitionException(Class<?> clazz) {
        super("Method " + clazz + " isn't well defined");
    }

}
