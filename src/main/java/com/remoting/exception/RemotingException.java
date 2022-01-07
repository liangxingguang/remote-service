package com.remoting.exception;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RemotingException.java
 * @Description TODO
 * @createTime 2022年01月07日 16:46:00
 */
public class RemotingException extends Exception {
    private static final long serialVersionUID = -5690687334570505110L;

    public RemotingException(String message) {
        super(message);
    }

    public RemotingException(String message, Throwable cause) {
        super(message, cause);
    }
}
