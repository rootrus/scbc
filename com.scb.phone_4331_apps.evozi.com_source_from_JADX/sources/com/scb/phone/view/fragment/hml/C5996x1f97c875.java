package com.scb.phone.view.fragment.hml;

import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.onGetStartedClick;
import p040o.setErrorMessage;

/* renamed from: com.scb.phone.view.fragment.hml.HmlNTBExternalAuthenticationFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5996x1f97c875 implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write {
    private /* synthetic */ HmlNTBExternalAuthenticationFragment IconCompatParcelizer;

    C5996x1f97c875(HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment) {
        this.IconCompatParcelizer = hmlNTBExternalAuthenticationFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "text");
        setErrorMessage seterrormessage = this.IconCompatParcelizer.presenter;
        if (seterrormessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seterrormessage.write(str);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "text");
        setErrorMessage seterrormessage = this.IconCompatParcelizer.presenter;
        if (seterrormessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seterrormessage.write(str);
    }
}
