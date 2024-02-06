package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p040o.setTextAppearance;

public final class zzcw {
    private static final setTextAppearance<String, Uri> zza = new setTextAppearance<>();

    public static Uri zza(String str) {
        Uri uri;
        synchronized (zzcw.class) {
            uri = zza.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                zza.put(str, uri);
            }
        }
        return uri;
    }
}
