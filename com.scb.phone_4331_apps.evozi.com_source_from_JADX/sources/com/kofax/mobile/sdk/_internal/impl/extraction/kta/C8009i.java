package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import android.text.TextUtils;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import java.util.Arrays;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.i */
public class C8009i implements C7996b {

    /* renamed from: KD */
    private final C7996b[] f3807KD;

    public C8009i(C7996b... bVarArr) {
        this.f3807KD = (C7996b[]) Arrays.copyOf(bVarArr, bVarArr.length);
    }

    /* renamed from: mz */
    public String mo54387mz() throws C7899a {
        for (C7996b mz : this.f3807KD) {
            String mz2 = mz.mo54387mz();
            if (!TextUtils.isEmpty(mz2)) {
                return mz2;
            }
        }
        return null;
    }
}
