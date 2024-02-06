package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8634y;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bc */
public final class C8058bc implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3936LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7906a> f3937LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8634y> f3938LX;

    public C8058bc(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8634y> hmlReviewDocumentActivity2) {
        this.f3936LV = ahVar;
        this.f3937LW = hmlReviewDocumentActivity;
        this.f3938LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3936LV.mo11682a(this.f3937LW.get(), this.f3938LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: e */
    public static C8058bc m4100e(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8634y> hmlReviewDocumentActivity2) {
        return new C8058bc(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4099a(C0705ah ahVar, C7906a aVar, C8634y yVar) {
        C8342c a = ahVar.mo11682a(aVar, yVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
