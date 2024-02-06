package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.internal.measurement.zzdw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzdw<MessageType extends zzdw<MessageType, BuilderType>, BuilderType extends zzdv<MessageType, BuilderType>> implements zzgw {
    protected int zza = 0;

    public final zzeg zzbh() {
        try {
            zzeo zzc = zzeg.zzc(zzbm());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzbi() {
        try {
            byte[] bArr = new byte[zzbm()];
            zzev zza2 = zzev.zza(bArr);
            zza(zza2);
            zza2.zzb();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int zzbj() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void zzc(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzfr.zza(iterable);
        if (iterable instanceof zzgh) {
            List<?> zzd = ((zzgh) iterable).zzd();
            zzgh zzgh = (zzgh) list;
            int size = list.size();
            for (Object next : zzd) {
                if (next == null) {
                    int size2 = zzgh.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = zzgh.size() - 1; size3 >= size; size3--) {
                        zzgh.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzeg) {
                    zzgh.zza((zzeg) next);
                } else {
                    zzgh.add((String) next);
                }
            }
        } else if (iterable instanceof zzhi) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
