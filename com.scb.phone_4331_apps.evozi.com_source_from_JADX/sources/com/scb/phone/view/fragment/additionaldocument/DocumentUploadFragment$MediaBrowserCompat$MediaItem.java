package com.scb.phone.view.fragment.additionaldocument;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getSettings;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class DocumentUploadFragment$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ DocumentUploadFragment MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DocumentUploadFragment$MediaBrowserCompat$MediaItem(DocumentUploadFragment documentUploadFragment) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = documentUploadFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        getSettings getsettings = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (getsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "documentCode");
        writeUInt64NoTag.IconCompatParcelizer setbackgroundresource = new getSettings.setBackgroundResource(str);
        if (getsettings.RatingCompat != null) {
            setbackgroundresource.IconCompatParcelizer(getsettings.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
