package com.scb.phone.view.fragment.hml.businessowner;

import android.widget.CompoundButton;
import p040o.ExtractionCredentials;
import p040o.onGetStartedClick;
import p040o.setUserLoggedIn;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6013xc2e3343d implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ HmlBusinessOccupationInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6013xc2e3343d(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOccupationInfoFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (setuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin.MediaBrowserCompat$ItemReceiver(z);
    }
}
