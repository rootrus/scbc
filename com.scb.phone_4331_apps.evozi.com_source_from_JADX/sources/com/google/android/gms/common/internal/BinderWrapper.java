package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zzb();
    private IBinder zzdl;

    public BinderWrapper() {
        this.zzdl = null;
    }

    public final int describeContents() {
        return 0;
    }

    public BinderWrapper(IBinder iBinder) {
        this.zzdl = null;
        this.zzdl = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.zzdl = null;
        this.zzdl = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzdl);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, zzb zzb) {
        this(parcel);
    }
}
