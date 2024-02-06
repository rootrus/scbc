package com.kofax.mobile.sdk.p029y;

import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Field;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import java.util.ArrayList;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.j */
public class C0999j implements C0530i {
    /* access modifiers changed from: private */

    /* renamed from: Sk */
    public final C0530i f2397Sk;

    @HmlPinActivity
    public C0999j(@C1012a C0530i iVar) {
        this.f2397Sk = iVar;
    }

    /* renamed from: a */
    public ArrayList<Field> mo11411a(final String str, final String str2, final Document document) {
        return (ArrayList) new C8660v().mo55533a("IdDocumentExtractionEngine.extract()", new C8660v.C8662a<ArrayList<Field>>() {
            /* renamed from: qs */
            public ArrayList<Field> run() {
                return C0999j.this.f2397Sk.mo11411a(str, str2, document);
            }
        });
    }
}
