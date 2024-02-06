package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzso;

public abstract class zzso<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzso<MessageType, BuilderType>> implements zzvp {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    /* renamed from: zzpr */
    public abstract BuilderType clone();

    public final /* synthetic */ zzvp zza(zzvo zzvo) {
        if (zzre().getClass().isInstance(zzvo)) {
            return zza((zzsn) zzvo);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
