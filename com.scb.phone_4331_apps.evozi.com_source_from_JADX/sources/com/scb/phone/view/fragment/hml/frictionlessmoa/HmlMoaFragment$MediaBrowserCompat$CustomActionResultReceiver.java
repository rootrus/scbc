package com.scb.phone.view.fragment.hml.frictionlessmoa;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getShortcutName;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class HmlMoaFragment$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlMoaFragment MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HmlMoaFragment$MediaBrowserCompat$CustomActionResultReceiver(HmlMoaFragment hmlMoaFragment) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = hmlMoaFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        getShortcutName getshortcutname = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (getshortcutname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (booleanValue) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new getShortcutName.IconCompatParcelizer(getshortcutname);
            if (getshortcutname.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getshortcutname.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getShortcutName.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
            if (getshortcutname.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getshortcutname.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
