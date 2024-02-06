package com.kofax.mobile.sdk.p029y;

import android.graphics.Bitmap;
import com.kofax.android.abc.image_classification.ResultPair;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import com.kofax.mobile.sdk.p073c.C8298b;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.d */
public class C8637d implements C8298b {
    /* access modifiers changed from: private */

    /* renamed from: Sc */
    public final C8298b f5321Sc;

    @HmlPinActivity
    public C8637d(@C1012a C8298b bVar) {
        this.f5321Sc = bVar;
    }

    /* renamed from: a */
    public List<ResultPair> mo54763a(final String str, final Bitmap bitmap, final int i) {
        return (List) new C8660v().mo55533a("IdBitmapClassifier.classify(Bitmap, int)", new C8660v.C8662a<List<ResultPair>>() {
            /* renamed from: qn */
            public List<ResultPair> run() {
                return C8637d.this.f5321Sc.mo54763a(str, bitmap, i);
            }
        });
    }
}
