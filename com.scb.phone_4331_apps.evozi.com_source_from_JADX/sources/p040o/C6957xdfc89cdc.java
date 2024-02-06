package p040o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.MediaSessionCompat$QueueItem$write$MediaBrowserCompat$CustomActionResultReceiver */
class C6957xdfc89cdc implements MediaSessionCompat$QueueItem {
    private IBinder MediaBrowserCompat$CustomActionResultReceiver;

    C6957xdfc89cdc(IBinder iBinder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iBinder;
    }

    public final IBinder asBinder() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("o.MediaSessionCompat$QueueItem");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
