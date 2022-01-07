package com.remoting;

import com.remoting.protocol.RemotingCommand;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RPCHook.java
 * @Description TODO
 * @createTime 2022年01月07日 16:53:00
 */
public interface RPCHook {
    void doBeforeRequest(final String remoteAddr, final RemotingCommand request);

    void doAfterResponse(final String remoteAddr, final RemotingCommand request,
                         final RemotingCommand response);
}
