package com.kofax.mobile.sdk.p083w;

import android.text.TextUtils;
import bolts.CancellationToken;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import com.kofax.mobile.sdk.p074d.C8337b;
import com.kofax.mobile.sdk.p074d.C8339c;
import com.kofax.mobile.sdk.p075e.C8340a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.n */
public class C8551n extends C8500ae {

    /* renamed from: PV */
    private final C8337b f5233PV;
    /* access modifiers changed from: private */

    /* renamed from: PW */
    public final C8339c f5234PW;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8551n(C8337b bVar, C8339c cVar) {
        this.f5233PV = bVar;
        this.f5234PW = cVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        if (aVar.mo55128ht().equals(IdRegion.US.getRegionName())) {
            this.f5233PV.mo54576a(aVar.mo55117hB(), "Height", new C8337b.C8338a() {
                /* renamed from: a */
                public DataField mo55094a(DataField dataField) {
                    return (dataField == null || TextUtils.isEmpty(dataField.getObject())) ? dataField : new DataField(dataField.getName(), C8551n.this.f5234PW.mo54533Q(dataField.getObject()), dataField.getConfidence(), dataField.getLocation());
                }
            });
        }
    }
}
