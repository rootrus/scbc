package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import com.kofax.mobile.sdk._internal.impl.view.C0738ac;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0771d;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C0773f;
import com.kofax.mobile.sdk._internal.view.C0774g;
import com.kofax.mobile.sdk._internal.view.C0777k;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class DocumentBaseOverlayView_MembersInjector implements MileageQuantitySelectionActivity<DocumentBaseOverlayView> {

    /* renamed from: mW */
    private final HmlReviewDocumentActivity<C0774g> f3546mW;

    /* renamed from: mX */
    private final HmlReviewDocumentActivity<C0770c> f3547mX;

    /* renamed from: mY */
    private final HmlReviewDocumentActivity<C0771d> f3548mY;

    /* renamed from: mZ */
    private final HmlReviewDocumentActivity<C0772e> f3549mZ;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f3550na;

    /* renamed from: nb */
    private final HmlReviewDocumentActivity<C0777k> f3551nb;

    /* renamed from: nc */
    private final HmlReviewDocumentActivity<C0773f> f3552nc;

    public DocumentBaseOverlayView_MembersInjector(HmlReviewDocumentActivity<C0774g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0771d> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0777k> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0773f> hmlReviewDocumentActivity7) {
        this.f3546mW = hmlReviewDocumentActivity;
        this.f3547mX = hmlReviewDocumentActivity2;
        this.f3548mY = hmlReviewDocumentActivity3;
        this.f3549mZ = hmlReviewDocumentActivity4;
        this.f3550na = hmlReviewDocumentActivity5;
        this.f3551nb = hmlReviewDocumentActivity6;
        this.f3552nc = hmlReviewDocumentActivity7;
    }

    public static MileageQuantitySelectionActivity<DocumentBaseOverlayView> create(HmlReviewDocumentActivity<C0774g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0771d> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0777k> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0773f> hmlReviewDocumentActivity7) {
        return new DocumentBaseOverlayView_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
    }

    public final void injectMembers(DocumentBaseOverlayView documentBaseOverlayView) {
        C0738ac.m1684a((C0735aa) documentBaseOverlayView, this.f3546mW.get());
        C0738ac.m1680a((C0735aa) documentBaseOverlayView, this.f3547mX.get());
        C0738ac.m1681a((C0735aa) documentBaseOverlayView, this.f3548mY.get());
        C0738ac.m1682a((C0735aa) documentBaseOverlayView, this.f3549mZ.get());
        C0738ac.m1679a((C0735aa) documentBaseOverlayView, this.f3550na.get());
        C0738ac.m1685a((C0735aa) documentBaseOverlayView, this.f3551nb.get());
        C0738ac.m1683a((C0735aa) documentBaseOverlayView, this.f3552nc.get());
    }
}
