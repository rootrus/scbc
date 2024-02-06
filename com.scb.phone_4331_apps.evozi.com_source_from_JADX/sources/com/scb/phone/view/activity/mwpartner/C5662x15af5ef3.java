package com.scb.phone.view.activity.mwpartner;

import com.google.android.gms.maps.model.Marker;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import org.bouncycastle.i18n.MessageBundle;
import p040o.C4093bd;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$MediaBrowserCompat$SearchResultReceiver */
final class C5662x15af5ef3<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    private /* synthetic */ MwPinShopLocationActivity MediaBrowserCompat$ItemReceiver;

    C5662x15af5ef3(MwPinShopLocationActivity mwPinShopLocationActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwPinShopLocationActivity;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("IOException", new Object[0]);
        C4093bd bdVar = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (bdVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String string = this.MediaBrowserCompat$ItemReceiver.getString(R.string.common_error);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.common_error)");
        String string2 = this.MediaBrowserCompat$ItemReceiver.getString(R.string.error_generic_resource);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.error_generic_resource)");
        onGetStartedClick.write((Object) string, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) string2, C8183f.f4230JO);
        bdVar.read(string, string2);
        Marker write = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token();
        if (write != null) {
            write.remove();
        }
    }
}
