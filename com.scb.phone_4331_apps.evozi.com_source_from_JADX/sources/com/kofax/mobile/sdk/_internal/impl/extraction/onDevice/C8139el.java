package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p074d.C8339c;
import java.util.Locale;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.el */
public class C8139el implements C8339c {
    @HmlPinActivity
    C8139el() {
    }

    /* renamed from: Q */
    public String mo54533Q(String str) {
        if (!str.matches("^[2-9][0-9]$")) {
            return str;
        }
        int parseInt = Integer.parseInt(str);
        return String.format(Locale.US, "%d-%02d", new Object[]{Integer.valueOf(parseInt / 12), Integer.valueOf(parseInt % 12)});
    }
}
