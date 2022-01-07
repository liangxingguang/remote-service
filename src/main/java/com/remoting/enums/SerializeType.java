package com.remoting.enums;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName SerializeType.java
 * @Description TODO
 * @createTime 2022年01月07日 16:56:00
 */
public enum SerializeType {
    JSON((byte) 0),
    ROCKETMQ((byte) 1);

    private byte code;

    SerializeType(byte code) {
        this.code = code;
    }

    public static SerializeType valueOf(byte code) {
        for (SerializeType serializeType : SerializeType.values()) {
            if (serializeType.getCode() == code) {
                return serializeType;
            }
        }
        return null;
    }

    public byte getCode() {
        return code;
    }
}
