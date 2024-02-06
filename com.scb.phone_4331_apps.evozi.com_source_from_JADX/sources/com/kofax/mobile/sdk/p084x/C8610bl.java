package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk.p016b.C0863d;
import com.kofax.mobile.sdk.p073c.C8297a;

/* renamed from: com.kofax.mobile.sdk.x.bl */
abstract class C8610bl extends C8628s {

    /* renamed from: RD */
    private final C0863d f5297RD;

    C8610bl(C7900b bVar, C0863d dVar) {
        super(bVar);
        this.f5297RD = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo55499a(String str, C8297a aVar) {
        if (aVar == null) {
            return null;
        }
        return this.f5297RD.mo12130l(str, aVar.getClassId());
    }
}
