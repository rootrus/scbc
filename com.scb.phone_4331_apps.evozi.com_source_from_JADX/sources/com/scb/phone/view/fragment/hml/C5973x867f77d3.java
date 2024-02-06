package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.IParameters;
import p040o.onGetStartedClick;
import p040o.setUserEmailAddress;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment$MediaBrowserCompat$SearchResultReceiver */
final class C5973x867f77d3 implements View.OnFocusChangeListener {
    private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment MediaBrowserCompat$ItemReceiver;

    C5973x867f77d3(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerETBPersonalInfoFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        setUserEmailAddress<IParameters> setuseremailaddress = this.MediaBrowserCompat$ItemReceiver.businessPresenter;
        if (setuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$ItemReceiver.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "spouseFirstNameInput.text");
        onGetStartedClick.write((Object) obj, "name");
        setuseremailaddress.setHasDecor.read = obj;
        boolean z2 = true;
        if (z) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setUserEmailAddress.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (setuseremailaddress.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(setuseremailaddress.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = new setUserEmailAddress.IconCompatParcelizer(setuseremailaddress);
        if (setuseremailaddress.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            iconCompatParcelizer2.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
    }
}
