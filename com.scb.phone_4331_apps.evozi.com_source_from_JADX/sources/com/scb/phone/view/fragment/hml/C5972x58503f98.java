package com.scb.phone.view.fragment.hml;

import p040o.C5388xbb871c72;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IParameters;
import p040o.onGetStartedClick;
import p040o.setUserEmailAddress;
import p040o.setUserEmailAddress$MediaBrowserCompat$ItemReceiver;
import p040o.setUserEmailAddress$MediaBrowserCompat$MediaItem;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment$MediaBrowserCompat$MediaItem */
final class C5972x58503f98 extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5972x58503f98(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
        super(1);
        this.read = hmlBusinessOwnerETBPersonalInfoFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        setUserEmailAddress<IParameters> setuseremailaddress = this.read.businessPresenter;
        if (setuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        setuseremailaddress.setHasDecor.MediaBrowserCompat$ItemReceiver = Boolean.valueOf(booleanValue);
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_mediaitem = new setUserEmailAddress$MediaBrowserCompat$MediaItem(booleanValue);
        boolean z = true;
        if (setuseremailaddress.RatingCompat != null) {
            setuseremailaddress_mediabrowsercompat_mediaitem.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new setUserEmailAddress.read(setuseremailaddress);
        if (setuseremailaddress.RatingCompat != null) {
            read2.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
        if (booleanValue) {
            if (setuseremailaddress.setHasDecor.write != null) {
                writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_customactionresultreceiver = new C5388xbb871c72(setuseremailaddress);
                if (setuseremailaddress.RatingCompat != null) {
                    setuseremailaddress_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
                }
            }
            if (setuseremailaddress.setHasDecor.read != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new setUserEmailAddress.IconCompatParcelizer(setuseremailaddress);
                if (setuseremailaddress.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(setuseremailaddress.RatingCompat);
                }
            }
            if (setuseremailaddress.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver != null) {
                writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_itemreceiver = new setUserEmailAddress$MediaBrowserCompat$ItemReceiver(setuseremailaddress);
                if (setuseremailaddress.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setuseremailaddress_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
                }
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
