package com.scb.phone.view.fragment.prepaid;

import android.net.Uri;
import p040o.DebitCardMarketConductDeepLinkActivity;

/* renamed from: com.scb.phone.view.fragment.prepaid.PrepaidTravelConversionSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6119xf3cfd941<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ PrepaidTravelConversionSuccessFragment MediaBrowserCompat$ItemReceiver;

    C6119xf3cfd941(PrepaidTravelConversionSuccessFragment prepaidTravelConversionSuccessFragment, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = prepaidTravelConversionSuccessFragment;
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(((Uri) obj).toString(), this.IconCompatParcelizer);
    }
}
