package com.google.android.gms.internal.firebase_ml;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzwi extends zzwh<FieldDescriptorType, Object> {
    zzwi(int i) {
        super(i, (zzwi) null);
    }

    public final void zzpt() {
        if (!isImmutable()) {
            for (int i = 0; i < zzsx(); i++) {
                Map.Entry zzdp = zzdp(i);
                if (((zzty) zzdp.getKey()).zzqt()) {
                    zzdp.setValue(Collections.unmodifiableList((List) zzdp.getValue()));
                }
            }
            for (Map.Entry entry : zzsy()) {
                if (((zzty) entry.getKey()).zzqt()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzpt();
    }
}
