package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.android.abc.configuration.Configuration;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Field;
import com.kofax.android.abc.validation.MultiValidationEngine;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.sdk._internal.extraction.C7904g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import java.util.Iterator;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.aa */
public class C8028aa implements C7913j {

    /* renamed from: LD */
    private final C0529g f3871LD;

    /* renamed from: LH */
    private final C7904g f3872LH;

    @HmlPinActivity
    public C8028aa(C7904g gVar, C0529g gVar2) {
        this.f3872LH = gVar;
        this.f3871LD = gVar2;
    }

    /* renamed from: a */
    public void mo54319a(String str, String str2, Document document, VrsImage vrsImage) {
        Configuration o = this.f3871LD.mo11410o(str, str2);
        MultiValidationEngine b = this.f3872LH.mo54275b(o, "ValidationWorkflows");
        Iterator<Field> it = document.getFields().iterator();
        while (it.hasNext()) {
            Field next = it.next();
            if (next != null) {
                next.setConfidence(0.1f);
            }
        }
        b.validateWithImage(document, vrsImage);
        b.dispose();
        o.dispose();
    }
}
