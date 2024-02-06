package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import com.kofax.android.abc.configuration.Configuration;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.mobile.commonextractionengine.recognition.TextRecognizer;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0531n;
import com.kofax.mobile.sdk.p016b.C0862c;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.e */
public class C0719e implements C0531n {

    /* renamed from: Ad */
    private final Context f1667Ad;

    /* renamed from: Lh */
    private final C0862c f1668Lh;

    /* renamed from: Li */
    private final C0530i f1669Li;

    @HmlPinActivity
    public C0719e(Context context, C0862c cVar, C0530i iVar) {
        this.f1667Ad = context;
        this.f1668Lh = cVar;
        this.f1669Li = iVar;
    }

    /* renamed from: a */
    public Document mo11412a(String str, String str2, VrsImage vrsImage) {
        Document a;
        TextRecognizer y = m1622y(str, str2);
        try {
            a = mo11746a(y, vrsImage);
            this.f1669Li.mo11411a(str, str2, a);
            Document a2 = mo11747a(y, vrsImage, a);
            a.dispose();
            y.dispose();
            return a2;
        } catch (Throwable th) {
            y.dispose();
            throw th;
        }
    }

    /* renamed from: a */
    public Document mo11746a(TextRecognizer textRecognizer, VrsImage vrsImage) {
        return textRecognizer.findTextLines(vrsImage);
    }

    /* renamed from: a */
    public Document mo11747a(TextRecognizer textRecognizer, VrsImage vrsImage, Document document) {
        return textRecognizer.recognizeText(vrsImage, document.getFields());
    }

    /* renamed from: y */
    private TextRecognizer m1622y(String str, String str2) {
        Configuration z;
        TextRecognizer textRecognizer = new TextRecognizer(this.f1667Ad);
        try {
            z = m1623z(str, str2);
            textRecognizer.initializeWithConfiguration(z);
            z.dispose();
            return textRecognizer;
        } catch (Throwable th) {
            textRecognizer.dispose();
            throw th;
        }
    }

    /* renamed from: z */
    private Configuration m1623z(String str, String str2) {
        Configuration configuration = new Configuration();
        try {
            configuration.loadFromFile(this.f1668Lh.mo12128k(str, str2).getAbsolutePath());
            configuration.setStringValue("EvrsConfiguration.FindText.OpStringValue", this.f1668Lh.mo12126i(str, str2));
            configuration.setStringValue("EvrsConfiguration.RecognizeText.OpStringValue", this.f1668Lh.mo12127j(str, str2));
            try {
                configuration.setStringValue("TesseractConfiguration.TesseractEngine.DataPath", this.f1668Lh.mo12122K(str));
            } catch (Throwable unused) {
            }
            return configuration;
        } catch (Throwable th) {
            configuration.dispose();
            throw th;
        }
    }
}
