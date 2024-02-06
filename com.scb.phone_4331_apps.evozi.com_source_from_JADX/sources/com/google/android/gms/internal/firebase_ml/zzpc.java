package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzpc {
    private final int type;
    private final int[] zzasy;

    public zzpc(int i, int[] iArr) {
        Preconditions.checkNotNull(iArr, "Data dimensions should not be null.");
        Preconditions.checkArgument(iArr.length > 0, "Data dimensions can not be empty");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Preconditions.checkArgument(iArr[i2] > 0, "Each dimension must be a positive integer");
        }
        this.type = i;
        this.zzasy = Arrays.copyOf(iArr, iArr.length);
    }

    public final int getType() {
        return this.type;
    }

    public final int[] zzms() {
        return this.zzasy;
    }

    /* access modifiers changed from: package-private */
    public final int zzmt() throws FirebaseMLException {
        int i = this.type;
        int i2 = 4;
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                i2 = 1;
            } else if (i == 4) {
                i2 = 8;
            } else {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Not supported data type: ");
                sb.append(i);
                throw new FirebaseMLException(sb.toString(), 3);
            }
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.zzasy;
            if (i3 >= iArr.length) {
                return i2;
            }
            i2 *= iArr[i3];
            i3++;
        }
    }

    public final zzmd.zzm.zzb zzmu() {
        zzmd.zzm.zzb.C10801zzb zzb;
        ArrayList arrayList = new ArrayList();
        for (int valueOf : this.zzasy) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        zzmd.zzm.zzb.zza zzjm = zzmd.zzm.zzb.zzjm();
        int i = this.type;
        if (i == 1) {
            zzb = zzmd.zzm.zzb.C10801zzb.TYPE_FLOAT32;
        } else if (i == 2) {
            zzb = zzmd.zzm.zzb.C10801zzb.TYPE_INT32;
        } else if (i == 3) {
            zzb = zzmd.zzm.zzb.C10801zzb.TYPE_BYTE;
        } else if (i != 4) {
            zzb = zzmd.zzm.zzb.C10801zzb.UNKNOWN_DATA_TYPE;
        } else {
            zzb = zzmd.zzm.zzb.C10801zzb.TYPE_LONG;
        }
        return (zzmd.zzm.zzb) ((zzue) zzjm.zzb(zzb).zzf(arrayList).zzrj());
    }
}
