package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C8237m;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ao */
public final class C8215ao implements MileageQuantitySelectionActivity<SelfieOverlayView> {

    /* renamed from: XW */
    private final HmlReviewDocumentActivity<C8237m> f4322XW;

    /* renamed from: mX */
    private final HmlReviewDocumentActivity<C0770c> f4323mX;

    /* renamed from: mZ */
    private final HmlReviewDocumentActivity<C0772e> f4324mZ;

    public C8215ao(HmlReviewDocumentActivity<C8237m> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity3) {
        this.f4322XW = hmlReviewDocumentActivity;
        this.f4323mX = hmlReviewDocumentActivity2;
        this.f4324mZ = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<SelfieOverlayView> create(HmlReviewDocumentActivity<C8237m> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity3) {
        return new C8215ao(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: b */
    public final void injectMembers(SelfieOverlayView selfieOverlayView) {
        m4509a(selfieOverlayView, this.f4322XW.get());
        m4507a(selfieOverlayView, this.f4323mX.get());
        m4508a(selfieOverlayView, this.f4324mZ.get());
    }

    /* renamed from: a */
    public static void m4509a(SelfieOverlayView selfieOverlayView, C8237m mVar) {
        selfieOverlayView._selfieOverlayFrameView = mVar;
    }

    /* renamed from: a */
    public static void m4507a(SelfieOverlayView selfieOverlayView, C0770c cVar) {
        selfieOverlayView._captureMessagesFrameView = cVar;
    }

    /* renamed from: a */
    public static void m4508a(SelfieOverlayView selfieOverlayView, C0772e eVar) {
        selfieOverlayView._circleAnimationView = eVar;
    }
}
