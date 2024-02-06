package p040o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.nScriptFieldIDCreate */
public class nScriptFieldIDCreate extends Binder implements IInterface {
    protected nScriptFieldIDCreate(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean IconCompatParcelizer(int i, Parcel parcel) throws RemoteException {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return IconCompatParcelizer(i, parcel);
    }
}
