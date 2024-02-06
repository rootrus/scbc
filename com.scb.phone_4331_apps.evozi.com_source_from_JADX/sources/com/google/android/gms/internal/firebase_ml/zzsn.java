package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzso;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzsn<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzso<MessageType, BuilderType>> implements zzvo {
    private static boolean zzbkb = false;
    protected int zzbka = 0;

    public final zzsw zzpp() {
        try {
            zzte zzcn = zzsw.zzcn(zzqy());
            zzb(zzcn.zzqc());
            return zzcn.zzqb();
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

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzqy()];
            zztl zzg = zztl.zzg(bArr);
            zzb(zzg);
            zzg.zzqf();
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
    public int zzpq() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void zzch(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzug.checkNotNull(iterable);
        if (iterable instanceof zzux) {
            List<?> zzrv = ((zzux) iterable).zzrv();
            zzux zzux = (zzux) list;
            int size = list.size();
            for (Object next : zzrv) {
                if (next == null) {
                    int size2 = zzux.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = zzux.size() - 1; size3 >= size; size3--) {
                        zzux.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzsw) {
                    zzux.zzc((zzsw) next);
                } else {
                    zzux.add((String) next);
                }
            }
        } else if (iterable instanceof zzwa) {
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
