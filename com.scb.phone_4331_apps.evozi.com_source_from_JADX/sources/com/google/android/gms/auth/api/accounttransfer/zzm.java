package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcelable;

public final class zzm implements Parcelable.Creator<zzl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
            r6 = r4
            r3 = r5
        L_0x000f:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0064
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r7 == r8) goto L_0x0058
            r8 = 2
            if (r7 == r8) goto L_0x004a
            r8 = 3
            if (r7 == r8) goto L_0x003e
            r8 = 4
            if (r7 == r8) goto L_0x002d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto L_0x000f
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzo> r6 = com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r6)
            r6 = r1
            com.google.android.gms.auth.api.accounttransfer.zzo r6 = (com.google.android.gms.auth.api.accounttransfer.zzo) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000f
        L_0x003e:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000f
        L_0x004a:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzr> r4 = com.google.android.gms.auth.api.accounttransfer.zzr.CREATOR
            java.util.ArrayList r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r10, r1, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000f
        L_0x0058:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000f
        L_0x0064:
            int r1 = r10.dataPosition()
            if (r1 != r0) goto L_0x0071
            com.google.android.gms.auth.api.accounttransfer.zzl r10 = new com.google.android.gms.auth.api.accounttransfer.zzl
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L_0x0071:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "Overread allowed size end="
            r1.append(r2)
            r1.append(r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r0 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.zzm.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
