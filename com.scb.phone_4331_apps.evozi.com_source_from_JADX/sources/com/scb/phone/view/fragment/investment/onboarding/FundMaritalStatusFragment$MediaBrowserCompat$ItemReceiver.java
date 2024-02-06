package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.EditText;

class FundMaritalStatusFragment$MediaBrowserCompat$ItemReceiver implements View.OnFocusChangeListener {
    private /* synthetic */ FundMaritalStatusFragment IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private boolean read;

    FundMaritalStatusFragment$MediaBrowserCompat$ItemReceiver(FundMaritalStatusFragment fundMaritalStatusFragment, int i, boolean z) {
        this.IconCompatParcelizer = fundMaritalStatusFragment;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = z;
    }

    public final void onFocusChange(View view, boolean z) {
        EditText editText = (EditText) view;
        if (!z) {
            this.IconCompatParcelizer.fundMaritalPresenter.MediaBrowserCompat$CustomActionResultReceiver(editText.getText().toString(), this.MediaBrowserCompat$ItemReceiver, this.read);
        }
    }
}
