package com.scb.phone.data.p033di.easycash;

/* renamed from: com.scb.phone.data.di.easycash.EasycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1067x8ceb5283 {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final double MediaBrowserCompat$ItemReceiver;
    public final double MediaMetadataCompat;
    public final double read;
    public final double write;

    private C1067x8ceb5283() {
    }

    public C1067x8ceb5283(double d, double d2, double d3, double d4) {
        this.write = d;
        this.MediaMetadataCompat = d3;
        this.IconCompatParcelizer = d2;
        this.read = d4;
        this.MediaBrowserCompat$CustomActionResultReceiver = (d + d2) / 2.0d;
        this.MediaBrowserCompat$ItemReceiver = (d3 + d4) / 2.0d;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(double d, double d2) {
        return this.write <= d && d <= this.IconCompatParcelizer && this.MediaMetadataCompat <= d2 && d2 <= this.read;
    }
}
