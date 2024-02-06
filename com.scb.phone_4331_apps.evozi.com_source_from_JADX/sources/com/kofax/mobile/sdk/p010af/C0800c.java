package com.kofax.mobile.sdk.p010af;

import android.location.LocationManager;
import com.kofax.mobile.sdk.p013ai.C0854b;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.af.c */
public final class C0800c implements MileageQuantitySelectionActivity<C0798a> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f1919Ud;

    /* renamed from: wj */
    private final HmlReviewDocumentActivity<LocationManager> f1920wj;

    public C0800c(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LocationManager> hmlReviewDocumentActivity2) {
        this.f1919Ud = hmlReviewDocumentActivity;
        this.f1920wj = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<C0798a> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LocationManager> hmlReviewDocumentActivity2) {
        return new C0800c(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public final void injectMembers(C0798a aVar) {
        m1894a(aVar, this.f1919Ud.get());
        m1893a(aVar, this.f1920wj.get());
    }

    /* renamed from: a */
    public static void m1894a(C0798a aVar, C0854b bVar) {
        aVar.f1914Ub = bVar;
    }

    /* renamed from: a */
    public static void m1893a(C0798a aVar, LocationManager locationManager) {
        aVar.f1915Uc = locationManager;
    }
}
