package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzf extends zza implements zzd {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle zza(Bundle bundle) throws RemoteException {
        Parcel a_ = mo5109a_();
        zzb.zza(a_, (Parcelable) bundle);
        Parcel zza = zza(1, a_);
        Bundle bundle2 = (Bundle) zzb.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle2;
    }
}
