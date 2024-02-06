package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.md5Hash;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.hml.HmlDocumentListFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5983x1065c8dd<T> implements DebitCardMarketConductDeepLinkActivity<Intent> {
    private /* synthetic */ HmlDocumentListFragment write;

    C5983x1065c8dd(HmlDocumentListFragment hmlDocumentListFragment) {
        this.write = hmlDocumentListFragment;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        md5Hash md5hash = this.write.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        md5hash.MediaBrowserCompat$ItemReceiver();
    }
}
