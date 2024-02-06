package com.kofax.mobile.sdk.p029y;

import com.kofax.mobile.sdk.p016b.C8296b;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import java.io.File;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.f */
public class C8640f implements C8296b {
    /* access modifiers changed from: private */

    /* renamed from: Sg */
    public final C8296b f5327Sg;

    @HmlPinActivity
    public C8640f(@C1012a C8296b bVar) {
        this.f5327Sg = bVar;
    }

    /* renamed from: H */
    public File mo54759H(final String str) {
        return (File) new C8660v().mo55533a("BundledClassificationConfigModelProvider.getConfig()", new C8660v.C8662a<File>() {
            /* renamed from: qp */
            public File run() {
                return C8640f.this.f5327Sg.mo54759H(str);
            }
        });
    }

    /* renamed from: I */
    public File mo54760I(final String str) {
        return (File) new C8660v().mo55533a("BundledClassificationConfigModelProvider.getModel()", new C8660v.C8662a<File>() {
            /* renamed from: qp */
            public File run() {
                return C8640f.this.f5327Sg.mo54760I(str);
            }
        });
    }
}
