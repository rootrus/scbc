package com.kofax.mobile.sdk.p029y;

import com.kofax.android.abc.document.Document;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7912h;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.h */
public class C8644h implements C7912h {
    /* access modifiers changed from: private */

    /* renamed from: Si */
    public final C7912h f5333Si;

    @HmlPinActivity
    public C8644h(@C1012a C7912h hVar) {
        this.f5333Si = hVar;
    }

    /* renamed from: x */
    public Document mo54318x(final Image image) {
        return (Document) new C8660v().mo55533a("VrsDocumentDeserializer.deserialize()", new C8660v.C8662a<Document>() {
            /* renamed from: ql */
            public Document run() {
                return C8644h.this.f5333Si.mo54318x(image);
            }
        });
    }
}
