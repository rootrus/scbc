package p040o;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: o.MediaBrowserCompat$ItemReceiver$write$MediaBrowserCompat$ItemReceiver */
public class C1237xfb448b17 implements MediaBrowserCompat$ItemReceiver {
    private IBinder MediaBrowserCompat$ItemReceiver;

    public C1237xfb448b17(IBinder iBinder) {
        this.MediaBrowserCompat$ItemReceiver = iBinder;
    }

    public final IBinder asBinder() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean IconCompatParcelizer(long j) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeLong(j);
            boolean z = false;
            this.MediaBrowserCompat$ItemReceiver.transact(2, obtain, obtain2, 0);
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

    public final boolean MediaBrowserCompat$ItemReceiver(write write) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeStrongBinder(write != null ? write.asBinder() : null);
            boolean z = false;
            this.MediaBrowserCompat$ItemReceiver.transact(3, obtain, obtain2, 0);
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

    public final boolean read(write write, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeStrongBinder(write != null ? write.asBinder() : null);
            boolean z = true;
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
            obtain.writeTypedList(list);
            this.MediaBrowserCompat$ItemReceiver.transact(4, obtain, obtain2, 0);
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

    public final Bundle MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$ItemReceiver.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean IconCompatParcelizer(write write, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeStrongBinder(write != null ? write.asBinder() : null);
            boolean z = true;
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$ItemReceiver.transact(6, obtain, obtain2, 0);
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

    public final boolean IconCompatParcelizer(write write, Uri uri) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeStrongBinder(write != null ? write.asBinder() : null);
            boolean z = true;
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$ItemReceiver.transact(7, obtain, obtain2, 0);
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

    public final int write(write write, String str, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeStrongBinder(write != null ? write.asBinder() : null);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$ItemReceiver.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean read(write write, int i, Uri uri, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaBrowserCompat$ItemReceiver");
            obtain.writeStrongBinder(write != null ? write.asBinder() : null);
            obtain.writeInt(i);
            boolean z = true;
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
            this.MediaBrowserCompat$ItemReceiver.transact(9, obtain, obtain2, 0);
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
}
