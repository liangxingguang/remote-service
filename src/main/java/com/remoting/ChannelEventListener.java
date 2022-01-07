package com.remoting;


import io.netty.channel.Channel;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName ChannelEventListener.java
 * @Description TODO
 * @createTime 2022年01月07日 16:42:00
 */
public interface ChannelEventListener {
    void onChannelConnect(final String remoteAddr, final Channel channel);
    void onChannelClose(final String remoteAddr, final Channel channel);
    void onChannelException(final String remoteAddr, final Channel channel);
    void onChannelIdle(final String remoteAddr, final Channel channel);
}
