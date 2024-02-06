package com.google.android.gms.internal.firebase_ml;

final class zzke extends zzkd {
    private final char zzabb;

    zzke(char c) {
        this.zzabb = c;
    }

    public final boolean zzb(char c) {
        return c == this.zzabb;
    }

    public final String toString() {
        String zzd = zzkc.zzc(this.zzabb);
        StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(zzd);
        sb.append("')");
        return sb.toString();
    }
}
