package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8596ay;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cw */
public final class C8099cw implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4039LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8596ay> f4040LX;

    public C8099cw(C0705ah ahVar, HmlReviewDocumentActivity<C8596ay> hmlReviewDocumentActivity) {
        this.f4039LV = ahVar;
        this.f4040LX = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4039LV.mo11712a(this.f4040LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: O */
    public static C8099cw m4223O(C0705ah ahVar, HmlReviewDocumentActivity<C8596ay> hmlReviewDocumentActivity) {
        return new C8099cw(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4224a(C0705ah ahVar, C8596ay ayVar) {
        C8342c a = ahVar.mo11712a(ayVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
