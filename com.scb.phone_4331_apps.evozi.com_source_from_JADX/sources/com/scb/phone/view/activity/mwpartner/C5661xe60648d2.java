package com.scb.phone.view.activity.mwpartner;

import android.location.Address;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.C4093bd;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.bd$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.newLatLngZoom;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5661xe60648d2<T> implements DebitCardMarketConductDeepLinkActivity<List<Address>> {
    private /* synthetic */ MwPinShopLocationActivity IconCompatParcelizer;
    private /* synthetic */ LatLng MediaBrowserCompat$ItemReceiver;

    C5661xe60648d2(MwPinShopLocationActivity mwPinShopLocationActivity, LatLng latLng) {
        this.IconCompatParcelizer = mwPinShopLocationActivity;
        this.MediaBrowserCompat$ItemReceiver = latLng;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        List list = (List) obj;
        if (list.size() > 0) {
            boolean z = false;
            if (((Address) list.get(0)).getAddressLine(0) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Address: ");
                sb.append(((Address) list.get(0)).getAddressLine(0).toString());
                onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), new Object[0]);
                C4093bd bdVar = this.IconCompatParcelizer.presenter;
                if (bdVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                double d = this.MediaBrowserCompat$ItemReceiver.latitude;
                double d2 = this.MediaBrowserCompat$ItemReceiver.longitude;
                String obj2 = ((Address) list.get(0)).getAddressLine(0).toString();
                onGetStartedClick.write((Object) obj2, "description");
                bdVar.MediaBrowserCompat$ItemReceiver = new newLatLngZoom(String.valueOf(d), String.valueOf(d2), obj2);
                writeUInt64NoTag.IconCompatParcelizer bd_mediabrowsercompat_customactionresultreceiver = new bd$MediaBrowserCompat$CustomActionResultReceiver(obj2);
                if (bdVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    bd_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(bdVar.RatingCompat);
                    return;
                }
                return;
            }
        }
        C4093bd bdVar2 = this.IconCompatParcelizer.presenter;
        if (bdVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String string = this.IconCompatParcelizer.getString(R.string.common_error);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.common_error)");
        String string2 = this.IconCompatParcelizer.getString(R.string.error_generic_resource);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.error_generic_resource)");
        onGetStartedClick.write((Object) string, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) string2, C8183f.f4230JO);
        bdVar2.read(string, string2);
        Marker write = this.IconCompatParcelizer.MediaSessionCompat$Token();
        if (write != null) {
            write.remove();
        }
    }
}
