package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.scb.phone.view.fragment.ntb.fillinformation.ContactInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6103xab81614b implements TextView.OnEditorActionListener {
    private /* synthetic */ ContactInfoFragment MediaBrowserCompat$ItemReceiver;

    private C6103xab81614b(ContactInfoFragment contactInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = contactInfoFragment;
    }

    /* synthetic */ C6103xab81614b(ContactInfoFragment contactInfoFragment, byte b) {
        this(contactInfoFragment);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.MediaBrowserCompat$ItemReceiver.customMobile.mEditText.clearFocus();
        return true;
    }
}
