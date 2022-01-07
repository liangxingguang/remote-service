package com.remoting.enums;

/**
 * @author liangxingguang
 * @version 1.0.0
 * @ClassName TlsMode.java
 * @Description TODO
 * @createTime 2022年01月07日 17:13:00
 */
public enum TlsMode {
    DISABLED("disabled"),
    PERMISSIVE("permissive"),
    ENFORCING("enforcing");

    private String name;

    TlsMode(String name) {
        this.name = name;
    }

    public static TlsMode parse(String mode) {
        for (TlsMode tlsMode : TlsMode.values()) {
            if (tlsMode.name.equals(mode)) {
                return tlsMode;
            }
        }

        return PERMISSIVE;
    }

    public String getName() {
        return name;
    }
}
