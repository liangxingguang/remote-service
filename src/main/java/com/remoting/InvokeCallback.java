package com.remoting;

import com.remoting.netty.ResponseFuture;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName InvokeCallback.java
 * @Description TODO
 * @createTime 2022年01月07日 16:52:00
 */
public interface InvokeCallback {
    void operationComplete(final ResponseFuture responseFuture);
}
