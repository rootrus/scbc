package com.scb.phone.view.fragment.mailingaddress;

import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.AppStatsDataStore;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.mailingaddress.BaseMailingAddressFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6084x88cd1d58 implements CustomAddressInput.IconCompatParcelizer {
    private /* synthetic */ BaseMailingAddressFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6084x88cd1d58(BaseMailingAddressFragment baseMailingAddressFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseMailingAddressFragment;
    }

    public final void write(boolean z) {
        AppStatsDataStore.C3032b bVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new AppStatsDataStore.C3032b.read(z);
        if (bVar.RatingCompat != null) {
            read.IconCompatParcelizer(bVar.RatingCompat);
        }
    }
}
