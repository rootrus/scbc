package com.kofax.kmc.kut.utilities.error;

public class KmcRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1279862250221568252L;
    private ErrorInfo errorInfo;

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KmcRuntimeException(com.kofax.kmc.kut.utilities.error.ErrorInfo r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.getErr()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r5.getErrMsg()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = r5.getErrDesc()
            r3 = 0
            r1.<init>(r2, r3)
            r4.<init>(r0, r1)
            r4.errorInfo = r5
            com.kofax.kmc.kut.utilities.error.ErrorEventDelegate.postErrorInfoBusEvent(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.error.KmcRuntimeException.<init>(com.kofax.kmc.kut.utilities.error.ErrorInfo):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KmcRuntimeException(com.kofax.kmc.kut.utilities.error.ErrorInfo r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getErr()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r3.getErrMsg()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r4)
            r2.errorInfo = r3
            r4 = 0
            com.kofax.kmc.kut.utilities.error.ErrorEventDelegate.postErrorInfoBusEvent(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.error.KmcRuntimeException.<init>(com.kofax.kmc.kut.utilities.error.ErrorInfo, java.lang.Throwable):void");
    }
}
