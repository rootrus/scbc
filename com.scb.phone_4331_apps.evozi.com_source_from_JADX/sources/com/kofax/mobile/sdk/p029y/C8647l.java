package com.kofax.mobile.sdk.p029y;

import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.l */
public class C8647l implements C7913j {
    /* access modifiers changed from: private */

    /* renamed from: So */
    public final C7913j f5337So;

    @HmlPinActivity
    public C8647l(@C1012a C7913j jVar) {
        this.f5337So = jVar;
    }

    /* renamed from: a */
    public void mo54319a(String str, String str2, Document document, VrsImage vrsImage) {
        final String str3 = str;
        final String str4 = str2;
        final Document document2 = document;
        final VrsImage vrsImage2 = vrsImage;
        new C8660v().mo55533a("IdDocumentValidationEngine.validate()", new C8660v.C8662a<Void>() {
            /* renamed from: qu */
            public Void run() {
                C8647l.this.f5337So.mo54319a(str3, str4, document2, vrsImage2);
                return null;
            }
        });
    }
}
