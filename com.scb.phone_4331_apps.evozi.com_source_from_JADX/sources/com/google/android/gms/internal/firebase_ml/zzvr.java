package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

final class zzvr {
    static String zza(zzvo zzvo, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzvo, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f1, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0210, code lost:
        if (((java.lang.Float) r11).floatValue() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0222, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L_0x0254;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.firebase_ml.zzvo r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L_0x004f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L_0x004c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x004f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0273
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto L_0x00c9
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto L_0x00c9
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x00c9
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + -4
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto L_0x00a1
            java.lang.String r11 = r11.concat(r12)
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x00a7:
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L_0x00c9
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00c9
            java.lang.String r6 = zzcq(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.firebase_ml.zzue.zza((java.lang.reflect.Method) r12, (java.lang.Object) r0, (java.lang.Object[]) r7)
            zza(r1, r2, r6, r7)
            goto L_0x0053
        L_0x00c9:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L_0x0137
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0137
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + -3
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto L_0x00fc
            java.lang.String r11 = r11.concat(r12)
            goto L_0x0102
        L_0x00fc:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x0102:
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0137
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0137
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L_0x0137
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L_0x0137
            java.lang.String r7 = zzcq(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = com.google.android.gms.internal.firebase_ml.zzue.zza((java.lang.reflect.Method) r6, (java.lang.Object) r0, (java.lang.Object[]) r9)
            zza(r1, r2, r7, r6)
            goto L_0x0053
        L_0x0137:
            java.lang.String r6 = java.lang.String.valueOf(r9)
            int r11 = r6.length()
            java.lang.String r12 = "set"
            if (r11 == 0) goto L_0x0148
            java.lang.String r6 = r12.concat(r6)
            goto L_0x014d
        L_0x0148:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r12)
        L_0x014d:
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0053
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x0181
            int r6 = r9.length()
            int r6 = r6 + -5
            java.lang.String r6 = r9.substring(r8, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto L_0x0176
            java.lang.String r6 = r10.concat(r6)
            goto L_0x017b
        L_0x0176:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r10)
        L_0x017b:
            boolean r6 = r3.containsKey(r6)
            if (r6 != 0) goto L_0x0053
        L_0x0181:
            java.lang.String r6 = r9.substring(r8, r13)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r11 = r9.substring(r13)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r6 = r6.concat(r11)
            goto L_0x01a6
        L_0x01a0:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L_0x01a6:
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x01b5
            java.lang.String r11 = r10.concat(r11)
            goto L_0x01ba
        L_0x01b5:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
        L_0x01ba:
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r12 = r9.length()
            java.lang.String r14 = "has"
            if (r12 == 0) goto L_0x01d1
            java.lang.String r9 = r14.concat(r9)
            goto L_0x01d6
        L_0x01d1:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r14)
        L_0x01d6:
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L_0x0053
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = com.google.android.gms.internal.firebase_ml.zzue.zza((java.lang.reflect.Method) r11, (java.lang.Object) r0, (java.lang.Object[]) r12)
            if (r9 != 0) goto L_0x025c
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x01f4
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0256
            goto L_0x0254
        L_0x01f4:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x0202
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x0256
            goto L_0x0254
        L_0x0202:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L_0x0213
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0256
            goto L_0x0254
        L_0x0213:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L_0x0225
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x0256
            goto L_0x0254
        L_0x0225:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L_0x022e
            boolean r7 = r11.equals(r7)
            goto L_0x0257
        L_0x022e:
            boolean r7 = r11 instanceof com.google.android.gms.internal.firebase_ml.zzsw
            if (r7 == 0) goto L_0x0239
            com.google.android.gms.internal.firebase_ml.zzsw r7 = com.google.android.gms.internal.firebase_ml.zzsw.zzbkl
            boolean r7 = r11.equals(r7)
            goto L_0x0257
        L_0x0239:
            boolean r7 = r11 instanceof com.google.android.gms.internal.firebase_ml.zzvo
            if (r7 == 0) goto L_0x0247
            r7 = r11
            com.google.android.gms.internal.firebase_ml.zzvo r7 = (com.google.android.gms.internal.firebase_ml.zzvo) r7
            com.google.android.gms.internal.firebase_ml.zzvo r7 = r7.zzre()
            if (r11 != r7) goto L_0x0256
            goto L_0x0254
        L_0x0247:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x0256
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L_0x0256
        L_0x0254:
            r7 = r13
            goto L_0x0257
        L_0x0256:
            r7 = r8
        L_0x0257:
            if (r7 != 0) goto L_0x025a
            goto L_0x0268
        L_0x025a:
            r13 = r8
            goto L_0x0268
        L_0x025c:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.firebase_ml.zzue.zza((java.lang.reflect.Method) r9, (java.lang.Object) r0, (java.lang.Object[]) r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L_0x0268:
            if (r13 == 0) goto L_0x0053
            java.lang.String r6 = zzcq(r6)
            zza(r1, r2, r6, r11)
            goto L_0x0053
        L_0x0273:
            boolean r3 = r0 instanceof com.google.android.gms.internal.firebase_ml.zzue.zzd
            if (r3 == 0) goto L_0x0296
            r3 = r0
            com.google.android.gms.internal.firebase_ml.zzue$zzd r3 = (com.google.android.gms.internal.firebase_ml.zzue.zzd) r3
            com.google.android.gms.internal.firebase_ml.zztw<java.lang.Object> r3 = r3.zzbon
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x0287
            goto L_0x0296
        L_0x0287:
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0296:
            com.google.android.gms.internal.firebase_ml.zzue r0 = (com.google.android.gms.internal.firebase_ml.zzue) r0
            com.google.android.gms.internal.firebase_ml.zzwx r3 = r0.zzboh
            if (r3 == 0) goto L_0x02a1
            com.google.android.gms.internal.firebase_ml.zzwx r0 = r0.zzboh
            r0.zzb((java.lang.StringBuilder) r1, (int) r2)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvr.zza(com.google.android.gms.internal.firebase_ml.zzvo, java.lang.StringBuilder, int):void");
    }

    static final void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zza : (List) obj) {
                zza(sb, i, str, zza);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zza2 : ((Map) obj).entrySet()) {
                zza(sb, i, str, zza2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzws.zzd(zzsw.zzcn((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzsw) {
                sb.append(": \"");
                sb.append(zzws.zzd((zzsw) obj));
                sb.append('\"');
            } else if (obj instanceof zzue) {
                sb.append(" {");
                zza((zzue) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                zza(sb, i4, "key", entry.getKey());
                zza(sb, i4, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zzcq(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
