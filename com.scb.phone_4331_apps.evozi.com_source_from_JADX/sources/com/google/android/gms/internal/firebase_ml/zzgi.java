package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzgk;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class zzgi {
    private static WeakHashMap<Class<?>, Field> zzwj = new WeakHashMap<>();
    private static final Lock zzwk = new ReentrantLock();

    public abstract void close() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract String getText() throws IOException;

    public abstract zzge zzgg();

    public abstract zzgm zzgh() throws IOException;

    public abstract zzgm zzgi();

    public abstract String zzgj() throws IOException;

    public abstract zzgi zzgk() throws IOException;

    public abstract byte zzgl() throws IOException;

    public abstract short zzgm() throws IOException;

    public abstract float zzgn() throws IOException;

    public abstract long zzgo() throws IOException;

    public abstract double zzgp() throws IOException;

    public abstract BigInteger zzgq() throws IOException;

    public abstract BigDecimal zzgr() throws IOException;

    public final <T> T zza(Class<T> cls, zzgc zzgc) throws IOException {
        try {
            return zza(cls, false, (zzgc) null);
        } finally {
            close();
        }
    }

    public final String zza(Set<String> set) throws IOException {
        zzgm zzgt = zzgt();
        while (zzgt == zzgm.FIELD_NAME) {
            String text = getText();
            zzgh();
            if (set.contains(text)) {
                return text;
            }
            zzgk();
            zzgt = zzgh();
        }
        return null;
    }

    private final zzgm zzgs() throws IOException {
        zzgm zzgi = zzgi();
        if (zzgi == null) {
            zzgi = zzgh();
        }
        zzks.checkArgument(zzgi != null, "no JSON input found");
        return zzgi;
    }

    private final zzgm zzgt() throws IOException {
        zzgm zzgs = zzgs();
        int i = zzgj.zzwl[zzgs.ordinal()];
        boolean z = true;
        if (i == 1) {
            zzgm zzgh = zzgh();
            if (!(zzgh == zzgm.FIELD_NAME || zzgh == zzgm.END_OBJECT)) {
                z = false;
            }
            zzks.checkArgument(z, zzgh);
            return zzgh;
        } else if (i != 2) {
            return zzgs;
        } else {
            return zzgh();
        }
    }

    public final Object zza(Type type, boolean z, zzgc zzgc) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                zzgs();
            }
            return zza((Field) null, type, new ArrayList(), (Object) null, (zzgc) null, true);
        } finally {
            if (z) {
                close();
            }
        }
    }

    private final void zza(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, zzgc zzgc) throws IOException {
        zzgm zzgt = zzgt();
        while (zzgt == zzgm.FIELD_NAME) {
            String text = getText();
            zzgh();
            if (zzgc == null) {
                map.put(text, zza(field, type, arrayList, map, zzgc, true));
                zzgt = zzgh();
            } else {
                throw new NoSuchMethodError();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x01bb A[Catch:{ IllegalArgumentException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c5 A[Catch:{ IllegalArgumentException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ed A[Catch:{ IllegalArgumentException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0240 A[Catch:{ IllegalArgumentException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x044f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object zza(java.lang.reflect.Field r20, java.lang.reflect.Type r21, java.util.ArrayList<java.lang.reflect.Type> r22, java.lang.Object r23, com.google.android.gms.internal.firebase_ml.zzgc r24, boolean r25) throws java.io.IOException {
        /*
            r19 = this;
            r8 = r20
            r0 = r22
            r1 = r21
            java.lang.reflect.Type r9 = com.google.android.gms.internal.firebase_ml.zzhf.zza((java.util.List<java.lang.reflect.Type>) r0, (java.lang.reflect.Type) r1)
            boolean r1 = r9 instanceof java.lang.Class
            r10 = 0
            if (r1 == 0) goto L_0x0013
            r1 = r9
            java.lang.Class r1 = (java.lang.Class) r1
            goto L_0x0014
        L_0x0013:
            r1 = r10
        L_0x0014:
            boolean r2 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x001f
            r1 = r9
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.Class r1 = com.google.android.gms.internal.firebase_ml.zzia.zza((java.lang.reflect.ParameterizedType) r1)
        L_0x001f:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r1 != r2) goto L_0x0027
            r19.zzgk()
            return r10
        L_0x0027:
            com.google.android.gms.internal.firebase_ml.zzgm r2 = r19.zzgi()
            int[] r3 = com.google.android.gms.internal.firebase_ml.zzgj.zzwl     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzgm r4 = r19.zzgi()     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r4 = r4.ordinal()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3 = r3[r4]     // Catch:{ IllegalArgumentException -> 0x0439 }
            r11 = 0
            r12 = 1
            switch(r3) {
                case 1: goto L_0x024c;
                case 2: goto L_0x01d1;
                case 3: goto L_0x01d1;
                case 4: goto L_0x024c;
                case 5: goto L_0x024c;
                case 6: goto L_0x01a1;
                case 7: goto L_0x01a1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00e4;
                case 10: goto L_0x008b;
                case 11: goto L_0x0040;
                default: goto L_0x003c;
            }     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x003c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x0416
        L_0x0040:
            if (r1 == 0) goto L_0x0048
            boolean r2 = r1.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 != 0) goto L_0x0049
        L_0x0048:
            r11 = r12
        L_0x0049:
            java.lang.String r2 = "primitive number field but found a JSON null"
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r11, r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x0082
            int r2 = r1.getModifiers()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r2 = r2 & 1536(0x600, float:2.152E-42)
            if (r2 == 0) goto L_0x0082
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzia.zza((java.lang.Class<?>) r1, (java.lang.Class<?>) r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 == 0) goto L_0x006d
            java.util.Collection r0 = com.google.android.gms.internal.firebase_ml.zzhf.zzb(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Object r0 = com.google.android.gms.internal.firebase_ml.zzhf.zzd(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x006d:
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzia.zza((java.lang.Class<?>) r1, (java.lang.Class<?>) r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 == 0) goto L_0x0082
            java.util.Map r0 = com.google.android.gms.internal.firebase_ml.zzhf.zze(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Object r0 = com.google.android.gms.internal.firebase_ml.zzhf.zzd(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x0082:
            java.lang.Class r0 = com.google.android.gms.internal.firebase_ml.zzia.zzb(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Object r0 = com.google.android.gms.internal.firebase_ml.zzhf.zzd(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x008b:
            java.lang.String r0 = r19.getText()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r0 = r0.trim()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == r2) goto L_0x00a9
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r1 == r2) goto L_0x00a9
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == r2) goto L_0x00a9
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r1 != r2) goto L_0x00c1
        L_0x00a9:
            java.lang.String r2 = "nan"
            boolean r2 = r0.equals(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "infinity"
            boolean r2 = r0.equals(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "-infinity"
            boolean r0 = r0.equals(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 != 0) goto L_0x00db
        L_0x00c1:
            if (r1 == 0) goto L_0x00d5
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 == 0) goto L_0x00d5
            if (r8 == 0) goto L_0x00d6
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzgl> r0 = com.google.android.gms.internal.firebase_ml.zzgl.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 == 0) goto L_0x00d6
        L_0x00d5:
            r11 = r12
        L_0x00d6:
            java.lang.String r0 = "number field formatted as a JSON string must use the @JsonString annotation"
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r11, r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x00db:
            java.lang.String r0 = r19.getText()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Object r0 = com.google.android.gms.internal.firebase_ml.zzhf.zza((java.lang.reflect.Type) r9, (java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x00e4:
            if (r8 == 0) goto L_0x00ee
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzgl> r0 = com.google.android.gms.internal.firebase_ml.zzgl.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 != 0) goto L_0x00ef
        L_0x00ee:
            r11 = r12
        L_0x00ef:
            java.lang.String r0 = "number type formatted as a JSON number cannot use @JsonString annotation"
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r11, r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x019c
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 == 0) goto L_0x0100
            goto L_0x019c
        L_0x0100:
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r1 != r0) goto L_0x0109
            java.math.BigInteger r0 = r19.zzgq()     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x0109:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 == r0) goto L_0x0193
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r0) goto L_0x0113
            goto L_0x0193
        L_0x0113:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L_0x018a
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r0) goto L_0x011d
            goto L_0x018a
        L_0x011d:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 == r0) goto L_0x0181
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r0) goto L_0x0126
            goto L_0x0181
        L_0x0126:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L_0x0178
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r0) goto L_0x012f
            goto L_0x0178
        L_0x012f:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 == r0) goto L_0x016f
            java.lang.Class r0 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r0) goto L_0x0138
            goto L_0x016f
        L_0x0138:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 == r0) goto L_0x0166
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r0) goto L_0x0141
            goto L_0x0166
        L_0x0141:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r2 = r2.length()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r2 = r2 + 30
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = "expected numeric type but got "
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3.append(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0166:
            byte r0 = r19.zzgl()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x016f:
            short r0 = r19.zzgm()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x0178:
            int r0 = r19.getIntValue()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x0181:
            float r0 = r19.zzgn()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x018a:
            long r0 = r19.zzgo()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x0193:
            double r0 = r19.zzgp()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x019c:
            java.math.BigDecimal r0 = r19.zzgr()     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x01a1:
            if (r9 == 0) goto L_0x01b4
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == r0) goto L_0x01b4
            if (r1 == 0) goto L_0x01b2
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 == 0) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r0 = r11
            goto L_0x01b5
        L_0x01b4:
            r0 = r12
        L_0x01b5:
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ IllegalArgumentException -> 0x0439 }
            r1[r11] = r9     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r0 == 0) goto L_0x01c5
            com.google.android.gms.internal.firebase_ml.zzgm r0 = com.google.android.gms.internal.firebase_ml.zzgm.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 != r0) goto L_0x01c2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x01c2:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x01c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = "expected type Boolean or boolean but got %s"
            java.lang.String r1 = com.google.android.gms.internal.firebase_ml.zzla.zzb(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x01d1:
            boolean r13 = com.google.android.gms.internal.firebase_ml.zzia.zzc(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r9 == 0) goto L_0x01e6
            if (r13 != 0) goto L_0x01e6
            if (r1 == 0) goto L_0x01e4
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzia.zza((java.lang.Class<?>) r1, (java.lang.Class<?>) r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 == 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r2 = r11
            goto L_0x01e7
        L_0x01e6:
            r2 = r12
        L_0x01e7:
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3[r11] = r9     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 == 0) goto L_0x0240
            if (r24 == 0) goto L_0x01f8
            if (r8 != 0) goto L_0x01f2
            goto L_0x01f8
        L_0x01f2:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x01f8:
            java.util.Collection r11 = com.google.android.gms.internal.firebase_ml.zzhf.zzb(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r13 == 0) goto L_0x0203
            java.lang.reflect.Type r10 = com.google.android.gms.internal.firebase_ml.zzia.zzd(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x0211
        L_0x0203:
            if (r1 == 0) goto L_0x0211
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            boolean r1 = r2.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x0211
            java.lang.reflect.Type r10 = com.google.android.gms.internal.firebase_ml.zzia.zze(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0211:
            java.lang.reflect.Type r9 = com.google.android.gms.internal.firebase_ml.zzhf.zza((java.util.List<java.lang.reflect.Type>) r0, (java.lang.reflect.Type) r10)     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzgm r1 = r19.zzgt()     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0219:
            com.google.android.gms.internal.firebase_ml.zzgm r2 = com.google.android.gms.internal.firebase_ml.zzgm.END_ARRAY     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == r2) goto L_0x0234
            r7 = 1
            r1 = r19
            r2 = r20
            r3 = r9
            r4 = r22
            r5 = r11
            r6 = r24
            java.lang.Object r1 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r11.add(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzgm r1 = r19.zzgh()     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x0219
        L_0x0234:
            if (r13 == 0) goto L_0x023f
            java.lang.Class r0 = com.google.android.gms.internal.firebase_ml.zzia.zzb(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Object r0 = com.google.android.gms.internal.firebase_ml.zzia.zza((java.util.Collection<?>) r11, (java.lang.Class<?>) r0)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x023f:
            return r11
        L_0x0240:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = "expected collection or array type but got %s"
            java.lang.String r1 = com.google.android.gms.internal.firebase_ml.zzla.zzb(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x024c:
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzia.zzc(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r2 = r2 ^ r12
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3[r11] = r9     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 == 0) goto L_0x040a
            if (r25 == 0) goto L_0x025f
            java.lang.reflect.Field r2 = zzb(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r13 = r2
            goto L_0x0260
        L_0x025f:
            r13 = r10
        L_0x0260:
            if (r1 == 0) goto L_0x026b
            if (r24 != 0) goto L_0x0265
            goto L_0x026b
        L_0x0265:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x026b:
            if (r1 == 0) goto L_0x0277
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzia.zza((java.lang.Class<?>) r1, (java.lang.Class<?>) r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 == 0) goto L_0x0277
            r2 = r12
            goto L_0x0278
        L_0x0277:
            r2 = r11
        L_0x0278:
            if (r13 == 0) goto L_0x0280
            com.google.android.gms.internal.firebase_ml.zzgd r3 = new com.google.android.gms.internal.firebase_ml.zzgd     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x028e
        L_0x0280:
            if (r2 != 0) goto L_0x028a
            if (r1 != 0) goto L_0x0285
            goto L_0x028a
        L_0x0285:
            java.lang.Object r3 = com.google.android.gms.internal.firebase_ml.zzia.zzf(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x028e
        L_0x028a:
            java.util.Map r3 = com.google.android.gms.internal.firebase_ml.zzhf.zze(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x028e:
            r14 = r3
            int r15 = r22.size()     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r9 == 0) goto L_0x0298
            r0.add(r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0298:
            if (r2 == 0) goto L_0x02c2
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzhm> r2 = com.google.android.gms.internal.firebase_ml.zzhm.class
            boolean r2 = r2.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r2 != 0) goto L_0x02c2
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r1 = r2.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x02b0
            java.lang.reflect.Type r1 = com.google.android.gms.internal.firebase_ml.zzia.zzf((java.lang.reflect.Type) r9)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r4 = r1
            goto L_0x02b1
        L_0x02b0:
            r4 = r10
        L_0x02b1:
            if (r4 == 0) goto L_0x02c2
            r3 = r14
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x0439 }
            r1 = r19
            r2 = r20
            r5 = r22
            r6 = r24
            r1.zza(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r14
        L_0x02c2:
            boolean r1 = r14 instanceof com.google.android.gms.internal.firebase_ml.zzgd     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x02d0
            r1 = r14
            com.google.android.gms.internal.firebase_ml.zzgd r1 = (com.google.android.gms.internal.firebase_ml.zzgd) r1     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzge r2 = r19.zzgg()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r1.zza(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x02d0:
            com.google.android.gms.internal.firebase_ml.zzgm r1 = r19.zzgt()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzhd r7 = com.google.android.gms.internal.firebase_ml.zzhd.zzc(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzhm> r3 = com.google.android.gms.internal.firebase_ml.zzhm.class
            boolean r16 = r3.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r16 != 0) goto L_0x0301
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r3 == 0) goto L_0x0301
            r3 = r14
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x0439 }
            r4 = 0
            java.lang.reflect.Type r5 = com.google.android.gms.internal.firebase_ml.zzia.zzf((java.lang.reflect.Type) r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r1 = r19
            r2 = r4
            r4 = r5
            r5 = r22
            r6 = r24
            r1.zza(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x038a
        L_0x0301:
            com.google.android.gms.internal.firebase_ml.zzgm r2 = com.google.android.gms.internal.firebase_ml.zzgm.FIELD_NAME     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 != r2) goto L_0x038a
            java.lang.String r6 = r19.getText()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r19.zzgh()     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r24 != 0) goto L_0x0384
            com.google.android.gms.internal.firebase_ml.zzhl r5 = r7.zzao(r6)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r5 == 0) goto L_0x0356
            boolean r1 = r5.zzhg()     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x0329
            boolean r1 = r5.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x0321
            goto L_0x0329
        L_0x0321:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = "final array/object fields are not supported"
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0329:
            java.lang.reflect.Field r2 = r5.zzhf()     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r6 = r22.size()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.reflect.Type r1 = r2.getGenericType()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.add(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.reflect.Type r3 = r5.getGenericType()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r17 = 1
            r1 = r19
            r4 = r22
            r10 = r5
            r5 = r14
            r11 = r6
            r6 = r24
            r18 = r7
            r7 = r17
            java.lang.Object r1 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.remove(r11)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r10.zzb(r14, r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x0375
        L_0x0356:
            r18 = r7
            if (r16 == 0) goto L_0x0370
            r10 = r14
            com.google.android.gms.internal.firebase_ml.zzhm r10 = (com.google.android.gms.internal.firebase_ml.zzhm) r10     // Catch:{ IllegalArgumentException -> 0x0439 }
            r2 = 0
            r3 = 0
            r7 = 1
            r1 = r19
            r4 = r22
            r5 = r14
            r11 = r6
            r6 = r24
            java.lang.Object r1 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r10.zzb(r11, r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x0375
        L_0x0370:
            if (r24 != 0) goto L_0x037e
            r19.zzgk()     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0375:
            com.google.android.gms.internal.firebase_ml.zzgm r1 = r19.zzgh()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r7 = r18
            r10 = 0
            r11 = 0
            goto L_0x0301
        L_0x037e:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0384:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x038a:
            if (r9 == 0) goto L_0x038f
            r0.remove(r15)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x038f:
            if (r13 != 0) goto L_0x0392
            return r14
        L_0x0392:
            r1 = r14
            com.google.android.gms.internal.firebase_ml.zzgd r1 = (com.google.android.gms.internal.firebase_ml.zzgd) r1     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = r13.getName()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r1 == 0) goto L_0x03a1
            r2 = r12
            goto L_0x03a2
        L_0x03a1:
            r2 = 0
        L_0x03a2:
            java.lang.String r3 = "No value specified for @JsonPolymorphicTypeMap field"
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzgk> r2 = com.google.android.gms.internal.firebase_ml.zzgk.class
            java.lang.annotation.Annotation r2 = r13.getAnnotation(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzgk r2 = (com.google.android.gms.internal.firebase_ml.zzgk) r2     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzgk$zza[] r2 = r2.zzgu()     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r3 = r2.length     // Catch:{ IllegalArgumentException -> 0x0439 }
            r4 = 0
        L_0x03b9:
            if (r4 >= r3) goto L_0x03d0
            r5 = r2[r4]     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r6 = r5.zzgv()     // Catch:{ IllegalArgumentException -> 0x0439 }
            boolean r6 = r6.equals(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            if (r6 == 0) goto L_0x03cd
            java.lang.Class r2 = r5.zzgw()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3 = r2
            goto L_0x03d1
        L_0x03cd:
            int r4 = r4 + 1
            goto L_0x03b9
        L_0x03d0:
            r3 = 0
        L_0x03d1:
            if (r3 == 0) goto L_0x03d5
            r11 = r12
            goto L_0x03d6
        L_0x03d5:
            r11 = 0
        L_0x03d6:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r2 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r4 = "No TypeDef annotation found with key: "
            if (r2 == 0) goto L_0x03e7
            java.lang.String r1 = r4.concat(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            goto L_0x03ec
        L_0x03e7:
            java.lang.String r1 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0439 }
            r1.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x03ec:
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r11, r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzge r1 = r19.zzgg()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = r1.toString(r14)     // Catch:{ IllegalArgumentException -> 0x0439 }
            com.google.android.gms.internal.firebase_ml.zzgi r1 = r1.zzam(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r1.zzgs()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r20
            r4 = r22
            java.lang.Object r0 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0439 }
            return r0
        L_0x040a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = "expected object or map type but got %s"
            java.lang.String r1 = com.google.android.gms.internal.firebase_ml.zzla.zzb(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0416:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r2 = r2.length()     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0439 }
            int r2 = r2 + 27
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r2 = "unexpected JSON node type: "
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x0439 }
            r3.append(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            java.lang.String r1 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x0439 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0439 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0439 }
        L_0x0439:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.zzgj()
            if (r2 == 0) goto L_0x044d
            java.lang.String r3 = "key "
            r1.append(r3)
            r1.append(r2)
        L_0x044d:
            if (r8 == 0) goto L_0x045e
            if (r2 == 0) goto L_0x0456
            java.lang.String r2 = ", "
            r1.append(r2)
        L_0x0456:
            java.lang.String r2 = "field "
            r1.append(r2)
            r1.append(r8)
        L_0x045e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzgi.zza(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, com.google.android.gms.internal.firebase_ml.zzgc, boolean):java.lang.Object");
    }

    private static Field zzb(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        zzwk.lock();
        try {
            if (zzwj.containsKey(cls)) {
                return zzwj.get(cls);
            }
            for (zzhl zzhf : zzhd.zzc(cls).zzhd()) {
                Field zzhf2 = zzhf.zzhf();
                zzgk zzgk = (zzgk) zzhf2.getAnnotation(zzgk.class);
                if (zzgk != null) {
                    Object[] objArr = {cls};
                    if (field == null) {
                        boolean zza = zzhf.zza(zzhf2.getType());
                        Object[] objArr2 = {cls, zzhf2.getType()};
                        if (zza) {
                            zzgk.zza[] zzgu = zzgk.zzgu();
                            HashSet hashSet = new HashSet();
                            zzks.checkArgument(zzgu.length > 0, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                            int length = zzgu.length;
                            int i = 0;
                            while (i < length) {
                                zzgk.zza zza2 = zzgu[i];
                                boolean add = hashSet.add(zza2.zzgv());
                                Object[] objArr3 = {zza2.zzgv()};
                                if (add) {
                                    i++;
                                } else {
                                    throw new IllegalArgumentException(zzla.zzb("Class contains two @TypeDef annotations with identical key: %s", objArr3));
                                }
                            }
                            field = zzhf2;
                        } else {
                            throw new IllegalArgumentException(zzla.zzb("Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", objArr2));
                        }
                    } else {
                        throw new IllegalArgumentException(zzla.zzb("Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", objArr));
                    }
                }
            }
            zzwj.put(cls, field);
            zzwk.unlock();
            return field;
        } finally {
            zzwk.unlock();
        }
    }
}
