package com.scb.phone.view.fragment.prepaid.cashout;

import android.net.Uri;
import p040o.DebitCardMarketConductDeepLinkActivity;

final class PrepaidCashOutSuccessFragment$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
    private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ PrepaidCashOutSuccessFragment read;

    PrepaidCashOutSuccessFragment$MediaBrowserCompat$ItemReceiver(PrepaidCashOutSuccessFragment prepaidCashOutSuccessFragment, boolean z) {
        this.read = prepaidCashOutSuccessFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        this.read.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
