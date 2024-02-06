package com.scb.phone.view.fragment.common;

import android.graphics.Bitmap;
import p040o.DebitCardMarketConductDeepLinkActivity;

/* renamed from: com.scb.phone.view.fragment.common.ThirdPartySlipFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5898x9ee8ad7c<T> implements DebitCardMarketConductDeepLinkActivity<Bitmap> {
    private /* synthetic */ ThirdPartySlipFragment read;

    C5898x9ee8ad7c(ThirdPartySlipFragment thirdPartySlipFragment) {
        this.read = thirdPartySlipFragment;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        this.read.MediaBrowserCompat$MediaItem = (Bitmap) obj;
    }
}
