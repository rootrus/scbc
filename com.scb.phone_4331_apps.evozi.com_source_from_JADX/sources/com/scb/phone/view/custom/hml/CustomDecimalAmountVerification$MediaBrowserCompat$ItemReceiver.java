package com.scb.phone.view.custom.hml;

import com.scb.phone.view.custom.hml.CustomDecimalAmountVerification;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;

public final class CustomDecimalAmountVerification$MediaBrowserCompat$ItemReceiver extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ CustomDecimalAmountVerification MediaBrowserCompat$ItemReceiver;

    CustomDecimalAmountVerification$MediaBrowserCompat$ItemReceiver(CustomDecimalAmountVerification customDecimalAmountVerification) {
        this.MediaBrowserCompat$ItemReceiver = customDecimalAmountVerification;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CustomDecimalAmountVerification.IconCompatParcelizer IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.read;
        if (IconCompatParcelizer != null) {
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(String.valueOf(charSequence), charSequence != null && charSequence.length() == 2);
        }
    }
}
