package com.remoting;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName RemotingService.java
 * @Description TODO
 * @createTime 2022年01月07日 16:53:00
 */
public interface RemotingService {
    void start();

    void shutdown();

    void registerRPCHook(RPCHook rpcHook);
}
