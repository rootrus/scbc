package com.scb.phone.view.fragment.hml.businessowner;

import p040o.CheckEligibilityActivity;
import p040o.ExtractionCredentials;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.setUserLoggedIn;
import p040o.setUserLoggedIn$AlertController$RecycleListView;
import p040o.writeUInt64NoTag;

final class HmlBusinessOccupationInfoFragment$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlBusinessOccupationInfoFragment MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HmlBusinessOccupationInfoFragment$MediaBrowserCompat$MediaItem(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOccupationInfoFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (setuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = booleanValue;
        setuserloggedin.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = !booleanValue;
        writeUInt64NoTag.IconCompatParcelizer setuserloggedin_alertcontroller_recyclelistview = new setUserLoggedIn$AlertController$RecycleListView(setuserloggedin);
        if (setuserloggedin.RatingCompat != null) {
            setuserloggedin_alertcontroller_recyclelistview.IconCompatParcelizer(setuserloggedin.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
