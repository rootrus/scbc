package org.mortbay.jetty;

import java.io.IOException;

public class HttpException extends IOException {
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HttpException(");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append((String) null);
        stringBuffer.append(",");
        stringBuffer.append(super.getCause());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
