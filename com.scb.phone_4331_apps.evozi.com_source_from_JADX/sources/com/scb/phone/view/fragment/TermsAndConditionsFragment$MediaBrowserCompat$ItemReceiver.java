package com.scb.phone.view.fragment;

import android.view.View;
import p040o.C4656xc27f5244;
import p040o.getSessionDeviceSize;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class TermsAndConditionsFragment$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ TermsAndConditionsFragment IconCompatParcelizer;

    TermsAndConditionsFragment$MediaBrowserCompat$ItemReceiver(TermsAndConditionsFragment termsAndConditionsFragment) {
        this.IconCompatParcelizer = termsAndConditionsFragment;
    }

    public final void onClick(View view) {
        getSessionDeviceSize getsessiondevicesize = this.IconCompatParcelizer.presenter;
        if (getsessiondevicesize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer getsessiondevicesize_mediabrowsercompat_customactionresultreceiver = new C4656xc27f5244(getsessiondevicesize);
        if (getsessiondevicesize.RatingCompat != null) {
            getsessiondevicesize_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getsessiondevicesize.RatingCompat);
        }
    }
}
