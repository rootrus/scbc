package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ak */
public final class C0708ak implements OPRStatusRewardsLandingActivity_ViewBinding<C0704a> {

    /* renamed from: LV */
    private final C0705ah f1643LV;

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f1644ws;

    public C0708ak(C0705ah ahVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f1643LV = ahVar;
        this.f1644ws = hmlReviewDocumentActivity;
    }

    /* renamed from: mQ */
    public final C0704a get() {
        C0704a f = this.f1643LV.mo11732f(this.f1644ws.get());
        if (f != null) {
            return f;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C0708ak m1591b(C0705ah ahVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0708ak(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0704a m1590a(C0705ah ahVar, Context context) {
        C0704a f = ahVar.mo11732f(context);
        if (f != null) {
            return f;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
