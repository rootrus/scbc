package android.support.p044v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.p044v4.media.session.MediaControllerCompat;
import android.support.p044v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.C6955xfad3cc42;
import p040o.MediaMetadataCompat;
import p040o.RatingCompat;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class C5503xa3f85f2f implements IBinder.DeathRecipient {
    final Object MediaBrowserCompat$CustomActionResultReceiver;
    IconCompatParcelizer read;
    MediaMetadataCompat write;

    public void IconCompatParcelizer() {
    }

    public void IconCompatParcelizer(int i) {
    }

    public void IconCompatParcelizer(MediaControllerCompat.read read2) {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(android.support.p044v4.media.MediaMetadataCompat mediaMetadataCompat) {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle) {
    }

    public void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
    }

    public void MediaBrowserCompat$ItemReceiver(PlaybackStateCompat playbackStateCompat) {
    }

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
    }

    public void read(int i) {
    }

    public void read(List<MediaSessionCompat.QueueItem> list) {
    }

    public C5503xa3f85f2f() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.MediaBrowserCompat$CustomActionResultReceiver = RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(new C5504xedc89d4b(this));
            return;
        }
        write write2 = new write(this);
        this.write = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(int i, Object obj, Bundle bundle) {
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            Message obtainMessage = iconCompatParcelizer.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver$write */
    static class write extends C6955xfad3cc42 {
        private final WeakReference<C5503xa3f85f2f> read;

        public void read(boolean z) throws RemoteException {
        }

        write(C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver) {
            this.read = new WeakReference<>(mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver);
        }

        public void read(String str, Bundle bundle) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(1, str, bundle);
            }
        }

        public void write() throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(8, (Object) null, (Bundle) null);
            }
        }

        public void MediaBrowserCompat$ItemReceiver(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void IconCompatParcelizer(android.support.p044v4.media.MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        public void read(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(5, list, (Bundle) null);
            }
        }

        public void read(CharSequence charSequence) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(6, charSequence, (Bundle) null);
            }
        }

        public void IconCompatParcelizer(boolean z) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        public void write(int i) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        public void MediaBrowserCompat$ItemReceiver(int i) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        public void read(Bundle bundle) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(7, bundle, (Bundle) null);
            }
        }

        public void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(4, parcelableVolumeInfo != null ? new MediaControllerCompat.read(parcelableVolumeInfo.IconCompatParcelizer, parcelableVolumeInfo.write, parcelableVolumeInfo.MediaBrowserCompat$ItemReceiver, parcelableVolumeInfo.read, parcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver) : null, (Bundle) null);
            }
        }

        public void MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException {
            C5503xa3f85f2f mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            if (mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver != null) {
                mediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(13, (Object) null, (Bundle) null);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    class IconCompatParcelizer extends Handler {
        boolean IconCompatParcelizer;
        final /* synthetic */ C5503xa3f85f2f write;

        public void handleMessage(Message message) {
            if (this.IconCompatParcelizer) {
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        MediaSessionCompat.write(data);
                        this.write.MediaBrowserCompat$CustomActionResultReceiver((String) message.obj, data);
                        return;
                    case 2:
                        this.write.MediaBrowserCompat$ItemReceiver((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        this.write.MediaBrowserCompat$CustomActionResultReceiver((android.support.p044v4.media.MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        this.write.IconCompatParcelizer((MediaControllerCompat.read) message.obj);
                        return;
                    case 5:
                        this.write.read((List<MediaSessionCompat.QueueItem>) (List) message.obj);
                        return;
                    case 6:
                        this.write.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) message.obj);
                        return;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        MediaSessionCompat.write(bundle);
                        this.write.MediaBrowserCompat$ItemReceiver(bundle);
                        return;
                    case 8:
                        this.write.MediaBrowserCompat$CustomActionResultReceiver();
                        return;
                    case 9:
                        this.write.IconCompatParcelizer(((Integer) message.obj).intValue());
                        return;
                    case 11:
                        this.write.MediaBrowserCompat$ItemReceiver(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        this.write.read(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        this.write.IconCompatParcelizer();
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
