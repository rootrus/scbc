package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.internal.measurement.zzdw;
import java.io.IOException;

public abstract class zzdv<MessageType extends zzdw<MessageType, BuilderType>, BuilderType extends zzdv<MessageType, BuilderType>> implements zzgz {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzes zzes, zzfb zzfb) throws IOException;

    /* renamed from: zzp */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzfw {
        try {
            zzes zza = zzes.zza(bArr, 0, i2, false);
            zza(zza, zzfb.zza());
            zza.zza(0);
            return this;
        } catch (zzfw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzfb zzfb) throws zzfw {
        try {
            zzes zza = zzes.zza(bArr, 0, i2, false);
            zza(zza, zzfb);
            zza.zza(0);
            return this;
        } catch (zzfw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    private final String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public final /* synthetic */ zzgz zza(zzgw zzgw) {
        if (mo5788h_().getClass().isInstance(zzgw)) {
            return zza((zzdw) zzgw);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* synthetic */ zzgz zza(byte[] bArr, zzfb zzfb) throws zzfw {
        return zza(bArr, 0, bArr.length, zzfb);
    }

    public final /* synthetic */ zzgz zza(byte[] bArr) throws zzfw {
        return zza(bArr, 0, bArr.length);
    }
}
