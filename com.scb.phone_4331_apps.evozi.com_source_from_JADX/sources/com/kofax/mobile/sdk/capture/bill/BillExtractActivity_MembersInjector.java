package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.ExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class BillExtractActivity_MembersInjector implements MileageQuantitySelectionActivity<BillExtractActivity> {

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4591YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4592YG;

    /* renamed from: YN */
    private final HmlReviewDocumentActivity<IImageStorage> f4593YN;

    /* renamed from: Zx */
    private final HmlReviewDocumentActivity<BillExtractor> f4594Zx;

    public BillExtractActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<BillExtractor> hmlReviewDocumentActivity4) {
        this.f4593YN = hmlReviewDocumentActivity;
        this.f4592YG = hmlReviewDocumentActivity2;
        this.f4591YF = hmlReviewDocumentActivity3;
        this.f4594Zx = hmlReviewDocumentActivity4;
    }

    public static MileageQuantitySelectionActivity<BillExtractActivity> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<BillExtractor> hmlReviewDocumentActivity4) {
        return new BillExtractActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final void injectMembers(BillExtractActivity billExtractActivity) {
        ExtractActivity_MembersInjector.inject_imageStore(billExtractActivity, this.f4593YN.get());
        ExtractActivity_MembersInjector.inject_buttonsBarView(billExtractActivity, this.f4592YG.get());
        ExtractActivity_MembersInjector.inject_imageParamsStore(billExtractActivity, this.f4591YF.get());
        inject_extractor(billExtractActivity, this.f4594Zx.get());
    }

    public static void inject_extractor(BillExtractActivity billExtractActivity, BillExtractor billExtractor) {
        billExtractActivity.f4590Zw = billExtractor;
    }
}
