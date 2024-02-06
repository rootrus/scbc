package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.ExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractActivity_MembersInjector */
public final class IdExtractActivity_MembersInjector implements MileageQuantitySelectionActivity<IdExtractActivity> {

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4757YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4758YG;

    /* renamed from: YN */
    private final HmlReviewDocumentActivity<IImageStorage> f4759YN;

    /* renamed from: Zx */
    private final HmlReviewDocumentActivity<IdExtractor> f4760Zx;

    public IdExtractActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IdExtractor> hmlReviewDocumentActivity4) {
        this.f4759YN = hmlReviewDocumentActivity;
        this.f4758YG = hmlReviewDocumentActivity2;
        this.f4757YF = hmlReviewDocumentActivity3;
        this.f4760Zx = hmlReviewDocumentActivity4;
    }

    public static MileageQuantitySelectionActivity<IdExtractActivity> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<IdExtractor> hmlReviewDocumentActivity4) {
        return new IdExtractActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final void injectMembers(IdExtractActivity idExtractActivity) {
        ExtractActivity_MembersInjector.inject_imageStore(idExtractActivity, this.f4759YN.get());
        ExtractActivity_MembersInjector.inject_buttonsBarView(idExtractActivity, this.f4758YG.get());
        ExtractActivity_MembersInjector.inject_imageParamsStore(idExtractActivity, this.f4757YF.get());
        inject_extractor(idExtractActivity, this.f4760Zx.get());
    }

    public static void inject_extractor(IdExtractActivity idExtractActivity, IdExtractor idExtractor) {
        idExtractActivity.acz = idExtractor;
    }
}
