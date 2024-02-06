package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C0531n;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk.p016b.C0862c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.d */
public final class C8103d implements OPRStatusRewardsLandingActivity_ViewBinding<C8078c> {

    /* renamed from: Le */
    private final HmlReviewDocumentActivity<C0862c> f4049Le;

    /* renamed from: Lf */
    private final HmlReviewDocumentActivity<C0531n> f4050Lf;

    /* renamed from: Lg */
    private final HmlReviewDocumentActivity<C7913j> f4051Lg;

    public C8103d(HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0531n> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7913j> hmlReviewDocumentActivity3) {
        this.f4049Le = hmlReviewDocumentActivity;
        this.f4050Lf = hmlReviewDocumentActivity2;
        this.f4051Lg = hmlReviewDocumentActivity3;
    }

    /* renamed from: mS */
    public final C8078c get() {
        return new C8078c(this.f4049Le.get(), this.f4050Lf.get(), this.f4051Lg.get());
    }

    /* renamed from: c */
    public static C8103d m4235c(HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0531n> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7913j> hmlReviewDocumentActivity3) {
        return new C8103d(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }
}
