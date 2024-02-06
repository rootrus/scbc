package com.scb.phone.view.activity.mwpartner;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.maps.model.LatLng;
import p040o.C4093bd;
import p040o.newLatLngZoom;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class MwPinShopLocationActivity$MediaBrowserCompat$ItemReceiver<R extends Result> implements ResultCallback<PlaceBuffer> {
    private /* synthetic */ MwPinShopLocationActivity MediaBrowserCompat$ItemReceiver;

    MwPinShopLocationActivity$MediaBrowserCompat$ItemReceiver(MwPinShopLocationActivity mwPinShopLocationActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwPinShopLocationActivity;
    }

    public final /* synthetic */ void onResult(Result result) {
        PlaceBuffer placeBuffer = (PlaceBuffer) result;
        onGetStartedClick.write((Object) placeBuffer, "places");
        boolean z = false;
        Place place = placeBuffer.get(0);
        MwPinShopLocationActivity mwPinShopLocationActivity = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) place, "place");
        LatLng latLng = place.getLatLng();
        onGetStartedClick.IconCompatParcelizer((Object) latLng, "place.latLng");
        mwPinShopLocationActivity.IconCompatParcelizer(latLng);
        C4093bd bdVar = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (bdVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        double d = place.getLatLng().latitude;
        double d2 = place.getLatLng().longitude;
        String obj = place.getName().toString();
        String valueOf = String.valueOf(place.getAddress());
        onGetStartedClick.write((Object) obj, "name");
        onGetStartedClick.write((Object) valueOf, "description");
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(' ');
        sb.append(valueOf);
        bdVar.MediaBrowserCompat$ItemReceiver = new newLatLngZoom(String.valueOf(d), String.valueOf(d2), sb.toString());
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C4093bd.MediaMetadataCompat(obj, valueOf);
        if (bdVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            mediaMetadataCompat.IconCompatParcelizer(bdVar.RatingCompat);
        }
    }
}
