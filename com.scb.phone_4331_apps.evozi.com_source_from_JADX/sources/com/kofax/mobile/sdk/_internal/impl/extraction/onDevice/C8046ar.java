package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p073c.C8299c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8490a;
import com.kofax.mobile.sdk.p083w.C8531c;
import com.kofax.mobile.sdk.p084x.C8572ac;
import com.kofax.mobile.sdk.p084x.C8617i;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ar */
public final class C8046ar implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: Hf */
    private final HmlReviewDocumentActivity<C8299c> f3908Hf;

    /* renamed from: LV */
    private final C0705ah f3909LV;

    /* renamed from: LY */
    private final HmlReviewDocumentActivity<C8572ac> f3910LY;

    /* renamed from: LZ */
    private final HmlReviewDocumentActivity<C8617i> f3911LZ;

    /* renamed from: Ma */
    private final HmlReviewDocumentActivity<C8490a> f3912Ma;

    /* renamed from: Mb */
    private final HmlReviewDocumentActivity<C8531c> f3913Mb;

    public C8046ar(C0705ah ahVar, HmlReviewDocumentActivity<C8299c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8572ac> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8617i> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C8490a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8531c> hmlReviewDocumentActivity5) {
        this.f3909LV = ahVar;
        this.f3908Hf = hmlReviewDocumentActivity;
        this.f3910LY = hmlReviewDocumentActivity2;
        this.f3911LZ = hmlReviewDocumentActivity3;
        this.f3912Ma = hmlReviewDocumentActivity4;
        this.f3913Mb = hmlReviewDocumentActivity5;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3909LV.mo11693a(this.f3908Hf.get(), this.f3910LY.get(), this.f3911LZ.get(), this.f3912Ma.get(), this.f3913Mb.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C8046ar m4064a(C0705ah ahVar, HmlReviewDocumentActivity<C8299c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8572ac> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8617i> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C8490a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8531c> hmlReviewDocumentActivity5) {
        return new C8046ar(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    /* renamed from: a */
    public static C8342c m4065a(C0705ah ahVar, C8299c cVar, C8572ac acVar, C8617i iVar, C8490a aVar, C8531c cVar2) {
        C8342c a = ahVar.mo11693a(cVar, acVar, iVar, aVar, cVar2);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
