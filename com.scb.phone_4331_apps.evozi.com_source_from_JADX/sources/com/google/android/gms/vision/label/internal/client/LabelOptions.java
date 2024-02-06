package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class LabelOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelOptions> CREATOR = new zzh();
    @Deprecated
    public final int zzej;

    public LabelOptions(int i) {
        this.zzej = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzej);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
