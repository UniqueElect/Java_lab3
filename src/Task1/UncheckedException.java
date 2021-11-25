package Task1;

import java.util.List;

public class UncheckedException extends  Exception{
    HttpCode httpCode;

    public UncheckedException(String message){
        super(message);
    }
    public UncheckedException(final List<String> message, final HttpCode httpCode) {
        super(message.toString());
        this.httpCode = httpCode;
    }

    public HttpCode getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(final HttpCode httpCode) {
        this.httpCode = httpCode;
    }
}





