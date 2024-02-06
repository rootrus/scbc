package com.kofax.mobile.sdk.p029y;

import android.content.Context;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.commonextractionengine.recognition.TextRecognizer;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0719e;
import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p029y.C8660v;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.b */
public class C0995b extends C0719e {
    @HmlPinActivity
    C0995b(Context context, C0862c cVar, C0530i iVar) {
        super(context, cVar, iVar);
    }

    /* renamed from: a */
    public Document mo11746a(final TextRecognizer textRecognizer, final VrsImage vrsImage) {
        return (Document) new C8660v().mo55533a("CeeOcrEngine.pass1", new C8660v.C8662a<Document>() {
            /* renamed from: ql */
            public Document run() {
                return C0995b.super.mo11746a(textRecognizer, vrsImage);
            }
        });
    }

    /* renamed from: a */
    public Document mo11747a(final TextRecognizer textRecognizer, final VrsImage vrsImage, final Document document) {
        return (Document) new C8660v().mo55533a("CeeOcrEngine.pass2", new C8660v.C8662a<Document>() {
            /* renamed from: ql */
            public Document run() {
                return C0995b.super.mo11747a(textRecognizer, vrsImage, document);
            }
        });
    }
}
