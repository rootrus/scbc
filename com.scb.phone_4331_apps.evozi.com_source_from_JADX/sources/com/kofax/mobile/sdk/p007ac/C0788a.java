package com.kofax.mobile.sdk.p007ac;

import android.content.Context;
import android.content.pm.PackageManager;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk.p013ai.C0853a;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk.ac.a */
public class C0788a implements C0853a {

    /* renamed from: TN */
    private final PackageManager f1893TN;

    /* renamed from: TO */
    private final String f1894TO;

    @HmlPinActivity
    public C0788a(Context context) {
        this.f1893TN = context.getPackageManager();
        this.f1894TO = context.getPackageName();
    }

    /* renamed from: aF */
    public boolean mo11935aF(String str) {
        return this.f1893TN.checkPermission(str, this.f1894TO) == 0;
    }
}
