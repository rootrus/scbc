package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk.p016b.C0862c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.f */
public final class C0720f implements OPRStatusRewardsLandingActivity_ViewBinding<C0719e> {

    /* renamed from: Le */
    private final HmlReviewDocumentActivity<C0862c> f1670Le;

    /* renamed from: Lj */
    private final HmlReviewDocumentActivity<C0530i> f1671Lj;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f1672X;

    public C0720f(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity3) {
        this.f1672X = hmlReviewDocumentActivity;
        this.f1670Le = hmlReviewDocumentActivity2;
        this.f1671Lj = hmlReviewDocumentActivity3;
    }

    /* renamed from: mT */
    public final C0719e get() {
        return new C0719e(this.f1672X.get(), this.f1670Le.get(), this.f1671Lj.get());
    }

    /* renamed from: d */
    public static C0720f m1628d(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity3) {
        return new C0720f(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C0719e m1627a(Context context, C0862c cVar, C0530i iVar) {
        return new C0719e(context, cVar, iVar);
    }
}
