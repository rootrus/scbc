package com.google.android.gms.internal.firebase_ml;

import java.util.Map;
import p040o.QuickAccountSelectAdapter$HeaderHolder;

final class zzpj {
    private final QuickAccountSelectAdapter$HeaderHolder zzatk;

    zzpj(QuickAccountSelectAdapter$HeaderHolder quickAccountSelectAdapter$HeaderHolder) {
        this.zzatk = quickAccountSelectAdapter$HeaderHolder;
    }

    /* access modifiers changed from: package-private */
    public final void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map) {
        this.zzatk.IconCompatParcelizer(objArr, map);
    }

    /* access modifiers changed from: package-private */
    public final int getInputIndex(String str) {
        return this.zzatk.read(str);
    }

    /* access modifiers changed from: package-private */
    public final int getOutputIndex(String str) {
        return this.zzatk.IconCompatParcelizer(str);
    }

    /* access modifiers changed from: package-private */
    public final void resizeInput(int i, int[] iArr) {
        this.zzatk.write(i, iArr);
    }

    /* access modifiers changed from: package-private */
    public final void setUseNNAPI(boolean z) {
        this.zzatk.MediaBrowserCompat$CustomActionResultReceiver(z);
    }

    /* access modifiers changed from: package-private */
    public final void close() {
        this.zzatk.close();
    }
}
