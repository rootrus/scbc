package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bk */
public final class C8065bk implements OPRStatusRewardsLandingActivity_ViewBinding<C7908c> {

    /* renamed from: LV */
    private final C0705ah f3953LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8144h> f3954ad;

    public C8065bk(C0705ah ahVar, HmlReviewDocumentActivity<C8144h> hmlReviewDocumentActivity) {
        this.f3953LV = ahVar;
        this.f3954ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nz */
    public final C7908c get() {
        C7908c a = this.f3953LV.mo11645a(this.f3954ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: t */
    public static C8065bk m4121t(C0705ah ahVar, HmlReviewDocumentActivity<C8144h> hmlReviewDocumentActivity) {
        return new C8065bk(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7908c m4120a(C0705ah ahVar, C8144h hVar) {
        C7908c a = ahVar.mo11645a(hVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
