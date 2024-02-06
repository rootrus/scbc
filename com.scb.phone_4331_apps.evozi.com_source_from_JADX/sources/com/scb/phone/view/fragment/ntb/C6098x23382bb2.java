package com.scb.phone.view.fragment.ntb;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.scb.phone.view.fragment.ntb.NtbUserInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6098x23382bb2 implements TextView.OnEditorActionListener {
    private /* synthetic */ NtbUserInfoFragment MediaBrowserCompat$ItemReceiver;

    private C6098x23382bb2(NtbUserInfoFragment ntbUserInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = ntbUserInfoFragment;
    }

    /* synthetic */ C6098x23382bb2(NtbUserInfoFragment ntbUserInfoFragment, byte b) {
        this(ntbUserInfoFragment);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.MediaBrowserCompat$ItemReceiver.mEmailInput.clearFocus();
        return true;
    }
}
