package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.C5389xe324244b;
import p040o.IParameters;
import p040o.onGetStartedClick;
import p040o.setUserEmailAddress;
import p040o.setUserEmailAddress$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C5974xf11df18b implements View.OnFocusChangeListener {
    private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment MediaBrowserCompat$ItemReceiver;

    C5974xf11df18b(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerETBPersonalInfoFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        setUserEmailAddress<IParameters> setuseremailaddress = this.MediaBrowserCompat$ItemReceiver.businessPresenter;
        if (setuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$ItemReceiver.spouseLastNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "spouseLastNameInput.text");
        onGetStartedClick.write((Object) obj, "name");
        setuseremailaddress.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver = obj;
        boolean z2 = true;
        if (z) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5389xe324244b.IconCompatParcelizer;
            if (setuseremailaddress.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(setuseremailaddress.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_itemreceiver = new setUserEmailAddress$MediaBrowserCompat$ItemReceiver(setuseremailaddress);
        if (setuseremailaddress.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setuseremailaddress_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
    }
}
