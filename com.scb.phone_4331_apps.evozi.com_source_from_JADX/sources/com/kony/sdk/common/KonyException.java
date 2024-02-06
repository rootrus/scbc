package com.kony.sdk.common;

public class KonyException extends Exception {
    private String MediaBrowserCompat$CustomActionResultReceiver = null;
    public String MediaBrowserCompat$ItemReceiver = null;
    public String read = null;

    public KonyException(String str, Throwable th) {
        super(str, th);
        setStackTrace(th.getStackTrace());
    }

    public KonyException(String str, String str2, Throwable th) {
        super(str, th);
        this.read = str2;
        setStackTrace(th.getStackTrace());
    }

    public KonyException(String str, String str2) {
        super(str);
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public KonyException(String str) {
        super(str);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public String IconCompatParcelizer() {
        return this.read;
    }

    public String getMessage() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str;
        }
        return super.getMessage();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception:\nCode:");
        sb.append(IconCompatParcelizer());
        sb.append("\nMessage:");
        sb.append(getMessage());
        sb.append("\nDetails:");
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
