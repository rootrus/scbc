package com.kofax.mobile.sdk.p083w;

import android.graphics.Bitmap;
import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.ImageField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.ao */
public class C8515ao extends C8500ae {

    /* renamed from: Qy */
    public static final String f5178Qy = "Photo";

    /* renamed from: Qz */
    public static final String f5179Qz = "Signature";

    /* renamed from: Ls */
    private final C7910e f5180Ls;

    /* renamed from: QA */
    private final C8516a f5181QA;

    /* renamed from: com.kofax.mobile.sdk.w.ao$a */
    public interface C8516a {
        /* renamed from: F */
        Bitmap mo55427F(C8340a aVar);

        /* renamed from: G */
        List<DataField> mo55428G(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8515ao(C8516a aVar, C7910e eVar) {
        this.f5181QA = aVar;
        this.f5180Ls = eVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        IdExtractionParameters hq = aVar.mo55125hq();
        aVar.mo55096a(mo55426a(f5178Qy, hq.getExtractFaceImage(), aVar));
        aVar.mo55100b(mo55426a(f5179Qz, hq.getExtractSignatureImage(), aVar));
    }

    /* renamed from: a */
    public ImageField mo55426a(String str, boolean z, C8340a aVar) {
        DataField a;
        List<DataField> G = this.f5181QA.mo55428G(aVar);
        if (!(G == null || (a = this.f5180Ls.mo54315a(str, G)) == null)) {
            G.remove(a);
            if (z) {
                return ImageField.fromDataField(a, this.f5181QA.mo55427F(aVar));
            }
        }
        return null;
    }
}
