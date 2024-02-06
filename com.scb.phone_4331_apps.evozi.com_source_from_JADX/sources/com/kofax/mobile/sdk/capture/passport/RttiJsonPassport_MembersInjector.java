package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class RttiJsonPassport_MembersInjector implements MileageQuantitySelectionActivity<RttiJsonPassport> {
    private final HmlReviewDocumentActivity<IJsonExactionHelper> aah;

    public RttiJsonPassport_MembersInjector(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aah = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<RttiJsonPassport> create(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        return new RttiJsonPassport_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(RttiJsonPassport rttiJsonPassport) {
        inject_jsonExactionHelper(rttiJsonPassport, this.aah.get());
    }

    public static void inject_jsonExactionHelper(RttiJsonPassport rttiJsonPassport, IJsonExactionHelper iJsonExactionHelper) {
        rttiJsonPassport.f4872ZW = iJsonExactionHelper;
    }
}
