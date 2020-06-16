package eu.trixcms.trixcore.api.method.exception;

public class ArgsPreconditionFailedException extends Exception {

    public ArgsPreconditionFailedException(String condition){
        super("Method precondition failed : " + condition);
    }
}
