package android.support.p044v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.MediaDescriptionCompat$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5500xa11c9247 {
    private CharSequence IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private Bundle MediaBrowserCompat$ItemReceiver;
    private CharSequence MediaBrowserCompat$SearchResultReceiver;
    private Uri MediaMetadataCompat;
    private CharSequence RatingCompat;
    private Uri read;
    private Bitmap write;

    public final C5500xa11c9247 write(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        return this;
    }

    public final C5500xa11c9247 MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        this.RatingCompat = charSequence;
        return this;
    }

    public final C5500xa11c9247 IconCompatParcelizer(CharSequence charSequence) {
        this.MediaBrowserCompat$SearchResultReceiver = charSequence;
        return this;
    }

    public final C5500xa11c9247 read(CharSequence charSequence) {
        this.IconCompatParcelizer = charSequence;
        return this;
    }

    public final C5500xa11c9247 read(Bitmap bitmap) {
        this.write = bitmap;
        return this;
    }

    public final C5500xa11c9247 MediaBrowserCompat$CustomActionResultReceiver(Uri uri) {
        this.read = uri;
        return this;
    }

    public final C5500xa11c9247 MediaBrowserCompat$CustomActionResultReceiver(Bundle bundle) {
        this.MediaBrowserCompat$ItemReceiver = bundle;
        return this;
    }

    public final C5500xa11c9247 read(Uri uri) {
        this.MediaMetadataCompat = uri;
        return this;
    }

    public final MediaDescriptionCompat read() {
        return new MediaDescriptionCompat(this.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat, this.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer, this.write, this.read, this.MediaBrowserCompat$ItemReceiver, this.MediaMetadataCompat);
    }
}
