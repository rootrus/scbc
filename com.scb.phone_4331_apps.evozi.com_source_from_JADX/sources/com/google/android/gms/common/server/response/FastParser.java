package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaqu = {'u', 'l', 'l'};
    private static final char[] zaqv = {'r', 'u', 'e'};
    private static final char[] zaqw = {'r', 'u', 'e', '\"'};
    private static final char[] zaqx = {'a', 'l', 's', 'e'};
    private static final char[] zaqy = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaqz = {10};
    private static final zaa<Integer> zarb = new zab();
    private static final zaa<Long> zarc = new zaa();
    private static final zaa<Float> zard = new zad();
    private static final zaa<Double> zare = new zac();
    private static final zaa<Boolean> zarf = new zaf();
    private static final zaa<String> zarg = new zae();
    private static final zaa<BigInteger> zarh = new zah();
    private static final zaa<BigDecimal> zari = new zag();
    private final char[] zaqp = new char[1];
    private final char[] zaqq = new char[32];
    private final char[] zaqr = new char[1024];
    private final StringBuilder zaqs = new StringBuilder(32);
    private final StringBuilder zaqt = new StringBuilder(1024);
    private final Stack<Integer> zara = new Stack<>();

    interface zaa<O> {
        O zah(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    public void parse(InputStream inputStream, T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.zara.push(0);
            char zaj = zaj(bufferedReader);
            if (zaj != 0) {
                if (zaj == '[') {
                    this.zara.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        FastJsonResponse.Field field = (FastJsonResponse.Field) fieldMappings.entrySet().iterator().next().getValue();
                        t.addConcreteTypeArrayInternal(field, field.zaqj, zaa(bufferedReader, (FastJsonResponse.Field<?, ?>) field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (zaj == '{') {
                    this.zara.push(1);
                    zaa(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zaj);
                    throw new ParseException(sb.toString());
                }
                zak(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } else {
                throw new ParseException("No data to parse");
            }
        } catch (IOException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0269, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026a, code lost:
        zak(r5);
        zak(2);
        r5 = zaj(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0275, code lost:
        if (r5 == ',') goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0277, code lost:
        if (r5 != '}') goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0279, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x027c, code lost:
        r0 = new java.lang.StringBuilder(55);
        r0.append("Expected end of object or field separator, but found: ");
        r0.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0294, code lost:
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0295, code lost:
        r5 = zaa(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b2, code lost:
        r5 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zaa(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "Error instantiating inner object"
            java.util.Map r4 = r18.getFieldMappings()
            java.lang.String r5 = r16.zaa(r17)
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 0
            if (r5 != 0) goto L_0x001c
            r1.zak(r6)
            return r8
        L_0x001c:
            r9 = 0
        L_0x001d:
            if (r5 == 0) goto L_0x029b
            java.lang.Object r5 = r4.get(r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = r16.zab(r17)
            goto L_0x001d
        L_0x002c:
            java.util.Stack<java.lang.Integer> r10 = r1.zara
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.push(r12)
            int r10 = r5.zaqf
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 44
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 110(0x6e, float:1.54E-43)
            switch(r10) {
                case 0: goto L_0x0254;
                case 1: goto L_0x023e;
                case 2: goto L_0x0228;
                case 3: goto L_0x0212;
                case 4: goto L_0x01fc;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01cc;
                case 7: goto L_0x01b6;
                case 8: goto L_0x01a1;
                case 9: goto L_0x018f;
                case 10: goto L_0x00d0;
                case 11: goto L_0x005e;
                default: goto L_0x0043;
            }
        L_0x0043:
            int r0 = r5.zaqf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 30
            r2.<init>(r3)
            java.lang.String r3 = "Invalid field type "
            r2.append(r3)
            r2.append(r0)
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x005e:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x0093
            char r10 = r16.zaj(r17)
            if (r10 != r15) goto L_0x0073
            char[] r10 = zaqu
            r1.zab((java.io.BufferedReader) r0, (char[]) r10)
            java.lang.String r10 = r5.zaqj
            r2.addConcreteTypeArrayInternal(r5, r10, r9)
            goto L_0x00a3
        L_0x0073:
            java.util.Stack<java.lang.Integer> r12 = r1.zara
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.push(r15)
            r12 = 91
            if (r10 != r12) goto L_0x008b
            java.lang.String r10 = r5.zaqj
            java.util.ArrayList r12 = r1.zaa((java.io.BufferedReader) r0, (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) r5)
            r2.addConcreteTypeArrayInternal(r5, r10, r12)
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected array start"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0093:
            char r10 = r16.zaj(r17)
            if (r10 != r15) goto L_0x00a6
            char[] r10 = zaqu
            r1.zab((java.io.BufferedReader) r0, (char[]) r10)
            java.lang.String r10 = r5.zaqj
            r2.addConcreteTypeInternal(r5, r10, r9)
        L_0x00a3:
            r5 = r11
            goto L_0x026a
        L_0x00a6:
            java.util.Stack<java.lang.Integer> r15 = r1.zara
            r15.push(r7)
            if (r10 != r12) goto L_0x00c8
            com.google.android.gms.common.server.response.FastJsonResponse r10 = r5.zacn()     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            r1.zaa((java.io.BufferedReader) r0, (com.google.android.gms.common.server.response.FastJsonResponse) r10)     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            java.lang.String r12 = r5.zaqj     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            r2.addConcreteTypeInternal(r5, r12, r10)     // Catch:{ InstantiationException -> 0x00c1, IllegalAccessException -> 0x00ba }
            goto L_0x00a3
        L_0x00ba:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00c1:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00c8:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of object"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00d0:
            char r10 = r16.zaj(r17)
            if (r10 != r15) goto L_0x00de
            char[] r10 = zaqu
            r1.zab((java.io.BufferedReader) r0, (char[]) r10)
            r10 = r9
            goto L_0x015e
        L_0x00de:
            if (r10 != r12) goto L_0x0187
            java.util.Stack<java.lang.Integer> r10 = r1.zara
            r10.push(r7)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x00ea:
            char r12 = r16.zaj(r17)
            if (r12 == 0) goto L_0x017f
            r15 = 34
            if (r12 == r15) goto L_0x00fa
            if (r12 != r14) goto L_0x017b
            r1.zak(r6)
            goto L_0x015e
        L_0x00fa:
            char[] r12 = r1.zaqq
            java.lang.StringBuilder r11 = r1.zaqs
            java.lang.String r11 = zab(r0, r12, r11, r9)
            char r12 = r16.zaj(r17)
            r8 = 58
            if (r12 == r8) goto L_0x0126
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r2 = r0.length()
            java.lang.String r3 = "No map value found for key "
            if (r2 == 0) goto L_0x011b
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0120
        L_0x011b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0120:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>((java.lang.String) r0)
            throw r2
        L_0x0126:
            char r8 = r16.zaj(r17)
            if (r8 == r15) goto L_0x0148
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r2 = r0.length()
            java.lang.String r3 = "Expected String value for key "
            if (r2 == 0) goto L_0x013d
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0142
        L_0x013d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0142:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>((java.lang.String) r0)
            throw r2
        L_0x0148:
            char[] r8 = r1.zaqq
            java.lang.StringBuilder r12 = r1.zaqs
            java.lang.String r8 = zab(r0, r8, r12, r9)
            r10.put(r11, r8)
            char r8 = r16.zaj(r17)
            if (r8 == r13) goto L_0x017b
            if (r8 != r14) goto L_0x0162
            r1.zak(r6)
        L_0x015e:
            r2.zaa(r5, (java.util.Map<java.lang.String, java.lang.String>) r10)
            goto L_0x01b2
        L_0x0162:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 48
            r0.<init>(r2)
            java.lang.String r2 = "Unexpected character while parsing string map: "
            r0.append(r2)
            r0.append(r8)
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r0)
            throw r2
        L_0x017b:
            r8 = 0
            r11 = 4
            goto L_0x00ea
        L_0x017f:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0187:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of a map object"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x018f:
            char[] r8 = r1.zaqr
            java.lang.StringBuilder r10 = r1.zaqt
            char[] r11 = zaqz
            java.lang.String r8 = r1.zaa(r0, r8, r10, r11)
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r8)
            r2.zaa(r5, (byte[]) r8)
            goto L_0x01b2
        L_0x01a1:
            char[] r8 = r1.zaqr
            java.lang.StringBuilder r10 = r1.zaqt
            char[] r11 = zaqz
            java.lang.String r8 = r1.zaa(r0, r8, r10, r11)
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decode(r8)
            r2.zaa(r5, (byte[]) r8)
        L_0x01b2:
            r5 = 4
            r8 = 0
            goto L_0x026a
        L_0x01b6:
            boolean r8 = r5.zaqg
            if (r8 == 0) goto L_0x01c4
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.String> r8 = zarg
            java.util.ArrayList r8 = r1.zaa((java.io.BufferedReader) r0, r8)
            r2.zah(r5, r8)
            goto L_0x01b2
        L_0x01c4:
            java.lang.String r8 = r16.zac(r17)
            r2.zaa(r5, (java.lang.String) r8)
            goto L_0x01b2
        L_0x01cc:
            boolean r8 = r5.zaqg
            if (r8 == 0) goto L_0x01da
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Boolean> r8 = zarf
            java.util.ArrayList r8 = r1.zaa((java.io.BufferedReader) r0, r8)
            r2.zag(r5, r8)
            goto L_0x01b2
        L_0x01da:
            r8 = 0
            boolean r10 = r1.zaa((java.io.BufferedReader) r0, (boolean) r8)
            r2.zaa(r5, (boolean) r10)
            goto L_0x0269
        L_0x01e4:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x01f3
            com.google.android.gms.common.server.response.FastParser$zaa<java.math.BigDecimal> r10 = zari
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zaf(r5, r10)
            goto L_0x0269
        L_0x01f3:
            java.math.BigDecimal r10 = r16.zai(r17)
            r2.zaa(r5, (java.math.BigDecimal) r10)
            goto L_0x0269
        L_0x01fc:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x020a
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Double> r10 = zare
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zae(r5, r10)
            goto L_0x0269
        L_0x020a:
            double r10 = r16.zah(r17)
            r2.zaa(r5, (double) r10)
            goto L_0x0269
        L_0x0212:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x0220
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Float> r10 = zard
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zad(r5, r10)
            goto L_0x0269
        L_0x0220:
            float r10 = r16.zag(r17)
            r2.zaa(r5, (float) r10)
            goto L_0x0269
        L_0x0228:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x0236
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Long> r10 = zarc
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zac(r5, r10)
            goto L_0x0269
        L_0x0236:
            long r10 = r16.zae(r17)
            r2.zaa(r5, (long) r10)
            goto L_0x0269
        L_0x023e:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x024c
            com.google.android.gms.common.server.response.FastParser$zaa<java.math.BigInteger> r10 = zarh
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zab(r5, (java.util.ArrayList<java.math.BigInteger>) r10)
            goto L_0x0269
        L_0x024c:
            java.math.BigInteger r10 = r16.zaf(r17)
            r2.zaa(r5, (java.math.BigInteger) r10)
            goto L_0x0269
        L_0x0254:
            boolean r10 = r5.zaqg
            if (r10 == 0) goto L_0x0262
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Integer> r10 = zarb
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zaa(r5, (java.util.ArrayList<java.lang.Integer>) r10)
            goto L_0x0269
        L_0x0262:
            int r10 = r16.zad(r17)
            r2.zaa(r5, (int) r10)
        L_0x0269:
            r5 = 4
        L_0x026a:
            r1.zak(r5)
            r5 = 2
            r1.zak(r5)
            char r5 = r16.zaj(r17)
            if (r5 == r13) goto L_0x0295
            if (r5 != r14) goto L_0x027c
            r5 = r9
            goto L_0x001d
        L_0x027c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 55
            r0.<init>(r2)
            java.lang.String r2 = "Expected end of object or field separator, but found: "
            r0.append(r2)
            r0.append(r5)
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r0)
            throw r2
        L_0x0295:
            java.lang.String r5 = r16.zaa(r17)
            goto L_0x001d
        L_0x029b:
            r1.zak(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaa(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    private final String zaa(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zara.push(2);
        char zaj = zaj(bufferedReader);
        if (zaj == '\"') {
            this.zara.push(3);
            String zab = zab(bufferedReader, this.zaqq, this.zaqs, (char[]) null);
            zak(3);
            if (zaj(bufferedReader) == ':') {
                return zab;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zaj == ']') {
            zak(2);
            zak(1);
            zak(5);
            return null;
        } else if (zaj == '}') {
            zak(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zaj);
            throw new ParseException(sb.toString());
        }
    }

    private final String zab(BufferedReader bufferedReader) throws ParseException, IOException {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char zaj = zaj(bufferedReader);
        if (zaj != '\"') {
            if (zaj != ',') {
                int i = 1;
                if (zaj == '[') {
                    this.zara.push(5);
                    bufferedReader2.mark(32);
                    if (zaj(bufferedReader) == ']') {
                        zak(5);
                    } else {
                        bufferedReader.reset();
                        boolean z = false;
                        boolean z2 = false;
                        while (i > 0) {
                            char zaj2 = zaj(bufferedReader);
                            if (zaj2 == 0) {
                                throw new ParseException("Unexpected EOF while parsing array");
                            } else if (!Character.isISOControl(zaj2)) {
                                if (zaj2 == '\"' && !z2) {
                                    z = !z;
                                }
                                if (zaj2 == '[' && !z) {
                                    i++;
                                }
                                if (zaj2 == ']' && !z) {
                                    i--;
                                }
                                z2 = (zaj2 != '\\' || !z) ? false : !z2;
                            } else {
                                throw new ParseException("Unexpected control character while reading array");
                            }
                        }
                        zak(5);
                    }
                } else if (zaj != '{') {
                    bufferedReader.reset();
                    zaa(bufferedReader2, this.zaqr);
                } else {
                    this.zara.push(1);
                    bufferedReader2.mark(32);
                    char zaj3 = zaj(bufferedReader);
                    if (zaj3 == '}') {
                        zak(1);
                    } else if (zaj3 == '\"') {
                        bufferedReader.reset();
                        zaa(bufferedReader);
                        do {
                        } while (zab(bufferedReader) != null);
                        zak(1);
                    } else {
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("Unexpected token ");
                        sb.append(zaj3);
                        throw new ParseException(sb.toString());
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader2.read(this.zaqp) != -1) {
            char c = this.zaqp[0];
            boolean z3 = false;
            do {
                if (c != '\"' || z3) {
                    z3 = c == '\\' ? !z3 : false;
                    if (bufferedReader2.read(this.zaqp) != -1) {
                        c = this.zaqp[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zaj4 = zaj(bufferedReader);
        if (zaj4 == ',') {
            zak(2);
            return zaa(bufferedReader);
        } else if (zaj4 == '}') {
            zak(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(zaj4);
            throw new ParseException(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    public final String zac(BufferedReader bufferedReader) throws ParseException, IOException {
        return zaa(bufferedReader, this.zaqq, this.zaqs, (char[]) null);
    }

    private final <O> ArrayList<O> zaa(BufferedReader bufferedReader, zaa<O> zaa2) throws ParseException, IOException {
        char zaj = zaj(bufferedReader);
        if (zaj == 'n') {
            zab(bufferedReader, zaqu);
            return null;
        } else if (zaj == '[') {
            this.zara.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char zaj2 = zaj(bufferedReader);
                if (zaj2 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (zaj2 != ',') {
                    if (zaj2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zaa2.zah(this, bufferedReader));
                    } else {
                        zak(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final String zaa(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char zaj = zaj(bufferedReader);
        if (zaj == '\"') {
            return zab(bufferedReader, cArr, sb, cArr2);
        }
        if (zaj == 'n') {
            zab(bufferedReader, zaqu);
            return null;
        }
        throw new ParseException("Expected string");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0030 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zab(java.io.BufferedReader r9, char[] r10, java.lang.StringBuilder r11, char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r11.setLength(r0)
            int r1 = r10.length
            r9.mark(r1)
            r1 = r0
            r2 = r1
        L_0x000a:
            int r3 = r9.read(r10)
            r4 = -1
            if (r3 == r4) goto L_0x006e
            r4 = r0
        L_0x0012:
            if (r4 >= r3) goto L_0x0066
            char r5 = r10[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            r7 = 1
            if (r6 == 0) goto L_0x0038
            if (r12 == 0) goto L_0x002c
            r6 = r0
        L_0x0020:
            int r8 = r12.length
            if (r6 >= r8) goto L_0x002c
            char r8 = r12[r6]
            if (r8 != r5) goto L_0x0029
            r6 = r7
            goto L_0x002d
        L_0x0029:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x002c:
            r6 = r0
        L_0x002d:
            if (r6 == 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected control character while reading string"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0038:
            r6 = 34
            if (r5 != r6) goto L_0x0059
            if (r2 != 0) goto L_0x0059
            r11.append(r10, r0, r4)
            r9.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r9.skip(r2)
            if (r1 == 0) goto L_0x0054
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = com.google.android.gms.common.util.JsonUtils.unescapeString(r9)
            return r9
        L_0x0054:
            java.lang.String r9 = r11.toString()
            return r9
        L_0x0059:
            r6 = 92
            if (r5 != r6) goto L_0x0062
            r1 = r2 ^ 1
            r2 = r1
            r1 = r7
            goto L_0x0063
        L_0x0062:
            r2 = r0
        L_0x0063:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0066:
            r11.append(r10, r0, r3)
            int r3 = r10.length
            r9.mark(r3)
            goto L_0x000a
        L_0x006e:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected EOF while parsing string"
            r9.<init>((java.lang.String) r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zab(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    /* access modifiers changed from: private */
    public final int zad(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        int i2;
        int i3;
        int zaa2 = zaa(bufferedReader, this.zaqr);
        int i4 = 0;
        if (zaa2 == 0) {
            return 0;
        }
        char[] cArr = this.zaqr;
        if (zaa2 > 0) {
            if (cArr[0] == '-') {
                i2 = PKIFailureInfo.systemUnavail;
                i = 1;
            } else {
                i2 = -2147483647;
                i = 0;
            }
            if (i < zaa2) {
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    i4 = -digit;
                    i3 = i + 1;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i3 = i;
            }
            while (i3 < zaa2) {
                int digit2 = Character.digit(cArr[i3], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (i4 >= -214748364) {
                    int i5 = i4 * 10;
                    if (i5 >= i2 + digit2) {
                        i4 = i5 - digit2;
                        i3++;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i == 0) {
                return -i4;
            }
            if (i3 > 1) {
                return i4;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final long zae(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        int i;
        int zaa2 = zaa(bufferedReader, this.zaqr);
        long j2 = 0;
        if (zaa2 == 0) {
            return 0;
        }
        char[] cArr = this.zaqr;
        if (zaa2 > 0) {
            int i2 = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else {
                j = -9223372036854775807L;
            }
            if (i2 < zaa2) {
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = (long) (-digit);
                    i = i2 + 1;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i = i2;
            }
            while (i < zaa2) {
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    long j3 = j2 * 10;
                    long j4 = (long) digit2;
                    if (j3 >= j + j4) {
                        j2 = j3 - j4;
                        i++;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i2 == 0) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final BigInteger zaf(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zaqr);
        if (zaa2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaqr, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final boolean zaa(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char zaj = zaj(bufferedReader);
            if (zaj != '\"') {
                if (zaj == 'f') {
                    zab(bufferedReader, z ? zaqy : zaqx);
                    return false;
                } else if (zaj == 'n') {
                    zab(bufferedReader, zaqu);
                    return false;
                } else if (zaj == 't') {
                    zab(bufferedReader, z ? zaqw : zaqv);
                    return true;
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zaj);
                    throw new ParseException(sb.toString());
                }
            } else if (!z) {
                z = true;
            } else {
                throw new ParseException("No boolean value found in string");
            }
        }
    }

    /* access modifiers changed from: private */
    public final float zag(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zaqr);
        if (zaa2 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return Float.parseFloat(new String(this.zaqr, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final double zah(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zaqr);
        if (zaa2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaqr, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final BigDecimal zai(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zaqr);
        if (zaa2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaqr, 0, zaa2));
    }

    private final <T extends FastJsonResponse> ArrayList<T> zaa(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList = new ArrayList<>();
        char zaj = zaj(bufferedReader);
        if (zaj == ']') {
            zak(5);
            return arrayList;
        } else if (zaj == 'n') {
            zab(bufferedReader, zaqu);
            zak(5);
            return null;
        } else if (zaj == '{') {
            this.zara.push(1);
            while (true) {
                try {
                    FastJsonResponse zacn = field.zacn();
                    if (!zaa(bufferedReader, zacn)) {
                        return arrayList;
                    }
                    arrayList.add(zacn);
                    char zaj2 = zaj(bufferedReader);
                    if (zaj2 != ',') {
                        if (zaj2 == ']') {
                            zak(5);
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(zaj2);
                        throw new ParseException(sb.toString());
                    } else if (zaj(bufferedReader) == '{') {
                        this.zara.push(1);
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(zaj);
            throw new ParseException(sb2.toString());
        }
    }

    private final char zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zaqp) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zaqp[0])) {
            if (bufferedReader.read(this.zaqp) == -1) {
                return 0;
            }
        }
        return this.zaqp[0];
    }

    private final int zaa(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char zaj = zaj(bufferedReader);
        if (zaj == 0) {
            throw new ParseException("Unexpected EOF");
        } else if (zaj == ',') {
            throw new ParseException("Missing value");
        } else if (zaj == 'n') {
            zab(bufferedReader, zaqu);
            return 0;
        } else {
            bufferedReader.mark(1024);
            if (zaj == '\"') {
                i = 0;
                boolean z = false;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c != '\"' || z) {
                        z = c == '\\' ? !z : false;
                        i++;
                    } else {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    }
                }
            } else {
                cArr[0] = zaj;
                int i2 = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    if (cArr[i] == '}' || cArr[i] == ',' || Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException("Unexpected EOF");
        }
    }

    private final void zab(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zaqq, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.zaqq[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    private final void zak(int i) throws ParseException {
        if (!this.zara.isEmpty()) {
            int intValue = this.zara.pop().intValue();
            if (intValue != i) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Expected state ");
                sb.append(i);
                sb.append(" but had ");
                sb.append(intValue);
                throw new ParseException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had empty stack");
        throw new ParseException(sb2.toString());
    }
}
