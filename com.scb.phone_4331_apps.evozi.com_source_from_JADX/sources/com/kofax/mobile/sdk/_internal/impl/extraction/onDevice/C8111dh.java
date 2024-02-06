package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8575ae;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dh */
public final class C8111dh implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4073LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8575ae> f4074LX;

    /* renamed from: Mm */
    private final HmlReviewDocumentActivity<C7910e> f4075Mm;

    public C8111dh(C0705ah ahVar, HmlReviewDocumentActivity<C8575ae> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity2) {
        this.f4073LV = ahVar;
        this.f4074LX = hmlReviewDocumentActivity;
        this.f4075Mm = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4073LV.mo11710a(this.f4074LX.get(), this.f4075Mm.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: z */
    public static C8111dh m4259z(C0705ah ahVar, HmlReviewDocumentActivity<C8575ae> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity2) {
        return new C8111dh(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4258a(C0705ah ahVar, C8575ae aeVar, C7910e eVar) {
        C8342c a = ahVar.mo11710a(aeVar, eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
