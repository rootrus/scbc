package com.scb.phone.view.fragment.ntb;

import android.view.View;
import android.widget.EditText;

class NtbUserInfoFragment$MediaBrowserCompat$ItemReceiver implements View.OnFocusChangeListener {
    private /* synthetic */ NtbUserInfoFragment IconCompatParcelizer;

    private NtbUserInfoFragment$MediaBrowserCompat$ItemReceiver(NtbUserInfoFragment ntbUserInfoFragment) {
        this.IconCompatParcelizer = ntbUserInfoFragment;
    }

    /* synthetic */ NtbUserInfoFragment$MediaBrowserCompat$ItemReceiver(NtbUserInfoFragment ntbUserInfoFragment, byte b) {
        this(ntbUserInfoFragment);
    }

    public final void onFocusChange(View view, boolean z) {
        EditText editText = (EditText) view;
        if (!z) {
            this.IconCompatParcelizer.mPresenter.MediaBrowserCompat$CustomActionResultReceiver(editText.getText().toString().replaceAll("-", ""));
        }
    }
}
