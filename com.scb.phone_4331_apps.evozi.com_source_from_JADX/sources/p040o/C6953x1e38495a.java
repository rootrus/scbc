package p040o;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p044v4.media.MediaDescriptionCompat;
import android.support.p044v4.media.MediaMetadataCompat;
import android.support.p044v4.media.RatingCompat;
import android.support.p044v4.media.session.MediaSessionCompat;
import android.support.p044v4.media.session.ParcelableVolumeInfo;
import android.support.p044v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: o.MediaBrowserCompat$MediaItem$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
class C6953x1e38495a implements MediaBrowserCompat$MediaItem {
    private IBinder MediaBrowserCompat$CustomActionResultReceiver;

    C6953x1e38495a(IBinder iBinder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iBinder;
    }

    public final IBinder asBinder() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (resultReceiverWrapper != null) {
                obtain.writeInt(1);
                resultReceiverWrapper.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(KeyEvent keyEvent) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            boolean z = true;
            if (keyEvent != null) {
                obtain.writeInt(1);
                keyEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void write(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeStrongBinder(mediaMetadataCompat != null ? mediaMetadataCompat.asBinder() : null);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeStrongBinder(mediaMetadataCompat != null ? mediaMetadataCompat.asBinder() : null);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean AlertController$RecycleListView() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            boolean z = false;
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String MediaBrowserCompat$MediaItem() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String ParcelableVolumeInfo() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final PendingIntent write() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ParcelableVolumeInfo MediaSessionCompat$QueueItem() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(int i, int i2, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(int i, int i2, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final MediaMetadataCompat IconCompatParcelizer() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(27, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final PlaybackStateCompat MediaMetadataCompat() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final List<MediaSessionCompat.QueueItem> RatingCompat() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(29, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final CharSequence MediaDescriptionCompat() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(30, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Bundle MediaBrowserCompat$ItemReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(31, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int MediaBrowserCompat$SearchResultReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(32, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean MediaSessionCompat$Token() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            boolean z = false;
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(45, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo42800x50fd9e4a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(37, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean PlaybackStateCompat() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            boolean z = false;
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(38, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int MediaSessionCompat$ResultReceiverWrapper() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(47, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (mediaDescriptionCompat != null) {
                obtain.writeInt(1);
                mediaDescriptionCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (mediaDescriptionCompat != null) {
                obtain.writeInt(1);
                mediaDescriptionCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (mediaDescriptionCompat != null) {
                obtain.writeInt(1);
                mediaDescriptionCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(43, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(44, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void setBackgroundResource() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(34, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Uri uri, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void setHasDecor() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void write(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(Uri uri, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void write(long j) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeLong(j);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void PlaybackStateCompat$CustomAction() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void Keep() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void setContentView() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void AppCompatActivity() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(long j) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeLong(j);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(RatingCompat ratingCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (ratingCompat != null) {
                obtain.writeInt(1);
                ratingCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void write(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            if (ratingCompat != null) {
                obtain.writeInt(1);
                ratingCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(51, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(z ? 1 : 0);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(z ? 1 : 0);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(48, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$MediaItem");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
