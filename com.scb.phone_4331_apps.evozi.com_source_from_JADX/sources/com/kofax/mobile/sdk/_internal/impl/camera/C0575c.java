package com.kofax.mobile.sdk._internal.impl.camera;

import android.content.res.AssetManager;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.c */
public final class C0575c implements MileageQuantitySelectionActivity<C0542a> {

    /* renamed from: zS */
    private final HmlReviewDocumentActivity<AssetManager> f1313zS;

    public C0575c(HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity) {
        this.f1313zS = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<C0542a> create(HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity) {
        return new C0575c(hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public final void injectMembers(C0542a aVar) {
        m1175a(aVar, this.f1313zS.get());
    }

    /* renamed from: a */
    public static void m1175a(C0542a aVar, AssetManager assetManager) {
        aVar.f1228zR = assetManager;
    }
}
