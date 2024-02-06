package com.kofax.mobile.sdk.p008ad;

import android.content.Context;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk.p013ai.C0853a;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk.ad.a */
public class C0790a implements C0853a {

    /* renamed from: V */
    private final Context f1896V;

    @HmlPinActivity
    public C0790a(Context context) {
        this.f1896V = context;
    }

    /* renamed from: aF */
    public boolean mo11935aF(String str) {
        return this.f1896V.checkSelfPermission(str) == 0;
    }
}
