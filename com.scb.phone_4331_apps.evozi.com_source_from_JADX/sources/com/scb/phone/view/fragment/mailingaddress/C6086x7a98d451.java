package com.scb.phone.view.fragment.mailingaddress;

import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.AppStatsDataStore;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.mailingaddress.BaseMailingAddressFragment$MediaSessionCompat$ResultReceiverWrapper */
final class C6086x7a98d451 implements CustomAddressInput.IconCompatParcelizer {
    private /* synthetic */ BaseMailingAddressFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6086x7a98d451(BaseMailingAddressFragment baseMailingAddressFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseMailingAddressFragment;
    }

    public final void write(boolean z) {
        AppStatsDataStore.C3032b bVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new AppStatsDataStore.C3032b.IconCompatParcelizer(z);
        if (bVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(bVar.RatingCompat);
        }
    }
}
