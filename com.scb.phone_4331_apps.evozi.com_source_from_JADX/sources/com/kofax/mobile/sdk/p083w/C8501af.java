package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import p040o.ModifyQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.w.af */
public class C8501af extends C8500ae {

    /* renamed from: Qp */
    private static final String f5160Qp = " - Back";

    /* renamed from: Qq */
    private final C8503b f5161Qq;

    /* renamed from: com.kofax.mobile.sdk.w.af$b */
    public interface C8503b {
        /* renamed from: a */
        void mo55404a(C8340a aVar, C8297a aVar2);

        /* renamed from: b */
        void mo55405b(C8340a aVar, Exception exc);

        /* renamed from: c */
        void mo55406c(C8340a aVar, Exception exc);

        /* renamed from: d */
        void mo55407d(C8340a aVar, C8297a aVar2);

        /* renamed from: hv */
        C8297a mo55408hv();

        /* renamed from: hw */
        C8297a mo55409hw();

        /* renamed from: oQ */
        Exception mo55410oQ();

        /* renamed from: oR */
        Exception mo55411oR();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    public C8501af(C8503b bVar) {
        this.f5161Qq = bVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        C8297a hv = this.f5161Qq.mo55408hv();
        C8297a hw = this.f5161Qq.mo55409hw();
        Exception oQ = this.f5161Qq.mo55410oQ();
        Exception oR = this.f5161Qq.mo55411oR();
        boolean z = false;
        boolean z2 = hv == null && oQ == null && hw != null;
        if (hw == null && oR == null && hv != null) {
            z = true;
        }
        if (z2) {
            m5203b(aVar, hw);
        } else {
            this.f5161Qq.mo55407d(aVar, hv);
            this.f5161Qq.mo55405b(aVar, oQ);
        }
        if (z) {
            m5204c(aVar, hv);
            return;
        }
        this.f5161Qq.mo55404a(aVar, hw);
        this.f5161Qq.mo55406c(aVar, oR);
    }

    /* renamed from: b */
    private void m5203b(C8340a aVar, C8297a aVar2) {
        this.f5161Qq.mo55407d(aVar, new C8502a(ModifyQuickTopUpReviewActivity.write(aVar2.getClassId(), f5160Qp), aVar2.getConfidence()));
    }

    /* renamed from: c */
    private void m5204c(C8340a aVar, C8297a aVar2) {
        String classId = aVar2.getClassId();
        float confidence = aVar2.getConfidence();
        StringBuilder sb = new StringBuilder();
        sb.append(classId);
        sb.append(f5160Qp);
        this.f5161Qq.mo55404a(aVar, new C8502a(sb.toString(), confidence));
    }

    /* renamed from: com.kofax.mobile.sdk.w.af$a */
    static class C8502a implements C8297a {

        /* renamed from: Hj */
        private final float f5162Hj;

        /* renamed from: ah */
        private final String f5163ah;

        C8502a(String str, float f) {
            this.f5163ah = str;
            this.f5162Hj = f;
        }

        public String getClassId() {
            return this.f5163ah;
        }

        public float getConfidence() {
            return this.f5162Hj;
        }
    }
}
