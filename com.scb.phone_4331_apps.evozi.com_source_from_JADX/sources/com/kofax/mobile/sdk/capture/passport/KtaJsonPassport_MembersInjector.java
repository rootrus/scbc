package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class KtaJsonPassport_MembersInjector implements MileageQuantitySelectionActivity<KtaJsonPassport> {
    private final HmlReviewDocumentActivity<IJsonExactionHelper> aah;

    public KtaJsonPassport_MembersInjector(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aah = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<KtaJsonPassport> create(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        return new KtaJsonPassport_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(KtaJsonPassport ktaJsonPassport) {
        inject_jsonExactionHelper(ktaJsonPassport, this.aah.get());
    }

    public static void inject_jsonExactionHelper(KtaJsonPassport ktaJsonPassport, IJsonExactionHelper iJsonExactionHelper) {
        ktaJsonPassport.f4799ZW = iJsonExactionHelper;
    }
}
