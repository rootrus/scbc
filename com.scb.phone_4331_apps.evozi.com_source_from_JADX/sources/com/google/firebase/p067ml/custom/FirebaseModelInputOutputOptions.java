package com.google.firebase.p067ml.custom;

import android.util.SparseArray;
import com.google.android.gms.internal.firebase_ml.zzpc;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.custom.FirebaseModelInputOutputOptions */
public final class FirebaseModelInputOutputOptions {
    private final SparseArray<zzpc> zzasi;
    private final SparseArray<zzpc> zzasj;

    public final SparseArray<zzpc> zzml() {
        return this.zzasi;
    }

    public final SparseArray<zzpc> zzmm() {
        return this.zzasj;
    }

    public final Map<Integer, Object> zzmn() throws FirebaseMLException {
        Class cls;
        int size = this.zzasj.size();
        HashMap hashMap = new HashMap(size);
        for (int i = 0; i < size; i++) {
            int keyAt = this.zzasj.keyAt(i);
            int type = this.zzasj.get(keyAt).getType();
            if (type == 1) {
                cls = Float.TYPE;
            } else if (type == 2) {
                cls = Integer.TYPE;
            } else if (type == 3) {
                cls = Byte.TYPE;
            } else if (type == 4) {
                cls = Long.TYPE;
            } else {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Not supported data type: ");
                sb.append(type);
                throw new FirebaseMLException(sb.toString(), 3);
            }
            hashMap.put(Integer.valueOf(keyAt), Array.newInstance(cls, this.zzasj.get(keyAt).zzms()));
        }
        return hashMap;
    }
}
