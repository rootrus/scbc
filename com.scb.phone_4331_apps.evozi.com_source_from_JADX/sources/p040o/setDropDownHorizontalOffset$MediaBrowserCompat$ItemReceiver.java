package p040o;

import android.app.PendingIntent;
import android.os.Bundle;
import p040o.setDropDownHorizontalOffset;

/* renamed from: o.setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver */
public class setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver {
    final Bundle IconCompatParcelizer;
    public PendingIntent MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private final C1133x65c1ec57[] MediaBrowserCompat$SearchResultReceiver;
    private final int MediaDescriptionCompat;
    private final C1133x65c1ec57[] RatingCompat;
    public int read;
    public CharSequence write;

    public setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle(), (C1133x65c1ec57[]) null, (C1133x65c1ec57[]) null, true, 0, true);
    }

    setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1133x65c1ec57[] alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr, C1133x65c1ec57[] alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr2, boolean z, int i2, boolean z2) {
        this.MediaBrowserCompat$ItemReceiver = true;
        this.read = i;
        this.write = setDropDownHorizontalOffset.IconCompatParcelizer.write(charSequence);
        this.MediaBrowserCompat$CustomActionResultReceiver = pendingIntent;
        this.IconCompatParcelizer = bundle == null ? new Bundle() : bundle;
        this.RatingCompat = alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr;
        this.MediaBrowserCompat$SearchResultReceiver = alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr2;
        this.MediaBrowserCompat$MediaItem = z;
        this.MediaDescriptionCompat = i2;
        this.MediaBrowserCompat$ItemReceiver = z2;
    }

    public int write() {
        return this.read;
    }

    public CharSequence MediaMetadataCompat() {
        return this.write;
    }

    public PendingIntent MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public Bundle MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public boolean IconCompatParcelizer() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public C1133x65c1ec57[] RatingCompat() {
        return this.RatingCompat;
    }

    public int MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public C1133x65c1ec57[] read() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
