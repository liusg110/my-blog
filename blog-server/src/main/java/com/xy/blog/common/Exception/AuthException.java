package com.xy.blog.common.Exception;

import javax.servlet.ServletException;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class AuthException extends ServletException {

    private String code;
    private String message;

    public AuthException( String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public AuthException(String message, Throwable cause, String code, String message1) {
        super(message, cause);
        this.code = code;
        this.message = message1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
