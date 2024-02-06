package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.t */
public class C8559t extends C8500ae {

    /* renamed from: Qb */
    private final C8560a f5242Qb;

    /* renamed from: Qc */
    private final C7909d f5243Qc;

    /* renamed from: com.kofax.mobile.sdk.w.t$a */
    public interface C8560a {
        /* renamed from: a */
        void mo55464a(C8340a aVar, double d);

        /* renamed from: n */
        List<DataField> mo55465n(C8340a aVar);

        /* renamed from: o */
        List<DataField> mo55466o(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8559t(C8560a aVar, C7909d dVar) {
        this.f5242Qb = aVar;
        this.f5243Qc = dVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        this.f5242Qb.mo55464a(aVar, this.f5243Qc.mo54314b(this.f5242Qb.mo55465n(aVar), this.f5242Qb.mo55466o(aVar)));
    }
}
