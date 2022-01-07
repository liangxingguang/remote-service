package com.remoting.exception;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RemotingCommandException.java
 * @Description TODO
 * @createTime 2022年01月07日 16:47:00
 */
public class RemotingCommandException extends RemotingException {
    private static final long serialVersionUID = -6061365915274953096L;

    public RemotingCommandException(String message) {
        super(message, null);
    }

    public RemotingCommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
