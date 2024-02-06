package p040o;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.read */
public interface read extends IInterface {
    void IconCompatParcelizer(String str, int i, String str2, Notification notification) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(String str) throws RemoteException;

    void write(String str, int i, String str2) throws RemoteException;

    /* renamed from: o.read$write */
    public static abstract class write extends Binder implements read {
        public write() {
            attachInterface(this, "o.read");
        }

        public static read read(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("o.read");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof read)) {
                return new C10792read(iBinder);
            }
            return (read) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("o.read");
                IconCompatParcelizer(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("o.read");
                write(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("o.read");
                MediaBrowserCompat$CustomActionResultReceiver(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("o.read");
                return true;
            }
        }

        /* renamed from: o.read$write$read  reason: collision with other inner class name */
        static class C10792read implements read {
            private IBinder IconCompatParcelizer;

            C10792read(IBinder iBinder) {
                this.IconCompatParcelizer = iBinder;
            }

            public final IBinder asBinder() {
                return this.IconCompatParcelizer;
            }

            public final void IconCompatParcelizer(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("o.read");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.IconCompatParcelizer.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void write(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("o.read");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.IconCompatParcelizer.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("o.read");
                    obtain.writeString(str);
                    this.IconCompatParcelizer.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
