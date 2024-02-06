package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.C5388xbb871c72;
import p040o.GoodToKnowActivity;
import p040o.IParameters;
import p040o.onGetStartedClick;
import p040o.setUserEmailAddress;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5970x59d839b2 implements View.OnFocusChangeListener {
    private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment read;

    C5970x59d839b2(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
        this.read = hmlBusinessOwnerETBPersonalInfoFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        setUserEmailAddress<IParameters> setuseremailaddress = this.read.businessPresenter;
        if (setuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        CommonInputViewGroup commonInputViewGroup = this.read.spouseNIDInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "spouseNIDInput.text");
        onGetStartedClick.write((Object) obj, "text");
        boolean z2 = false;
        setuseremailaddress.setHasDecor.write = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(obj, "-", "", false);
        if (z) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setUserEmailAddress.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
            if (setuseremailaddress.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(setuseremailaddress.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_customactionresultreceiver = new C5388xbb871c72(setuseremailaddress);
        if (setuseremailaddress.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            setuseremailaddress_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
    }
}
