package p040o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p044v4.media.MediaMetadataCompat;
import android.support.p044v4.media.session.MediaSessionCompat;
import android.support.p044v4.media.session.ParcelableVolumeInfo;
import android.support.p044v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: o.MediaMetadataCompat$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$ItemReceiver */
class C6956x4ab2fe5e implements MediaMetadataCompat {
    private IBinder read;

    C6956x4ab2fe5e(IBinder iBinder) {
        this.read = iBinder;
    }

    public final IBinder asBinder() {
        return this.read;
    }

    public final void read(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.read.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void write() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            this.read.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            if (playbackStateCompat != null) {
                obtain.writeInt(1);
                playbackStateCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.read.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            if (mediaMetadataCompat != null) {
                obtain.writeInt(1);
                mediaMetadataCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.read.transact(4, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void read(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            obtain.writeTypedList(list);
            this.read.transact(5, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void read(CharSequence charSequence) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            if (charSequence != null) {
                obtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.read.transact(6, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void read(Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.read.transact(7, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            if (parcelableVolumeInfo != null) {
                obtain.writeInt(1);
                parcelableVolumeInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.read.transact(8, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void write(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            obtain.writeInt(i);
            this.read.transact(9, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void read(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            obtain.writeInt(z ? 1 : 0);
            this.read.transact(10, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            obtain.writeInt(z ? 1 : 0);
            this.read.transact(11, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            obtain.writeInt(i);
            this.read.transact(12, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaMetadataCompat");
            this.read.transact(13, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
