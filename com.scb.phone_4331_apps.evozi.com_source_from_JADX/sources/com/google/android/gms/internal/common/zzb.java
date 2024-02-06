package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzb implements IInterface {
    private final IBinder zzb;
    private final String zzc;

    public zzb(IBinder iBinder, String str) {
        this.zzb = iBinder;
        this.zzc = str;
    }

    public IBinder asBinder() {
        return this.zzb;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzc);
        return obtain;
    }

    public final Parcel zza(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.zzb.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzb.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zzc(int i, Parcel parcel) throws RemoteException {
        try {
            this.zzb.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
