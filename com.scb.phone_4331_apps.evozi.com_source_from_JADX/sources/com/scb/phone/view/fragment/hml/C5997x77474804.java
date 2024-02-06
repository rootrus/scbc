package com.scb.phone.view.fragment.hml;

import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.onGetStartedClick;
import p040o.removeIfFromRandomAccessList;

/* renamed from: com.scb.phone.view.fragment.hml.HmlNTBExternalAuthenticationFragment$MediaBrowserCompat$ItemReceiver */
final class C5997x77474804 implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
    private /* synthetic */ HmlNTBExternalAuthenticationFragment MediaBrowserCompat$ItemReceiver;

    C5997x77474804(HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlNTBExternalAuthenticationFragment;
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        if (this.MediaBrowserCompat$ItemReceiver.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) str, "input");
        onGetStartedClick.write((Object) str, "nationalId");
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "X-XXXX-XXXXX-XX-X");
    }
}
