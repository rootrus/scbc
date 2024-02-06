package com.kofax.mobile.sdk.p029y;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p073c.C8299c;
import java.util.Locale;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.r */
public class C8653r implements C8299c {
    /* access modifiers changed from: private */

    /* renamed from: Sw */
    public final C8299c f5349Sw;

    @HmlPinActivity
    public C8653r(@C1012a C8299c cVar) {
        this.f5349Sw = cVar;
    }

    /* renamed from: a */
    public C8297a mo54764a(final String str, final Image image) {
        return (C8297a) new C8660v().mo55533a("IdImageClassifier.classify(Bitmap, int)", new C8660v.C8662a<C8297a>() {
            /* renamed from: qA */
            public C8297a run() {
                C8297a a = C8653r.this.f5349Sw.mo54764a(str, image);
                if (a != null) {
                    try {
                        C0767k.m1801b(C8653r.this.f5349Sw.getClass().getName(), String.format(Locale.US, "Classification result (class, confidence): (%s, %f)", new Object[]{a.getClassId(), Float.valueOf(a.getConfidence())}));
                    } catch (Exception unused) {
                    }
                }
                return a;
            }
        });
    }
}
