package com.scb.phone.view.fragment.hml;

import android.text.Editable;
import android.text.TextUtils;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.getPageID;
import p040o.getPageID$MediaBrowserCompat$ItemReceiver;

class HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ HmlBasePersonalInfoFragment write;

    private HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver(HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment) {
        this.write = hmlBasePersonalInfoFragment;
    }

    /* synthetic */ HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver(HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment, byte b) {
        this(hmlBasePersonalInfoFragment);
    }

    public final void afterTextChanged(Editable editable) {
        getPageID IconCompatParcelizer = this.write.IconCompatParcelizer;
        String obj = editable.toString();
        if (obj != null && !obj.equals("")) {
            obj = obj.replace("-", "");
        }
        IconCompatParcelizer.write(getPageID$MediaBrowserCompat$ItemReceiver.MOBILE_NUMBER, IconCompatParcelizer.Keep.read(obj), TextUtils.isEmpty(obj));
    }
}
