package com.scb.phone.view.fragment.hml;

import com.google.android.gms.actions.SearchIntents;
import p040o.CheckEligibilityActivity;
import p040o.ExtractionParameters;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getUserEmailAddress;
import p040o.getUserEmailAddress$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.HmlCompanyNameFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5981x9c5ae27e extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlCompanyNameFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5981x9c5ae27e(HmlCompanyNameFragment hmlCompanyNameFragment) {
        super(1);
        this.write = hmlCompanyNameFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.write.presenter;
        if (getuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, SearchIntents.EXTRA_QUERY);
        getuseremailaddress.read = str;
        boolean z = true;
        getuseremailaddress.IconCompatParcelizer = str.length() >= 3;
        writeUInt64NoTag.IconCompatParcelizer getuseremailaddress_mediabrowsercompat_searchresultreceiver = new getUserEmailAddress$MediaBrowserCompat$SearchResultReceiver(getuseremailaddress, str);
        if (getuseremailaddress.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getuseremailaddress_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(getuseremailaddress.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
