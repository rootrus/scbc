package org.apache.commons.logging;

public class LogConfigurationException extends RuntimeException {
    private Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public LogConfigurationException() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public LogConfigurationException(String str) {
        super(str);
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LogConfigurationException(Throwable th) {
        this(th == null ? null : th.toString(), th);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LogConfigurationException(java.lang.String r2, java.lang.Throwable r3) {
        /*
            r1 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " (Caused by "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            r2 = 0
            r1.MediaBrowserCompat$CustomActionResultReceiver = r2
            r1.MediaBrowserCompat$CustomActionResultReceiver = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogConfigurationException.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public Throwable getCause() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
