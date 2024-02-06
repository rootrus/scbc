package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7915l;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.x */
public class C8564x extends C8500ae {

    /* renamed from: Qe */
    private final C7915l f5251Qe;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8564x(C7915l lVar) {
        this.f5251Qe = lVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        List<DataField> hz = aVar.mo55134hz();
        String ht = aVar.mo55128ht();
        if (hz != null) {
            try {
                aVar.mo55106d(this.f5251Qe.mo54320b(ht, hz));
            } catch (Exception e) {
                aVar.mo55098a(e);
            }
        }
    }
}
