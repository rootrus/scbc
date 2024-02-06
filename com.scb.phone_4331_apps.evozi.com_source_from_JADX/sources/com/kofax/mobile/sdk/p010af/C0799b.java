package com.kofax.mobile.sdk.p010af;

import android.content.Context;
import android.location.LocationManager;
import com.kofax.mobile.sdk.p013ai.C0854b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.af.b */
public final class C0799b implements OPRStatusRewardsLandingActivity_ViewBinding<C0798a> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f1916Ud;

    /* renamed from: wj */
    private final HmlReviewDocumentActivity<LocationManager> f1917wj;

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f1918ws;

    public C0799b(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocationManager> hmlReviewDocumentActivity3) {
        this.f1918ws = hmlReviewDocumentActivity;
        this.f1916Ud = hmlReviewDocumentActivity2;
        this.f1917wj = hmlReviewDocumentActivity3;
    }

    /* renamed from: qV */
    public final C0798a get() {
        C0798a aVar = new C0798a(this.f1918ws.get());
        C0800c.m1894a(aVar, this.f1916Ud.get());
        C0800c.m1893a(aVar, this.f1917wj.get());
        return aVar;
    }

    /* renamed from: h */
    public static C0799b m1891h(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocationManager> hmlReviewDocumentActivity3) {
        return new C0799b(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: h */
    public static C0798a m1890h(Context context) {
        return new C0798a(context);
    }
}
