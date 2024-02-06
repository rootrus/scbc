package com.scb.phone.view.fragment.investment.onboarding;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.scb.phone.view.fragment.investment.onboarding.FundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6037x5fd71b5e implements TextWatcher {
    private int IconCompatParcelizer = 0;
    private C6038x535d976b MediaBrowserCompat$ItemReceiver;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C6037x5fd71b5e(C6038x535d976b fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        this.MediaBrowserCompat$ItemReceiver = fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = i;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C6038x535d976b fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver != null) {
            fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write(charSequence, this.IconCompatParcelizer);
        }
    }
}
