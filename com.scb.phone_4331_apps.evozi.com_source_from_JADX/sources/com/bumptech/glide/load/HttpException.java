package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpException(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Http request failed with status code: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r0, (int) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.HttpException.<init>(int):void");
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, (byte) 0);
    }

    private HttpException(String str, byte b) {
        super(str, (Throwable) null);
    }
}
