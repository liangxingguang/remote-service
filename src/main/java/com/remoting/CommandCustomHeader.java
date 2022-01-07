package com.remoting;

import com.remoting.exception.RemotingCommandException;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName CommandCustomHeader.java
 * @Description TODO
 * @createTime 2022年01月07日 16:50:00
 */
public interface CommandCustomHeader {
    void checkFields() throws RemotingCommandException;
}
