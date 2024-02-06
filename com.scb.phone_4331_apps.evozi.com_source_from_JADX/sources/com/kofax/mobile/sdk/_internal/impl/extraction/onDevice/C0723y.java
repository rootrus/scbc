package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.android.abc.configuration.Configuration;
import com.kofax.android.abc.content_analytics.MultiExtractionEngine;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Field;
import com.kofax.mobile.sdk._internal.extraction.C0528e;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import java.util.ArrayList;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.y */
public class C0723y implements C0530i {

    /* renamed from: LC */
    private final C0528e f1675LC;

    /* renamed from: LD */
    private final C0529g f1676LD;

    @HmlPinActivity
    public C0723y(C0528e eVar, C0529g gVar) {
        this.f1675LC = eVar;
        this.f1676LD = gVar;
    }

    /* renamed from: a */
    public ArrayList<Field> mo11411a(String str, String str2, Document document) {
        Configuration o = this.f1676LD.mo11410o(str, str2);
        MultiExtractionEngine multiExtractionEngine = null;
        try {
            multiExtractionEngine = this.f1675LC.mo11409a(o, "MultiExtractionEngine");
            multiExtractionEngine.extract(document);
            return document.getFields();
        } finally {
            if (multiExtractionEngine != null) {
                multiExtractionEngine.dispose();
            }
            if (o != null) {
                o.dispose();
            }
        }
    }
}
