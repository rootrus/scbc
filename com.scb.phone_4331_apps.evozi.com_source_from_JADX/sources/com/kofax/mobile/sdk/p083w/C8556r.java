package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8143g;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.r */
public class C8556r extends C8500ae {

    /* renamed from: Qa */
    private final C8557a f5240Qa;

    /* renamed from: com.kofax.mobile.sdk.w.r$a */
    public interface C8557a {
        /* renamed from: a */
        void mo55459a(C8340a aVar, DataField dataField);

        /* renamed from: k */
        boolean mo55460k(C8340a aVar);

        /* renamed from: l */
        DataField mo55461l(C8340a aVar);

        /* renamed from: m */
        DataField mo55462m(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8556r(C8557a aVar) {
        this.f5240Qa = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        if (this.f5240Qa.mo55460k(aVar)) {
            m5337j(aVar);
        }
    }

    /* renamed from: j */
    private void m5337j(C8340a aVar) {
        DataField m;
        String name;
        DataField l = this.f5240Qa.mo55461l(aVar);
        if (l != null) {
            String object = l.getObject();
            if ((object == null || object.length() == 0) && (m = this.f5240Qa.mo55462m(aVar)) != null && (name = C8143g.getName(m.getObject())) != null) {
                this.f5240Qa.mo55459a(aVar, new DataField(l.getName(), name, m.getConfidence(), m.getLocation()));
            }
        }
    }
}
