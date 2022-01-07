package com.remoting.exception;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RemotingTooMuchRequestException.java
 * @Description TODO
 * @createTime 2022年01月07日 16:49:00
 */
public class RemotingTooMuchRequestException extends RemotingException {
    private static final long serialVersionUID = 4326919581254519654L;

    public RemotingTooMuchRequestException(String message) {
        super(message);
    }
}
