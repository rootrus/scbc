package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public abstract class zzgf {
    public abstract void flush() throws IOException;

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeString(String str) throws IOException;

    public abstract void zza(double d) throws IOException;

    public abstract void zza(BigDecimal bigDecimal) throws IOException;

    public abstract void zza(BigInteger bigInteger) throws IOException;

    public abstract void zzad(int i) throws IOException;

    public abstract void zzan(String str) throws IOException;

    public abstract void zzfy() throws IOException;

    public abstract void zzfz() throws IOException;

    public abstract void zzg(long j) throws IOException;

    public abstract void zzga() throws IOException;

    public abstract void zzgb() throws IOException;

    public abstract void zzgc() throws IOException;

    public void zzgd() throws IOException {
    }

    public abstract void zzl(float f) throws IOException;

    public final void zzd(Object obj) throws IOException {
        zza(false, obj);
    }

    private final void zza(boolean z, Object obj) throws IOException {
        zzhd zzhd;
        boolean z2;
        Field field;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (zzhf.isNull(obj)) {
                zzgc();
            } else if (obj instanceof String) {
                writeString((String) obj);
            } else {
                boolean z3 = false;
                if (obj instanceof Number) {
                    if (z) {
                        writeString(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        zza((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        zza((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        zzg(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue)) {
                            z3 = true;
                        }
                        zzks.checkArgument(z3);
                        zzl(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        zzad(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
                            z3 = true;
                        }
                        zzks.checkArgument(z3);
                        zza(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    writeBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof zzhk) {
                    writeString(((zzhk) obj).zzhe());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    zzfy();
                    for (Object zza : zzia.zzi(obj)) {
                        zza(z, zza);
                    }
                    zzfz();
                } else if (cls.isEnum()) {
                    String name = zzhl.zza((Enum<?>) (Enum) obj).getName();
                    if (name == null) {
                        zzgc();
                    } else {
                        writeString(name);
                    }
                } else {
                    zzga();
                    boolean z4 = (obj instanceof Map) && !(obj instanceof zzhm);
                    if (z4) {
                        zzhd = null;
                    } else {
                        zzhd = zzhd.zzc(cls);
                    }
                    for (Map.Entry next : zzhf.zzf(obj).entrySet()) {
                        Object value = next.getValue();
                        if (value != null) {
                            String str = (String) next.getKey();
                            if (z4) {
                                z2 = z;
                            } else {
                                zzhl zzao = zzhd.zzao(str);
                                if (zzao == null) {
                                    field = null;
                                } else {
                                    field = zzao.zzhf();
                                }
                                z2 = (field == null || field.getAnnotation(zzgl.class) == null) ? false : true;
                            }
                            zzan(str);
                            zza(z2, value);
                        }
                    }
                    zzgb();
                }
            }
        }
    }
}
