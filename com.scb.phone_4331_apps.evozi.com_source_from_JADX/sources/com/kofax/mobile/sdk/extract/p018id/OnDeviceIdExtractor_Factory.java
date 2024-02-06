package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.extract.id.OnDeviceIdExtractor_Factory */
public final class OnDeviceIdExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor> {

    /* renamed from: Zx */
    private final HmlReviewDocumentActivity<C7914k> f4886Zx;
    private final HmlReviewDocumentActivity<IProjectProvider> aer;

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f4887ws;

    public OnDeviceIdExtractor_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IProjectProvider> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7914k> hmlReviewDocumentActivity3) {
        this.f4887ws = hmlReviewDocumentActivity;
        this.aer = hmlReviewDocumentActivity2;
        this.f4886Zx = hmlReviewDocumentActivity3;
    }

    public final OnDeviceIdExtractor get() {
        OnDeviceIdExtractor onDeviceIdExtractor = new OnDeviceIdExtractor(this.f4887ws.get(), this.aer.get());
        OnDeviceIdExtractor_MembersInjector.inject_extractorProvider(onDeviceIdExtractor, this.f4886Zx.get());
        return onDeviceIdExtractor;
    }

    public static OnDeviceIdExtractor_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IProjectProvider> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7914k> hmlReviewDocumentActivity3) {
        return new OnDeviceIdExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public static OnDeviceIdExtractor newOnDeviceIdExtractor(Context context, IProjectProvider iProjectProvider) {
        return new OnDeviceIdExtractor(context, iProjectProvider);
    }
}
