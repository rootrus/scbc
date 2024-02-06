package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class RttiJsonCheck_MembersInjector implements MileageQuantitySelectionActivity<RttiJsonCheck> {
    private final HmlReviewDocumentActivity<IJsonExactionHelper> aah;

    public RttiJsonCheck_MembersInjector(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aah = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<RttiJsonCheck> create(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        return new RttiJsonCheck_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(RttiJsonCheck rttiJsonCheck) {
        inject_jsonExactionHelper(rttiJsonCheck, this.aah.get());
    }

    public static void inject_jsonExactionHelper(RttiJsonCheck rttiJsonCheck, IJsonExactionHelper iJsonExactionHelper) {
        rttiJsonCheck.f4705ZW = iJsonExactionHelper;
    }
}
