package com.scb.phone.view.fragment.juristic;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.scb.phone.view.fragment.juristic.JuristicResetPinLandingFragment$MediaBrowserCompat$SearchResultReceiver */
public final class C6075x8a39d9f2 implements TextWatcher {
    private /* synthetic */ JuristicResetPinLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C6075x8a39d9f2(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicResetPinLandingFragment;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            JuristicResetPinLandingFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
