package p040o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.MediaSessionCompat$QueueItem */
public interface MediaSessionCompat$QueueItem extends IInterface {
    void MediaBrowserCompat$ItemReceiver(int i, Bundle bundle) throws RemoteException;

    /* renamed from: o.MediaSessionCompat$QueueItem$write */
    public static abstract class write extends Binder implements MediaSessionCompat$QueueItem {
        public IBinder asBinder() {
            return this;
        }

        public write() {
            attachInterface(this, "o.MediaSessionCompat$QueueItem");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("o.MediaSessionCompat$QueueItem");
                MediaBrowserCompat$ItemReceiver(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("o.MediaSessionCompat$QueueItem");
                return true;
            }
        }
    }
}
