package com.remoting.exception;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RemotingSendRequestException.java
 * @Description TODO
 * @createTime 2022年01月07日 16:48:00
 */
public class RemotingSendRequestException extends RemotingException {

    private static final long serialVersionUID = 5391285827332471674L;

    public RemotingSendRequestException(String addr) {
        this(addr, null);
    }

    public RemotingSendRequestException(String addr, Throwable cause) {
        super("send request to <" + addr + "> failed", cause);
    }
}
