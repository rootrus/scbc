package com.google.android.gms.internal.firebase_ml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzeo {
    private static final zzeo zzti = new zzeo();
    private final String zztj;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzeo() {
        /*
            r4 = this;
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "9"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "9.0.0"
            goto L_0x0015
        L_0x0011:
            java.lang.String r0 = zzq(r0)
        L_0x0015:
            com.google.android.gms.internal.firebase_ml.zzkz r1 = com.google.android.gms.internal.firebase_ml.zzkz.zzaci
            java.lang.String r1 = r1.value()
            com.google.android.gms.internal.firebase_ml.zzkz r2 = com.google.android.gms.internal.firebase_ml.zzkz.zzack
            java.lang.String r2 = r2.value()
            java.lang.String r3 = com.google.android.gms.internal.firebase_ml.zzeh.VERSION
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzeo.<init>():void");
    }

    private zzeo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("java/");
        sb.append(zzq(str));
        sb.append(" http-google-%s/");
        sb.append(zzq(str4));
        if (!(str2 == null || str3 == null)) {
            sb.append(" ");
            sb.append(zzp(str2));
            sb.append("/");
            sb.append(zzq(str3));
        }
        this.zztj = sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzo(String str) {
        return String.format(this.zztj, new Object[]{zzp(str)});
    }

    /* access modifiers changed from: private */
    public static zzeo zzeq() {
        return zzti;
    }

    private static String zzp(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", "-");
    }

    private static String zzq(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        return matcher.find() ? matcher.group(1) : str;
    }
}
