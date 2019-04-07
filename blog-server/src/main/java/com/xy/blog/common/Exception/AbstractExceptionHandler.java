package com.xy.blog.common.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.util.Collection;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class AbstractExceptionHandler<T extends Throwable> {

    private String exceptionName;

    public AbstractExceptionHandler(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    protected String getMessage(T ex) {
        return ex.getMessage();
    }

    protected HttpStatus getStatus(T ex) {
        return null;
    }

    protected Collection<FieldError> getErrors(T ex) {
        return null;
    }

/*    public ErrorResponse getErrorResponse(T ex) {

        ErrorResponse errorResponse = new ErrorResponse();

        String message = getMessage(ex);
        if (message != null)
            errorResponse.setMessage(message);

        HttpStatus status = getStatus(ex);
        if (status != null) {
            errorResponse.setStatus(status.value());
            errorResponse.setError(status.getReasonPhrase());
        }

        errorResponse.setErrors(getErrors(ex));

        return errorResponse;
    }*/
}
