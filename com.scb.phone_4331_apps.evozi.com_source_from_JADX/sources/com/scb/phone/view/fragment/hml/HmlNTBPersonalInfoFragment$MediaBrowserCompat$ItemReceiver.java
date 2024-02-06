package com.scb.phone.view.fragment.hml;

import android.text.Editable;
import android.text.TextUtils;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.getPageID$MediaBrowserCompat$ItemReceiver;

class HmlNTBPersonalInfoFragment$MediaBrowserCompat$ItemReceiver extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ HmlNTBPersonalInfoFragment write;

    private HmlNTBPersonalInfoFragment$MediaBrowserCompat$ItemReceiver(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.write = hmlNTBPersonalInfoFragment;
    }

    /* synthetic */ HmlNTBPersonalInfoFragment$MediaBrowserCompat$ItemReceiver(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment, byte b) {
        this(hmlNTBPersonalInfoFragment);
    }

    public final void afterTextChanged(Editable editable) {
        this.write.presenter.read(getPageID$MediaBrowserCompat$ItemReceiver.HOME_ADDRESS, !TextUtils.isEmpty(editable.toString()));
    }
}
