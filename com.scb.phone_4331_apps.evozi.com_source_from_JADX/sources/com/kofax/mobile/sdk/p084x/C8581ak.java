package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8566z;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.x.ak */
public class C8581ak implements C8566z.C8567a {
    private static final String MIDDLE_NAME = "MiddleName";

    /* renamed from: Rk */
    private static final String f5263Rk = "Mexico (MEX) Voter Identification Card (2013-2014) - Back";

    /* renamed from: Rl */
    private static final String f5264Rl = "FirstName";

    /* renamed from: Rm */
    private static final String f5265Rm = "LastName";

    /* renamed from: Ls */
    private final C7910e f5266Ls;

    @HmlPinActivity
    public C8581ak(C7910e eVar) {
        this.f5266Ls = eVar;
    }

    /* renamed from: u */
    public boolean mo55471u(C8340a aVar) {
        C8297a hw = aVar.mo55131hw();
        return hw != null && hw.getClassId().equals(f5263Rk);
    }

    /* renamed from: I */
    public C8582a mo55472v(C8340a aVar) {
        return new C8582a(aVar.mo55132hx());
    }

    /* renamed from: J */
    public C8582a mo55473w(C8340a aVar) {
        return new C8582a(aVar.mo55133hy());
    }

    /* renamed from: a */
    public void mo55470a(C8340a aVar, Exception exc) {
        if (exc != null) {
            aVar.mo55098a(exc);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.x.ak$a */
    class C8582a extends C8566z.C8567a.C8568a {

        /* renamed from: Np */
        private final List<DataField> f5267Np;

        public C8582a(List<DataField> list) {
            this.f5267Np = list;
        }

        /* renamed from: oL */
        public DataField mo55477oL() {
            return C8581ak.this.m5416h(C8581ak.f5264Rl, this.f5267Np);
        }

        /* renamed from: e */
        public void mo55474e(DataField dataField) {
            C8581ak.this.m5415a(this.f5267Np, C8581ak.f5264Rl, dataField);
        }

        /* renamed from: oM */
        public DataField mo55478oM() {
            return C8581ak.this.m5416h(C8581ak.MIDDLE_NAME, this.f5267Np);
        }

        /* renamed from: f */
        public void mo55475f(DataField dataField) {
            C8581ak.this.m5415a(this.f5267Np, C8581ak.MIDDLE_NAME, dataField);
        }

        /* renamed from: oN */
        public DataField mo55479oN() {
            return C8581ak.this.m5416h(C8581ak.f5265Rm, this.f5267Np);
        }

        /* renamed from: g */
        public void mo55476g(DataField dataField) {
            C8581ak.this.m5415a(this.f5267Np, C8581ak.f5265Rm, dataField);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public DataField m5416h(String str, List<DataField> list) {
        return this.f5266Ls.mo54315a(str, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5415a(List<DataField> list, String str, DataField dataField) {
        list.remove(m5416h(str, list));
        list.add(dataField);
    }
}
