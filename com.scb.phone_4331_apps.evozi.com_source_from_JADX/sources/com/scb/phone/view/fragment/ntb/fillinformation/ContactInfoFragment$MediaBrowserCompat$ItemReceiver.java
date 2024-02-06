package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.View;
import android.widget.EditText;

class ContactInfoFragment$MediaBrowserCompat$ItemReceiver implements View.OnFocusChangeListener {
    private /* synthetic */ ContactInfoFragment MediaBrowserCompat$ItemReceiver;

    private ContactInfoFragment$MediaBrowserCompat$ItemReceiver(ContactInfoFragment contactInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = contactInfoFragment;
    }

    /* synthetic */ ContactInfoFragment$MediaBrowserCompat$ItemReceiver(ContactInfoFragment contactInfoFragment, byte b) {
        this(contactInfoFragment);
    }

    public final void onFocusChange(View view, boolean z) {
        EditText editText = (EditText) view;
        if (!z) {
            this.MediaBrowserCompat$ItemReceiver.contactInformationPresenter.read(editText.getText().toString());
        }
    }
}
