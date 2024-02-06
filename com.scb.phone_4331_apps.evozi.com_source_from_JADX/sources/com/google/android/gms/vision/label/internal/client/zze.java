package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    public final String label;
    public final String zzdn;
    public final float zzdo;

    public zze(String str, String str2, float f) {
        this.label = str2;
        this.zzdo = f;
        this.zzdn = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.label, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzdo);
        SafeParcelWriter.writeString(parcel, 4, this.zzdn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
