package com.remoting.exception;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RemotingConnectException.java
 * @Description TODO
 * @createTime 2022年01月07日 16:48:00
 */
public class RemotingConnectException extends RemotingException {

    private static final long serialVersionUID = -5565366231695911316L;

    public RemotingConnectException(String addr) {
        this(addr, null);
    }

    public RemotingConnectException(String addr, Throwable cause) {
        super("connect to <" + addr + "> failed", cause);
    }
}
