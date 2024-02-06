package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public class ImageLabelerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImageLabelerOptions> CREATOR = new zzg();
    private int zzef;
    public int zzeg;
    public float zzeh;
    public int zzei;

    public static int zza(String str) {
        str.equals(Locale.ENGLISH.getLanguage());
        return 1;
    }

    public ImageLabelerOptions(int i, int i2, float f, int i3) {
        if (i == 1) {
            this.zzef = i;
            this.zzeg = i2;
            this.zzeh = f;
            this.zzei = i3;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzef);
        SafeParcelWriter.writeInt(parcel, 3, this.zzeg);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzeh);
        SafeParcelWriter.writeInt(parcel, 5, this.zzei);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
