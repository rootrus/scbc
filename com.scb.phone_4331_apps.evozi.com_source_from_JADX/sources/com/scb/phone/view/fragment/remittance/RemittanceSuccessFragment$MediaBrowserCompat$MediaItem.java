package com.scb.phone.view.fragment.remittance;

import android.net.Uri;
import p040o.C5024nV;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.nV$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

final class RemittanceSuccessFragment$MediaBrowserCompat$MediaItem<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ RemittanceSuccessFragment read;

    RemittanceSuccessFragment$MediaBrowserCompat$MediaItem(RemittanceSuccessFragment remittanceSuccessFragment, boolean z) {
        this.read = remittanceSuccessFragment;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Uri uri = (Uri) obj;
        C5024nV nVVar = this.read.presenter;
        if (nVVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String obj2 = uri.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj2, "uri.toString()");
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) obj2, "slipFilePath");
        CharSequence charSequence = obj2;
        nVVar.write(!(charSequence == null || charSequence.length() == 0), new nV$MediaBrowserCompat$ItemReceiver(z, obj2));
    }
}
