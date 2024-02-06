package android.support.p044v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p044v4.media.session.C5503xa3f85f2f;
import android.support.p044v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p040o.MediaBrowserCompat$MediaItem;
import p040o.MediaMetadataCompat;
import p040o.setAdapter;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$read */
    public static final class read {
        private final int IconCompatParcelizer;
        private final int MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;
        private final int read;
        private final int write;

        read(int i, int i2, int i3, int i4, int i5) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.write = i2;
            this.MediaBrowserCompat$CustomActionResultReceiver = i3;
            this.read = i4;
            this.IconCompatParcelizer = i5;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 {
        private final List<C5503xa3f85f2f> IconCompatParcelizer;
        final MediaSessionCompat.Token MediaBrowserCompat$CustomActionResultReceiver;
        final Object MediaBrowserCompat$ItemReceiver;
        private HashMap<C5503xa3f85f2f, read> read;

        /* access modifiers changed from: package-private */
        public void read() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.read() != null) {
                for (C5503xa3f85f2f next : this.IconCompatParcelizer) {
                    read read2 = new read(next);
                    this.read.put(next, read2);
                    next.write = read2;
                    try {
                        this.MediaBrowserCompat$CustomActionResultReceiver.read().write((MediaMetadataCompat) read2);
                        next.MediaBrowserCompat$ItemReceiver(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.IconCompatParcelizer.clear();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> MediaBrowserCompat$CustomActionResultReceiver;

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.MediaBrowserCompat$ItemReceiver) {
                        mediaControllerImplApi21.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setAdapter.MediaBrowserCompat$CustomActionResultReceiver(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.read();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$read */
        static class read extends C5503xa3f85f2f.write {
            read(C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver) {
                super(mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver);
            }

            public void write() throws RemoteException {
                throw new AssertionError();
            }

            public void IconCompatParcelizer(android.support.p044v4.media.MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void read(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            public void read(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            public void read(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }
    }
}
