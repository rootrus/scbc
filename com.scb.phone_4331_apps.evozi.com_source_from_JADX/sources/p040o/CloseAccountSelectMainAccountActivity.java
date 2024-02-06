package p040o;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: o.CloseAccountSelectMainAccountActivity */
public interface CloseAccountSelectMainAccountActivity extends IInterface {

    /* renamed from: o.CloseAccountSelectMainAccountActivity$read */
    public static abstract class read extends Binder implements CloseAccountSelectMainAccountActivity {
        public read() {
            attachInterface(this, "io.beid.beidk.services.IBitmapProcessingService");
        }

        public static CloseAccountSelectMainAccountActivity write(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("io.beid.beidk.services.IBitmapProcessingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof CloseAccountSelectMainAccountActivity)) ? new C9695x20e9b204(iBinder) : (CloseAccountSelectMainAccountActivity) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
                        parcel2.writeNoException();
                        parcel2.writeInt(MediaBrowserCompat$ItemReceiver);
                        return true;
                    case 2:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        int read = read(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(read);
                        return true;
                    case 3:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        read(parcel.readInt(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        IconCompatParcelizer(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            chequeAnnouncementActivity_ViewBinding = ChequeAnnouncementActivity_ViewBinding.CREATOR.createFromParcel(parcel);
                        }
                        byte[] write = write(readInt, chequeAnnouncementActivity_ViewBinding);
                        parcel2.writeNoException();
                        parcel2.writeByteArray(write);
                        return true;
                    case 6:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            chequeAnnouncementActivity_ViewBinding = ChequeAnnouncementActivity_ViewBinding.CREATOR.createFromParcel(parcel);
                        }
                        ParcelFileDescriptor MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(readInt2, chequeAnnouncementActivity_ViewBinding);
                        parcel2.writeNoException();
                        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                            parcel2.writeInt(1);
                            MediaBrowserCompat$CustomActionResultReceiver.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        ParcelFileDescriptor parcelFileDescriptor = parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            chequeAnnouncementActivity_ViewBinding = ChequeAnnouncementActivity_ViewBinding.CREATOR.createFromParcel(parcel);
                        }
                        MediaBrowserCompat$CustomActionResultReceiver(parcelFileDescriptor, chequeAnnouncementActivity_ViewBinding);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        MediaBrowserCompat$CustomActionResultReceiver(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        boolean write2 = write();
                        parcel2.writeNoException();
                        parcel2.writeInt(write2 ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        IconCompatParcelizer(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        byte[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                        parcel2.writeNoException();
                        parcel2.writeByteArray(MediaBrowserCompat$CustomActionResultReceiver2);
                        return true;
                    case 12:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        String IconCompatParcelizer = IconCompatParcelizer();
                        parcel2.writeNoException();
                        parcel2.writeString(IconCompatParcelizer);
                        return true;
                    case 13:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        read();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        ParcelFileDescriptor RatingCompat = RatingCompat();
                        parcel2.writeNoException();
                        if (RatingCompat != null) {
                            parcel2.writeInt(1);
                            RatingCompat.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 15:
                        parcel.enforceInterface("io.beid.beidk.services.IBitmapProcessingService");
                        Bitmap MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver();
                        parcel2.writeNoException();
                        if (MediaBrowserCompat$SearchResultReceiver != null) {
                            parcel2.writeInt(1);
                            MediaBrowserCompat$SearchResultReceiver.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("io.beid.beidk.services.IBitmapProcessingService");
                return true;
            }
        }
    }

    String IconCompatParcelizer() throws RemoteException;

    void IconCompatParcelizer(float f) throws RemoteException;

    void IconCompatParcelizer(int i) throws RemoteException;

    ParcelFileDescriptor MediaBrowserCompat$CustomActionResultReceiver(int i, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(int i) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(ParcelFileDescriptor parcelFileDescriptor, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException;

    byte[] MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException;

    int MediaBrowserCompat$ItemReceiver() throws RemoteException;

    Bitmap MediaBrowserCompat$SearchResultReceiver() throws RemoteException;

    ParcelFileDescriptor RatingCompat() throws RemoteException;

    int read(int i) throws RemoteException;

    void read() throws RemoteException;

    void read(int i, byte[] bArr) throws RemoteException;

    boolean write() throws RemoteException;

    byte[] write(int i, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException;
}
