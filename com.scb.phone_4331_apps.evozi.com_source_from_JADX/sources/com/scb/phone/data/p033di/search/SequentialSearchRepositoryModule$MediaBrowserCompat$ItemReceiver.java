package com.scb.phone.data.p033di.search;

import com.google.android.gms.maps.model.LatLng;
import com.scb.phone.data.p033di.easycash.C1068xa4368296;
import p040o.rsnElementGetNativeData;

/* renamed from: com.scb.phone.data.di.search.SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver */
public final class SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver {
    private double write;

    private SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver() {
    }

    public SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver(double d) {
        this.write = d;
    }

    public final LatLng write(C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver) {
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver / this.write))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer / this.write) - 0.5d) * 360.0d);
    }

    public final rsnElementGetNativeData MediaBrowserCompat$CustomActionResultReceiver(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        double d = this.write;
        return new rsnElementGetNativeData(((latLng.longitude / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }
}
