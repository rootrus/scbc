package com.google.android.gms.internal.firebase_ml;

public final class zzeh {
    public static final String VERSION;
    public static final Integer zzsg = 1;
    public static final Integer zzsh = 26;
    private static final Integer zzsi = 0;

    static {
        String valueOf = String.valueOf(zzsg);
        String valueOf2 = String.valueOf(zzsh);
        String valueOf3 = String.valueOf(zzsi);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        sb.append(".");
        sb.append(valueOf3);
        sb.append("-SNAPSHOT");
        VERSION = sb.toString().toString();
    }
}
