package com.kofax.mobile.sdk.p015ak;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.kofax.mobile.sdk.ak.e */
public class C0860e {
    /* renamed from: b */
    public static String m2232b(Context context, String str) {
        try {
            return context.getString(context.getResources().getIdentifier(str, "string", context.getPackageName()));
        } catch (Resources.NotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not load string resource: ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
