package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzfl extends IOException {
    private final String content;
    private final int statusCode;
    private final transient zzfe zzuh;
    private final String zzvb;

    public zzfl(zzfk zzfk) {
        this(new zzfm(zzfk));
    }

    protected zzfl(zzfm zzfm) {
        super(zzfm.message);
        this.statusCode = zzfm.statusCode;
        this.zzvb = zzfm.zzvb;
        this.zzuh = zzfm.zzuh;
        this.content = zzfm.content;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public static StringBuilder zzc(zzfk zzfk) {
        StringBuilder sb = new StringBuilder();
        int statusCode2 = zzfk.getStatusCode();
        if (statusCode2 != 0) {
            sb.append(statusCode2);
        }
        String statusMessage = zzfk.getStatusMessage();
        if (statusMessage != null) {
            if (statusCode2 != 0) {
                sb.append(' ');
            }
            sb.append(statusMessage);
        }
        return sb;
    }
}
