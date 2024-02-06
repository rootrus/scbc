package android.support.p044v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.support.p044v4.media.MediaMetadataCompat;
import android.support.p044v4.media.session.MediaControllerCompat;
import android.support.p044v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.RatingCompat$MediaBrowserCompat$ItemReceiver;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$ItemReceiver */
class C5504xedc89d4b implements RatingCompat$MediaBrowserCompat$ItemReceiver {
    private final WeakReference<C5503xa3f85f2f> MediaBrowserCompat$CustomActionResultReceiver;

    C5504xedc89d4b(C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public void MediaBrowserCompat$ItemReceiver(String str, Bundle bundle) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return;
        }
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.write == null || Build.VERSION.SDK_INT >= 23) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(str, bundle);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Object obj) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null && mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.write == null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(PlaybackStateCompat.read(obj));
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(obj));
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(List<?> list) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.read(MediaSessionCompat.QueueItem.MediaBrowserCompat$ItemReceiver(list));
        }
    }

    public void write(CharSequence charSequence) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(charSequence);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Bundle bundle) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(bundle);
        }
    }

    public void IconCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
        C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new MediaControllerCompat.read(i, i2, i3, i4, i5));
        }
    }
}
