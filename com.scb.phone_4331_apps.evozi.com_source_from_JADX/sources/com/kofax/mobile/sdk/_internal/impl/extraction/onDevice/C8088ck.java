package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p083w.C8566z;
import com.kofax.mobile.sdk.p084x.C8581ak;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ck */
public final class C8088ck implements OPRStatusRewardsLandingActivity_ViewBinding<C8566z.C8567a> {

    /* renamed from: LV */
    private final C0705ah f4010LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8581ak> f4011ad;

    public C8088ck(C0705ah ahVar, HmlReviewDocumentActivity<C8581ak> hmlReviewDocumentActivity) {
        this.f4010LV = ahVar;
        this.f4011ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nX */
    public final C8566z.C8567a get() {
        C8566z.C8567a a = this.f4010LV.mo11726a(this.f4011ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: J */
    public static C8088ck m4190J(C0705ah ahVar, HmlReviewDocumentActivity<C8581ak> hmlReviewDocumentActivity) {
        return new C8088ck(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8566z.C8567a m4191a(C0705ah ahVar, C8581ak akVar) {
        C8566z.C8567a a = ahVar.mo11726a(akVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
