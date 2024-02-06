package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8632w;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.av */
public final class C8050av implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3920LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8632w> f3921LX;

    /* renamed from: Md */
    private final HmlReviewDocumentActivity<C7909d> f3922Md;

    public C8050av(C0705ah ahVar, HmlReviewDocumentActivity<C7909d> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8632w> hmlReviewDocumentActivity2) {
        this.f3920LV = ahVar;
        this.f3922Md = hmlReviewDocumentActivity;
        this.f3921LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3920LV.mo11691a(this.f3922Md.get(), this.f3921LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C8050av m4077d(C0705ah ahVar, HmlReviewDocumentActivity<C7909d> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8632w> hmlReviewDocumentActivity2) {
        return new C8050av(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4076a(C0705ah ahVar, C7909d dVar, C8632w wVar) {
        C8342c a = ahVar.mo11691a(dVar, wVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
