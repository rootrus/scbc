package com.google.android.gms.internal.firebase_ml;

import android.graphics.Rect;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzpm {
    public static String zzbl(int i) {
        if (i == 1) {
            return "builtin/stable";
        }
        if (i != 2) {
            return null;
        }
        return "builtin/latest";
    }

    public static String zzch(String str) {
        return str == null ? "" : str;
    }

    public static float zza(Float f) {
        return f == null ? BitmapDescriptorFactory.HUE_RED : f.floatValue();
    }

    private static int zzb(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Rect zza(zziv zziv, float f) {
        if (zziv == null || zziv.zzhs() == null || zziv.zzhs().size() != 4) {
            return null;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        for (zzju next : zziv.zzhs()) {
            i = Math.min(zzb(next.zzib()), i);
            i4 = Math.min(zzb(next.zzic()), i4);
            i2 = Math.max(zzb(next.zzib()), i2);
            i3 = Math.max(zzb(next.zzic()), i3);
        }
        return new Rect(Math.round(((float) i) * f), Math.round(((float) i4) * f), Math.round(((float) i2) * f), Math.round(((float) i3) * f));
    }
}
