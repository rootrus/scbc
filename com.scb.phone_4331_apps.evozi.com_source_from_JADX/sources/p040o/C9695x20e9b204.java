package p040o;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: o.CloseAccountSelectMainAccountActivity$read$MediaBrowserCompat$ItemReceiver */
class C9695x20e9b204 implements CloseAccountSelectMainAccountActivity {
    private IBinder MediaBrowserCompat$CustomActionResultReceiver;

    C9695x20e9b204(IBinder iBinder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iBinder;
    }

    public final String IconCompatParcelizer() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void IconCompatParcelizer(float f) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeFloat(f);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(10, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ParcelFileDescriptor MediaBrowserCompat$CustomActionResultReceiver(int i, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeInt(i);
            if (chequeAnnouncementActivity_ViewBinding != null) {
                obtain.writeInt(1);
                chequeAnnouncementActivity_ViewBinding.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ParcelFileDescriptor parcelFileDescriptor, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (chequeAnnouncementActivity_ViewBinding != null) {
                obtain.writeInt(1);
                chequeAnnouncementActivity_ViewBinding.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int MediaBrowserCompat$ItemReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Bitmap MediaBrowserCompat$SearchResultReceiver() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ParcelFileDescriptor RatingCompat() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int read(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeInt(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void read(int i, byte[] bArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeInt(i);
            obtain.writeByteArray(bArr);
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean write() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            boolean z = false;
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(9, obtain, obtain2, 0);
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

    public final byte[] write(int i, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("io.beid.beidk.services.IBitmapProcessingService");
            obtain.writeInt(i);
            if (chequeAnnouncementActivity_ViewBinding != null) {
                obtain.writeInt(1);
                chequeAnnouncementActivity_ViewBinding.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
