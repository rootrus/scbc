package com.kofax.mobile.sdk.capture;

import com.kofax.mobile.sdk._internal.view.C8236l;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class ImageReviewActivity_MembersInjector implements MileageQuantitySelectionActivity<ImageReviewActivity> {

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8236l> f4514YG;

    /* renamed from: YS */
    private final HmlReviewDocumentActivity<IImageStorage> f4515YS;

    public ImageReviewActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8236l> hmlReviewDocumentActivity2) {
        this.f4515YS = hmlReviewDocumentActivity;
        this.f4514YG = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<ImageReviewActivity> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8236l> hmlReviewDocumentActivity2) {
        return new ImageReviewActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final void injectMembers(ImageReviewActivity imageReviewActivity) {
        inject_store(imageReviewActivity, this.f4515YS.get());
        inject_buttonsBarView(imageReviewActivity, this.f4514YG.get());
    }

    public static void inject_store(ImageReviewActivity imageReviewActivity, IImageStorage iImageStorage) {
        imageReviewActivity.f4510Yt = iImageStorage;
    }

    public static void inject_buttonsBarView(ImageReviewActivity imageReviewActivity, C8236l lVar) {
        imageReviewActivity.f4509YO = lVar;
    }
}
