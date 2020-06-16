package eu.trixcms.trixcore.api.request.exception;

public class JsonMalformedException extends Exception {

    public JsonMalformedException(String json){
        super("Malformed json : " + json);
    }

}
