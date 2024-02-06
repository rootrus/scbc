package com.scb.phone.view.fragment.hml.businessowner;

import android.text.Editable;
import android.text.TextWatcher;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessURLInfoFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C6026x572d820c implements TextWatcher {
    private /* synthetic */ HmlBusinessURLInfoFragment read;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C6026x572d820c(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
        this.read = hmlBusinessURLInfoFragment;
    }

    public final void afterTextChanged(Editable editable) {
        CommonInputViewGroup commonInputViewGroup = this.read.businessRegNumEt;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        commonInputViewGroup.write = true;
        commonInputViewGroup.mEditClearImageButton.setVisibility(0);
    }
}
