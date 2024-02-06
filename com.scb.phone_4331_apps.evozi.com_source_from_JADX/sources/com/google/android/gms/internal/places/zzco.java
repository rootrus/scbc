package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

final class zzco<T> implements zzda<T> {
    private static final int[] zzkq = new int[0];
    private static final Unsafe zzkr = zzdy.zzdn();
    private final int[] zzks;
    private final Object[] zzkt;
    private final int zzku;
    private final int zzkv;
    private final zzck zzkw;
    private final boolean zzkx;
    private final boolean zzky;
    private final boolean zzkz;
    private final boolean zzla;
    private final int[] zzlb;
    private final int zzlc;
    private final int zzld;
    private final zzcs zzle;
    private final zzbu zzlf;
    private final zzds<?, ?> zzlg;
    private final zzar<?> zzlh;
    private final zzcd zzli;

    private zzco(int[] iArr, Object[] objArr, int i, int i2, zzck zzck, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzcs zzcs, zzbu zzbu, zzds<?, ?> zzds, zzar<?> zzar, zzcd zzcd) {
        this.zzks = iArr;
        this.zzkt = objArr;
        this.zzku = i;
        this.zzkv = i2;
        this.zzky = zzck instanceof zzbc;
        this.zzkz = z;
        this.zzkx = zzar != null && zzar.zzf(zzck);
        this.zzla = false;
        this.zzlb = iArr2;
        this.zzlc = i3;
        this.zzld = i4;
        this.zzle = zzcs;
        this.zzlf = zzbu;
        this.zzlg = zzds;
        this.zzlh = zzar;
        this.zzkw = zzck;
        this.zzli = zzcd;
    }

    static <T> zzco<T> zzb(Class<T> cls, zzci zzci, zzcs zzcs, zzbu zzbu, zzds<?, ?> zzds, zzar<?> zzar, zzcd zzcd) {
        int i;
        char c;
        int[] iArr;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        boolean z;
        int i4;
        zzcx zzcx;
        int i5;
        Class<?> cls2;
        int i6;
        String str;
        int i7;
        int i8;
        char c7;
        char c8;
        Field field;
        int i9;
        char charAt;
        int i10;
        Field field2;
        Field field3;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        char charAt12;
        int i23;
        char charAt13;
        char charAt14;
        zzci zzci2 = zzci;
        if (zzci2 instanceof zzcx) {
            zzcx zzcx2 = (zzcx) zzci2;
            char c9 = 0;
            boolean z2 = zzcx2.zzcj() == zzbc.zze.zziu;
            String zzcr = zzcx2.zzcr();
            int length = zzcr.length();
            char charAt15 = zzcr.charAt(0);
            if (charAt15 >= 55296) {
                char c10 = charAt15 & 8191;
                int i24 = 1;
                int i25 = 13;
                while (true) {
                    i = i24 + 1;
                    charAt14 = zzcr.charAt(i24);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c10 |= (charAt14 & 8191) << i25;
                    i25 += 13;
                    i24 = i;
                }
                charAt15 = c10 | (charAt14 << i25);
            } else {
                i = 1;
            }
            int i26 = i + 1;
            char charAt16 = zzcr.charAt(i);
            if (charAt16 >= 55296) {
                char c11 = charAt16 & 8191;
                int i27 = 13;
                while (true) {
                    i23 = i26 + 1;
                    charAt13 = zzcr.charAt(i26);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c11 |= (charAt13 & 8191) << i27;
                    i27 += 13;
                    i26 = i23;
                }
                charAt16 = c11 | (charAt13 << i27);
                i26 = i23;
            }
            if (charAt16 == 0) {
                c5 = 0;
                c3 = 0;
                i2 = 0;
                c2 = 0;
                c = 0;
                iArr = zzkq;
                c4 = 0;
            } else {
                int i28 = i26 + 1;
                char charAt17 = zzcr.charAt(i26);
                if (charAt17 >= 55296) {
                    char c12 = charAt17 & 8191;
                    int i29 = 13;
                    while (true) {
                        i22 = i28 + 1;
                        charAt12 = zzcr.charAt(i28);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c12 |= (charAt12 & 8191) << i29;
                        i29 += 13;
                        i28 = i22;
                    }
                    charAt17 = c12 | (charAt12 << i29);
                    i28 = i22;
                }
                int i30 = i28 + 1;
                char charAt18 = zzcr.charAt(i28);
                if (charAt18 >= 55296) {
                    char c13 = charAt18 & 8191;
                    int i31 = 13;
                    while (true) {
                        i21 = i30 + 1;
                        charAt11 = zzcr.charAt(i30);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c13 |= (charAt11 & 8191) << i31;
                        i31 += 13;
                        i30 = i21;
                    }
                    charAt18 = c13 | (charAt11 << i31);
                    i30 = i21;
                }
                int i32 = i30 + 1;
                c3 = zzcr.charAt(i30);
                if (c3 >= 55296) {
                    char c14 = c3 & 8191;
                    int i33 = 13;
                    while (true) {
                        i20 = i32 + 1;
                        charAt10 = zzcr.charAt(i32);
                        if (charAt10 < 55296) {
                            break;
                        }
                        c14 |= (charAt10 & 8191) << i33;
                        i33 += 13;
                        i32 = i20;
                    }
                    c3 = c14 | (charAt10 << i33);
                    i32 = i20;
                }
                int i34 = i32 + 1;
                char charAt19 = zzcr.charAt(i32);
                if (charAt19 >= 55296) {
                    char c15 = charAt19 & 8191;
                    int i35 = 13;
                    while (true) {
                        i19 = i34 + 1;
                        charAt9 = zzcr.charAt(i34);
                        if (charAt9 < 55296) {
                            break;
                        }
                        c15 |= (charAt9 & 8191) << i35;
                        i35 += 13;
                        i34 = i19;
                    }
                    charAt19 = c15 | (charAt9 << i35);
                    i34 = i19;
                }
                int i36 = i34 + 1;
                c2 = zzcr.charAt(i34);
                if (c2 >= 55296) {
                    char c16 = c2 & 8191;
                    int i37 = 13;
                    while (true) {
                        i18 = i36 + 1;
                        charAt8 = zzcr.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c16 |= (charAt8 & 8191) << i37;
                        i37 += 13;
                        i36 = i18;
                    }
                    c2 = c16 | (charAt8 << i37);
                    i36 = i18;
                }
                int i38 = i36 + 1;
                char charAt20 = zzcr.charAt(i36);
                if (charAt20 >= 55296) {
                    char c17 = charAt20 & 8191;
                    int i39 = 13;
                    while (true) {
                        i17 = i38 + 1;
                        charAt7 = zzcr.charAt(i38);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c17 |= (charAt7 & 8191) << i39;
                        i39 += 13;
                        i38 = i17;
                    }
                    charAt20 = c17 | (charAt7 << i39);
                    i38 = i17;
                }
                int i40 = i38 + 1;
                char charAt21 = zzcr.charAt(i38);
                if (charAt21 >= 55296) {
                    char c18 = charAt21 & 8191;
                    int i41 = i40;
                    int i42 = 13;
                    while (true) {
                        i16 = i41 + 1;
                        charAt6 = zzcr.charAt(i41);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c18 |= (charAt6 & 8191) << i42;
                        i42 += 13;
                        i41 = i16;
                    }
                    charAt21 = c18 | (charAt6 << i42);
                    i14 = i16;
                } else {
                    i14 = i40;
                }
                int i43 = i14 + 1;
                char charAt22 = zzcr.charAt(i14);
                if (charAt22 >= 55296) {
                    char c19 = charAt22 & 8191;
                    int i44 = i43;
                    int i45 = 13;
                    while (true) {
                        i15 = i44 + 1;
                        charAt5 = zzcr.charAt(i44);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c19 |= (charAt5 & 8191) << i45;
                        i45 += 13;
                        i44 = i15;
                    }
                    charAt22 = c19 | (charAt5 << i45);
                    i43 = i15;
                }
                int i46 = (charAt17 << 1) + charAt18;
                c4 = charAt19;
                i2 = i46;
                c = charAt22;
                c9 = charAt17;
                i26 = i43;
                char c20 = charAt20;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                c5 = c20;
            }
            Unsafe unsafe = zzkr;
            Object[] zzcs2 = zzcx2.zzcs();
            Class<?> cls3 = zzcx2.zzcl().getClass();
            int i47 = i26;
            int[] iArr2 = new int[(c2 * 3)];
            Object[] objArr = new Object[(c2 << 1)];
            int i48 = c + c5;
            char c21 = c;
            int i49 = i47;
            int i50 = i48;
            int i51 = 0;
            int i52 = 0;
            while (i49 < length) {
                int i53 = i49 + 1;
                int charAt23 = zzcr.charAt(i49);
                int i54 = length;
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i53;
                    int i57 = 13;
                    while (true) {
                        i13 = i56 + 1;
                        charAt4 = zzcr.charAt(i56);
                        c6 = c;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i13;
                        c = c6;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i3 = i13;
                } else {
                    c6 = c;
                    i3 = i53;
                }
                int i58 = i3 + 1;
                char charAt24 = zzcr.charAt(i3);
                int i59 = i58;
                if (charAt24 >= 55296) {
                    char c22 = charAt24 & 8191;
                    int i60 = i59;
                    int i61 = 13;
                    while (true) {
                        i12 = i60 + 1;
                        charAt3 = zzcr.charAt(i60);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        c22 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i12;
                        z2 = z;
                    }
                    charAt24 = c22 | (charAt3 << i61);
                    i4 = i12;
                } else {
                    z = z2;
                    i4 = i59;
                }
                char c23 = charAt24 & 255;
                char c24 = c4;
                if ((charAt24 & 1024) != 0) {
                    iArr[i52] = i51;
                    i52++;
                }
                char c25 = c3;
                if (c23 >= '3') {
                    int i62 = i4 + 1;
                    char charAt25 = zzcr.charAt(i4);
                    char c26 = 55296;
                    if (charAt25 >= 55296) {
                        char c27 = charAt25 & 8191;
                        int i63 = 13;
                        while (true) {
                            i11 = i62 + 1;
                            charAt2 = zzcr.charAt(i62);
                            if (charAt2 < c26) {
                                break;
                            }
                            c27 |= (charAt2 & 8191) << i63;
                            i63 += 13;
                            i62 = i11;
                            c26 = 55296;
                        }
                        charAt25 = c27 | (charAt2 << i63);
                        i62 = i11;
                    }
                    int i64 = c23 - '3';
                    int i65 = i62;
                    if (i64 == 9 || i64 == 17) {
                        objArr[((i51 / 3) << 1) + 1] = zzcs2[i2];
                        i2++;
                    } else if (i64 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i51 / 3) << 1) + 1] = zzcs2[i2];
                        i2++;
                    }
                    int i66 = charAt25 << 1;
                    Object obj = zzcs2[i66];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zzb(cls3, (String) obj);
                        zzcs2[i66] = field2;
                    }
                    zzcx = zzcx2;
                    String str2 = zzcr;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    int i67 = i66 + 1;
                    Object obj2 = zzcs2[i67];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zzb(cls3, (String) obj2);
                        zzcs2[i67] = field3;
                    }
                    cls2 = cls3;
                    i5 = i2;
                    i4 = i65;
                    str = str2;
                    i6 = 0;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    i8 = objectFieldOffset;
                    c7 = c9;
                } else {
                    zzcx = zzcx2;
                    String str3 = zzcr;
                    int i68 = i2 + 1;
                    Field zzb = zzb(cls3, (String) zzcs2[i2]);
                    if (c23 == 9 || c23 == 17) {
                        c8 = 1;
                        objArr[((i51 / 3) << 1) + 1] = zzb.getType();
                    } else {
                        if (c23 == 27 || c23 == '1') {
                            c8 = 1;
                            i10 = i68 + 1;
                            objArr[((i51 / 3) << 1) + 1] = zzcs2[i68];
                        } else if (c23 == 12 || c23 == 30 || c23 == ',') {
                            c8 = 1;
                            if ((charAt15 & 1) == 1) {
                                i10 = i68 + 1;
                                objArr[((i51 / 3) << 1) + 1] = zzcs2[i68];
                            }
                        } else {
                            if (c23 == '2') {
                                int i69 = c21 + 1;
                                iArr[c21] = i51;
                                int i70 = (i51 / 3) << 1;
                                int i71 = i68 + 1;
                                objArr[i70] = zzcs2[i68];
                                if ((charAt24 & 2048) != 0) {
                                    i68 = i71 + 1;
                                    objArr[i70 + 1] = zzcs2[i71];
                                    c21 = i69;
                                } else {
                                    i68 = i71;
                                    c8 = 1;
                                    c21 = i69;
                                }
                            }
                            c8 = 1;
                        }
                        i68 = i10;
                    }
                    i8 = (int) unsafe.objectFieldOffset(zzb);
                    if ((charAt15 & 1) != c8) {
                        i5 = i68;
                        c7 = c9;
                        cls2 = cls3;
                        char c28 = c8;
                        str = str3;
                    } else if (c23 <= 17) {
                        int i72 = i4 + 1;
                        str = str3;
                        char charAt26 = str.charAt(i4);
                        if (charAt26 >= 55296) {
                            char c29 = charAt26 & 8191;
                            int i73 = 13;
                            while (true) {
                                i9 = i72 + 1;
                                charAt = str.charAt(i72);
                                if (charAt < 55296) {
                                    break;
                                }
                                c29 |= (charAt & 8191) << i73;
                                i73 += 13;
                                i72 = i9;
                            }
                            charAt26 = c29 | (charAt << i73);
                            i72 = i9;
                        }
                        int i74 = (c9 << 1) + (charAt26 / ' ');
                        Object obj3 = zzcs2[i74];
                        i5 = i68;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = zzb(cls3, (String) obj3);
                            zzcs2[i74] = field;
                        }
                        c7 = c9;
                        cls2 = cls3;
                        i6 = charAt26 % ' ';
                        i7 = (int) unsafe.objectFieldOffset(field);
                        i4 = i72;
                        if (c23 >= 18 && c23 <= '1') {
                            iArr[i50] = i8;
                            i50++;
                        }
                    } else {
                        i5 = i68;
                        c7 = c9;
                        cls2 = cls3;
                        str = str3;
                    }
                    i7 = 0;
                    i6 = 0;
                    iArr[i50] = i8;
                    i50++;
                }
                int i75 = i51 + 1;
                iArr2[i51] = charAt23;
                int i76 = i75 + 1;
                iArr2[i75] = i8 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | (c23 << 20);
                i51 = i76 + 1;
                iArr2[i76] = (i6 << 20) | i7;
                c9 = c7;
                zzcr = str;
                i49 = i4;
                cls3 = cls2;
                c4 = c24;
                length = i54;
                c = c6;
                z2 = z;
                c3 = c25;
                i2 = i5;
                zzcx2 = zzcx;
            }
            char c30 = c4;
            boolean z3 = z2;
            return new zzco(iArr2, objArr, c3, c4, zzcx2.zzcl(), z2, false, iArr, c, i48, zzcs, zzbu, zzds, zzar, zzcd);
        }
        ((zzdl) zzci2).zzcj();
        int i77 = zzbc.zze.zziu;
        throw new NoSuchMethodError();
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    public final T newInstance() {
        return this.zzle.newInstance(this.zzkw);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzm(r10, r6) == com.google.android.gms.internal.places.zzdy.zzm(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.places.zzdy.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.places.zzdy.zzn(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.places.zzdy.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.places.zzdy.zzo(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzks
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.zzai(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.zzaj(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r10, r4)
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.places.zzdy.zzm(r10, r6)
            boolean r5 = com.google.android.gms.internal.places.zzdy.zzm(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.places.zzdy.zzn(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.places.zzdy.zzn(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.places.zzdy.zzo(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.places.zzdy.zzo(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = r1
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r9.zzlg
            java.lang.Object r0 = r0.zzr(r10)
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r9.zzlg
            java.lang.Object r2 = r2.zzr(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.zzkx
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.places.zzar<?> r0 = r9.zzlh
            com.google.android.gms.internal.places.zzav r10 = r0.zzb((java.lang.Object) r10)
            com.google.android.gms.internal.places.zzar<?> r0 = r9.zzlh
            com.google.android.gms.internal.places.zzav r11 = r0.zzb((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode(T r10) {
        /*
            r9 = this;
            int[] r0 = r9.zzks
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r9.zzai(r1)
            int[] r4 = r9.zzks
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 37
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r8
            int r3 = r3 >>> 20
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r10, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r10, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r10, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r10, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = zzj(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zze((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r10, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r10, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = zzg(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r9.zzb(r10, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = zzf(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r10, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r10, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r10, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r10, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.places.zzdy.zzm(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zze((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r10, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r10, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r10, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.places.zzdy.zzn(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.places.zzdy.zzo(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r9.zzlg
            java.lang.Object r0 = r0.zzr(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.zzkx
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.places.zzar<?> r0 = r9.zzlh
            com.google.android.gms.internal.places.zzav r10 = r0.zzb((java.lang.Object) r10)
            int r10 = r10.hashCode()
            int r2 = r2 + r10
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.hashCode(java.lang.Object):int");
    }

    public final void zzd(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzks.length; i += 3) {
                int zzai = zzai(i);
                long j = (long) (1048575 & zzai);
                int i2 = this.zzks[i];
                switch ((zzai & 267386880) >>> 20) {
                    case 0:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzo(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 1:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzn(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 2:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 3:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 4:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 5:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 6:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 7:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzm(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 8:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 9:
                        zzb(t, t2, i);
                        break;
                    case 10:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 11:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 12:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 13:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 14:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 15:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 16:
                        if (!zzb(t2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                            zzc(t, i);
                            break;
                        }
                    case 17:
                        zzb(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzlf.zzb(t, t2, j);
                        break;
                    case 50:
                        zzdc.zzb(this.zzli, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzb(t2, i2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                            zzc(t, i2, i);
                            break;
                        }
                    case 60:
                        zzc(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzb(t2, i2, i)) {
                            break;
                        } else {
                            zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                            zzc(t, i2, i);
                            break;
                        }
                    case 68:
                        zzc(t, t2, i);
                        break;
                }
            }
            if (!this.zzkz) {
                zzdc.zzb(this.zzlg, t, t2);
                if (this.zzkx) {
                    zzdc.zzb(this.zzlh, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    private final void zzb(T t, T t2, int i) {
        long zzai = (long) (zzai(i) & 1048575);
        if (zzb(t2, i)) {
            Object zzp = zzdy.zzp(t, zzai);
            Object zzp2 = zzdy.zzp(t2, zzai);
            if (zzp != null && zzp2 != null) {
                zzdy.zzb((Object) t, zzai, zzbd.zzb(zzp, zzp2));
                zzc(t, i);
            } else if (zzp2 != null) {
                zzdy.zzb((Object) t, zzai, zzp2);
                zzc(t, i);
            }
        }
    }

    private final void zzc(T t, T t2, int i) {
        int zzai = zzai(i);
        int i2 = this.zzks[i];
        long j = (long) (zzai & 1048575);
        if (zzb(t2, i2, i)) {
            Object zzp = zzdy.zzp(t, j);
            Object zzp2 = zzdy.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzdy.zzb((Object) t, j, zzbd.zzb(zzp, zzp2));
                zzc(t, i2, i);
            } else if (zzp2 != null) {
                zzdy.zzb((Object) t, j, zzp2);
                zzc(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x083a, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0907, code lost:
        r6 = r6 + r4;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x095c, code lost:
        r6 = r6 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x09bf, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x09d0, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a12, code lost:
        r6 = r6 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a37, code lost:
        r5 = r5 + 3;
        r8 = r4;
        r11 = r10;
        r9 = r13;
        r7 = 1048575;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzn(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.zzkz
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04fb
            sun.misc.Unsafe r2 = zzkr
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.zzks
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04f3
            int r14 = r0.zzai(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.zzks
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.places.zzaw r14 = com.google.android.gms.internal.places.zzaw.DOUBLE_LIST_PACKED
            int r14 = r14.mo6271id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.places.zzaw r14 = com.google.android.gms.internal.places.zzaw.SINT64_LIST_PACKED
            int r14 = r14.mo6271id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.zzks
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04e0;
                case 1: goto L_0x04d5;
                case 2: goto L_0x04c6;
                case 3: goto L_0x04b7;
                case 4: goto L_0x04a8;
                case 5: goto L_0x049d;
                case 6: goto L_0x0492;
                case 7: goto L_0x0487;
                case 8: goto L_0x046a;
                case 9: goto L_0x0456;
                case 10: goto L_0x0444;
                case 11: goto L_0x0434;
                case 12: goto L_0x0424;
                case 13: goto L_0x0418;
                case 14: goto L_0x040c;
                case 15: goto L_0x03fc;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d6;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03c2;
                case 20: goto L_0x03b8;
                case 21: goto L_0x03ae;
                case 22: goto L_0x03a4;
                case 23: goto L_0x039a;
                case 24: goto L_0x0390;
                case 25: goto L_0x0386;
                case 26: goto L_0x037c;
                case 27: goto L_0x036e;
                case 28: goto L_0x0364;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04ed
        L_0x0047:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            com.google.android.gms.internal.places.zzck r5 = (com.google.android.gms.internal.places.zzck) r5
            com.google.android.gms.internal.places.zzda r6 = r0.zzaf(r12)
            int r3 = com.google.android.gms.internal.places.zzaj.zzd(r3, r5, r6)
            goto L_0x04ec
        L_0x005d:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzg((int) r3, (long) r5)
            goto L_0x04ec
        L_0x006d:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzj(r3, r5)
            goto L_0x04ec
        L_0x007d:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r3, (long) r9)
            goto L_0x04ec
        L_0x0089:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzl(r3, r11)
            goto L_0x04ec
        L_0x0095:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzm(r3, r5)
            goto L_0x04ec
        L_0x00a5:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r3, (int) r5)
            goto L_0x04ec
        L_0x00b5:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r3, (com.google.android.gms.internal.places.zzw) r5)
            goto L_0x04ec
        L_0x00c7:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.zzaf(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.places.zzda) r6)
            goto L_0x04ec
        L_0x00db:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.places.zzw
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r3, (com.google.android.gms.internal.places.zzw) r5)
            goto L_0x04ec
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r3, (java.lang.String) r5)
            goto L_0x04ec
        L_0x00f9:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r3, (boolean) r8)
            goto L_0x04ec
        L_0x0105:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzk(r3, r11)
            goto L_0x04ec
        L_0x0111:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r3, (long) r9)
            goto L_0x04ec
        L_0x011d:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r3, (int) r5)
            goto L_0x04ec
        L_0x012d:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzf((int) r3, (long) r5)
            goto L_0x04ec
        L_0x013d:
            boolean r14 = r0.zzb(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zze((int) r3, (long) r5)
            goto L_0x04ec
        L_0x014d:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r3, (float) r4)
            goto L_0x04ec
        L_0x0159:
            boolean r5 = r0.zzb(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04ed
            r5 = 0
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r3, (double) r5)
            goto L_0x04ec
        L_0x0167:
            com.google.android.gms.internal.places.zzcd r14 = r0.zzli
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            java.lang.Object r6 = r0.zzag(r12)
            int r3 = r14.zzc(r3, r5, r6)
            goto L_0x04ec
        L_0x0177:
            java.util.List r5 = zze(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.zzaf(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.zze(r3, r5, r6)
            goto L_0x04ec
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzg((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzk(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzm(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzl(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzh(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzj(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzn(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzl(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzm(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzi(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzf((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zze(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzl(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.zzm(r5)
            if (r5 <= 0) goto L_0x04ed
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.places.zzaj.zzr(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.zzt(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x04ec
        L_0x0328:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzr(r3, r5, r11)
            goto L_0x04ec
        L_0x0332:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzv(r3, r5, r11)
            goto L_0x04ec
        L_0x033c:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzx(r3, r5, r11)
            goto L_0x04ec
        L_0x0346:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzw(r3, r5, r11)
            goto L_0x04ec
        L_0x0350:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzs(r3, r5, r11)
            goto L_0x04ec
        L_0x035a:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzu(r3, r5, r11)
            goto L_0x04ec
        L_0x0364:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zze((int) r3, (java.util.List<com.google.android.gms.internal.places.zzw>) r5)
            goto L_0x04ec
        L_0x036e:
            java.util.List r5 = zze(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.zzaf(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.places.zzda) r6)
            goto L_0x04ec
        L_0x037c:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd(r3, r5)
            goto L_0x04ec
        L_0x0386:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzy(r3, r5, r11)
            goto L_0x04ec
        L_0x0390:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzw(r3, r5, r11)
            goto L_0x04ec
        L_0x039a:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzx(r3, r5, r11)
            goto L_0x04ec
        L_0x03a4:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzt(r3, r5, r11)
            goto L_0x04ec
        L_0x03ae:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzq(r3, r5, r11)
            goto L_0x04ec
        L_0x03b8:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzp(r3, r5, r11)
            goto L_0x04ec
        L_0x03c2:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzw(r3, r5, r11)
            goto L_0x04ec
        L_0x03cc:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.zzx(r3, r5, r11)
            goto L_0x04ec
        L_0x03d6:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            com.google.android.gms.internal.places.zzck r5 = (com.google.android.gms.internal.places.zzck) r5
            com.google.android.gms.internal.places.zzda r6 = r0.zzaf(r12)
            int r3 = com.google.android.gms.internal.places.zzaj.zzd(r3, r5, r6)
            goto L_0x04ec
        L_0x03ec:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = com.google.android.gms.internal.places.zzdy.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzg((int) r3, (long) r5)
            goto L_0x04ec
        L_0x03fc:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzj(r3, r5)
            goto L_0x04ec
        L_0x040c:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r3, (long) r9)
            goto L_0x04ec
        L_0x0418:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzl(r3, r11)
            goto L_0x04ec
        L_0x0424:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzm(r3, r5)
            goto L_0x04ec
        L_0x0434:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r3, (int) r5)
            goto L_0x04ec
        L_0x0444:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r3, (com.google.android.gms.internal.places.zzw) r5)
            goto L_0x04ec
        L_0x0456:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.zzaf(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.places.zzda) r6)
            goto L_0x04ec
        L_0x046a:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.places.zzw
            if (r6 == 0) goto L_0x0480
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r3, (com.google.android.gms.internal.places.zzw) r5)
            goto L_0x04ec
        L_0x0480:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r3, (java.lang.String) r5)
            goto L_0x04ec
        L_0x0487:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r3, (boolean) r8)
            goto L_0x04ec
        L_0x0492:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzk(r3, r11)
            goto L_0x04ec
        L_0x049d:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r3, (long) r9)
            goto L_0x04ec
        L_0x04a8:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r3, (int) r5)
            goto L_0x04ec
        L_0x04b7:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = com.google.android.gms.internal.places.zzdy.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zzf((int) r3, (long) r5)
            goto L_0x04ec
        L_0x04c6:
            boolean r14 = r0.zzb(r1, (int) r12)
            if (r14 == 0) goto L_0x04ed
            long r5 = com.google.android.gms.internal.places.zzdy.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.zze((int) r3, (long) r5)
            goto L_0x04ec
        L_0x04d5:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r3, (float) r4)
            goto L_0x04ec
        L_0x04e0:
            boolean r5 = r0.zzb(r1, (int) r12)
            if (r5 == 0) goto L_0x04ed
            r5 = 0
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r3, (double) r5)
        L_0x04ec:
            int r13 = r13 + r3
        L_0x04ed:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04f3:
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r0.zzlg
            int r1 = zzb(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04fb:
            sun.misc.Unsafe r2 = zzkr
            r3 = -1
            r5 = r11
            r6 = r5
            r12 = r6
        L_0x0501:
            int[] r13 = r0.zzks
            int r13 = r13.length
            if (r5 >= r13) goto L_0x0a42
            int r13 = r0.zzai(r5)
            int[] r14 = r0.zzks
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x052b
            int r11 = r5 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r18 = r11 >>> 20
            int r18 = r8 << r18
            if (r14 == r3) goto L_0x054b
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            r3 = r14
            goto L_0x054b
        L_0x052b:
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0547
            com.google.android.gms.internal.places.zzaw r8 = com.google.android.gms.internal.places.zzaw.DOUBLE_LIST_PACKED
            int r8 = r8.mo6271id()
            if (r4 < r8) goto L_0x0547
            com.google.android.gms.internal.places.zzaw r8 = com.google.android.gms.internal.places.zzaw.SINT64_LIST_PACKED
            int r8 = r8.mo6271id()
            if (r4 > r8) goto L_0x0547
            int[] r8 = r0.zzks
            int r9 = r5 + 2
            r8 = r8[r9]
            r8 = r8 & r7
            goto L_0x0548
        L_0x0547:
            r8 = 0
        L_0x0548:
            r11 = r8
            r18 = 0
        L_0x054b:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0a24;
                case 1: goto L_0x0a15;
                case 2: goto L_0x0a02;
                case 3: goto L_0x09f1;
                case 4: goto L_0x09e0;
                case 5: goto L_0x09d3;
                case 6: goto L_0x09c3;
                case 7: goto L_0x09b3;
                case 8: goto L_0x0998;
                case 9: goto L_0x0987;
                case 10: goto L_0x0978;
                case 11: goto L_0x096b;
                case 12: goto L_0x095e;
                case 13: goto L_0x0953;
                case 14: goto L_0x0948;
                case 15: goto L_0x093a;
                case 16: goto L_0x092c;
                case 17: goto L_0x0918;
                case 18: goto L_0x090b;
                case 19: goto L_0x08fc;
                case 20: goto L_0x08f0;
                case 21: goto L_0x08e4;
                case 22: goto L_0x08d8;
                case 23: goto L_0x08cc;
                case 24: goto L_0x08c0;
                case 25: goto L_0x08b4;
                case 26: goto L_0x08a8;
                case 27: goto L_0x0898;
                case 28: goto L_0x088c;
                case 29: goto L_0x087f;
                case 30: goto L_0x0872;
                case 31: goto L_0x0865;
                case 32: goto L_0x0858;
                case 33: goto L_0x084b;
                case 34: goto L_0x083e;
                case 35: goto L_0x081e;
                case 36: goto L_0x0801;
                case 37: goto L_0x07e4;
                case 38: goto L_0x07c7;
                case 39: goto L_0x07a9;
                case 40: goto L_0x078b;
                case 41: goto L_0x076d;
                case 42: goto L_0x074f;
                case 43: goto L_0x0731;
                case 44: goto L_0x0713;
                case 45: goto L_0x06f5;
                case 46: goto L_0x06d7;
                case 47: goto L_0x06b9;
                case 48: goto L_0x069b;
                case 49: goto L_0x068b;
                case 50: goto L_0x067b;
                case 51: goto L_0x066d;
                case 52: goto L_0x0660;
                case 53: goto L_0x0650;
                case 54: goto L_0x0640;
                case 55: goto L_0x0630;
                case 56: goto L_0x0622;
                case 57: goto L_0x0615;
                case 58: goto L_0x0608;
                case 59: goto L_0x05ea;
                case 60: goto L_0x05d6;
                case 61: goto L_0x05c4;
                case 62: goto L_0x05b4;
                case 63: goto L_0x05a4;
                case 64: goto L_0x0597;
                case 65: goto L_0x0589;
                case 66: goto L_0x0579;
                case 67: goto L_0x0569;
                case 68: goto L_0x0553;
                default: goto L_0x0551;
            }
        L_0x0551:
            goto L_0x09be
        L_0x0553:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.places.zzck r4 = (com.google.android.gms.internal.places.zzck) r4
            com.google.android.gms.internal.places.zzda r8 = r0.zzaf(r5)
            int r4 = com.google.android.gms.internal.places.zzaj.zzd(r15, r4, r8)
            goto L_0x09b1
        L_0x0569:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            long r8 = zzi(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzg((int) r15, (long) r8)
            goto L_0x09b1
        L_0x0579:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            int r4 = zzh(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzj(r15, r4)
            goto L_0x09b1
        L_0x0589:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.zzi((int) r15, (long) r8)
            goto L_0x09b1
        L_0x0597:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.zzl(r15, r4)
            goto L_0x095c
        L_0x05a4:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            int r4 = zzh(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzm(r15, r4)
            goto L_0x09b1
        L_0x05b4:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            int r4 = zzh(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzi((int) r15, (int) r4)
            goto L_0x09b1
        L_0x05c4:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.zzd((int) r15, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x09b1
        L_0x05d6:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.places.zzda r8 = r0.zzaf(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.zzd((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r8)
            goto L_0x09b1
        L_0x05ea:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.places.zzw
            if (r8 == 0) goto L_0x0600
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.zzd((int) r15, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x09b1
        L_0x0600:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.places.zzaj.zzc((int) r15, (java.lang.String) r4)
            goto L_0x09b1
        L_0x0608:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r4 = 1
            int r8 = com.google.android.gms.internal.places.zzaj.zzd((int) r15, (boolean) r4)
            goto L_0x095c
        L_0x0615:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.zzk(r15, r4)
            goto L_0x095c
        L_0x0622:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.zzh((int) r15, (long) r8)
            goto L_0x09b1
        L_0x0630:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            int r4 = zzh(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzh((int) r15, (int) r4)
            goto L_0x09b1
        L_0x0640:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            long r8 = zzi(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzf((int) r15, (long) r8)
            goto L_0x09b1
        L_0x0650:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            long r8 = zzi(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zze((int) r15, (long) r8)
            goto L_0x09b1
        L_0x0660:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.zzc((int) r15, (float) r4)
            goto L_0x095c
        L_0x066d:
            boolean r4 = r0.zzb(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x09be
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.zzc((int) r15, (double) r8)
            goto L_0x09b1
        L_0x067b:
            com.google.android.gms.internal.places.zzcd r4 = r0.zzli
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.zzag(r5)
            int r4 = r4.zzc(r15, r8, r9)
            goto L_0x09b1
        L_0x068b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.places.zzda r8 = r0.zzaf(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.zze(r15, r4, r8)
            goto L_0x09b1
        L_0x069b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzg((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x06af
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06af:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x06b9:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzk(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x06cd
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06cd:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x06d7:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzm(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x06eb
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06eb:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x06f5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzl(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0709
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0709:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x0713:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzh(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0727
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0727:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x0731:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzj(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0745
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0745:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x074f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzn(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0763
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0763:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x076d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzl(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0781
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0781:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x078b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzm(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x079f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x079f:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x07a9:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzi(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x07bd
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07bd:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x07c7:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzf((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x07db
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07db:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x07e4:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zze(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x07f8
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07f8:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x0801:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzl(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0815
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0815:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
            goto L_0x083a
        L_0x081e:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzm(r4)
            if (r4 <= 0) goto L_0x09be
            boolean r8 = r0.zzla
            if (r8 == 0) goto L_0x0832
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0832:
            int r8 = com.google.android.gms.internal.places.zzaj.zzr(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.zzt(r4)
        L_0x083a:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x095c
        L_0x083e:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.places.zzdc.zzr(r15, r4, r10)
            goto L_0x0907
        L_0x084b:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzv(r15, r4, r10)
            goto L_0x0907
        L_0x0858:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzx(r15, r4, r10)
            goto L_0x0907
        L_0x0865:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzw(r15, r4, r10)
            goto L_0x0907
        L_0x0872:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzs(r15, r4, r10)
            goto L_0x0907
        L_0x087f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzu(r15, r4, r10)
            goto L_0x09b1
        L_0x088c:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zze((int) r15, (java.util.List<com.google.android.gms.internal.places.zzw>) r4)
            goto L_0x09b1
        L_0x0898:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.places.zzda r8 = r0.zzaf(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.zzd((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.places.zzda) r8)
            goto L_0x09b1
        L_0x08a8:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzd(r15, r4)
            goto L_0x09b1
        L_0x08b4:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.places.zzdc.zzy(r15, r4, r10)
            goto L_0x0907
        L_0x08c0:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzw(r15, r4, r10)
            goto L_0x0907
        L_0x08cc:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzx(r15, r4, r10)
            goto L_0x0907
        L_0x08d8:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzt(r15, r4, r10)
            goto L_0x0907
        L_0x08e4:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzq(r15, r4, r10)
            goto L_0x0907
        L_0x08f0:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzp(r15, r4, r10)
            goto L_0x0907
        L_0x08fc:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzw(r15, r4, r10)
        L_0x0907:
            int r6 = r6 + r4
            r4 = 1
            goto L_0x09ce
        L_0x090b:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.zzx(r15, r4, r10)
            goto L_0x09b1
        L_0x0918:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.places.zzck r4 = (com.google.android.gms.internal.places.zzck) r4
            com.google.android.gms.internal.places.zzda r8 = r0.zzaf(r5)
            int r4 = com.google.android.gms.internal.places.zzaj.zzd(r15, r4, r8)
            goto L_0x09b1
        L_0x092c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzg((int) r15, (long) r8)
            goto L_0x09b1
        L_0x093a:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzj(r15, r4)
            goto L_0x09b1
        L_0x0948:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.zzi((int) r15, (long) r8)
            goto L_0x09b1
        L_0x0953:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.zzl(r15, r4)
        L_0x095c:
            int r6 = r6 + r8
            goto L_0x09be
        L_0x095e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzm(r15, r4)
            goto L_0x09b1
        L_0x096b:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.places.zzaj.zzi((int) r15, (int) r4)
            goto L_0x09b1
        L_0x0978:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.zzd((int) r15, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x09b1
        L_0x0987:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.places.zzda r8 = r0.zzaf(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.zzd((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r8)
            goto L_0x09b1
        L_0x0998:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.places.zzw
            if (r8 == 0) goto L_0x09ab
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.zzd((int) r15, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x09b1
        L_0x09ab:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.places.zzaj.zzc((int) r15, (java.lang.String) r4)
        L_0x09b1:
            int r6 = r6 + r4
            goto L_0x09be
        L_0x09b3:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x09be
            r4 = 1
            int r8 = com.google.android.gms.internal.places.zzaj.zzd((int) r15, (boolean) r4)
            int r6 = r6 + r8
            goto L_0x09bf
        L_0x09be:
            r4 = 1
        L_0x09bf:
            r7 = 0
            r10 = 0
            goto L_0x09d0
        L_0x09c3:
            r4 = 1
            r8 = r12 & r18
            r10 = 0
            if (r8 == 0) goto L_0x09ce
            int r8 = com.google.android.gms.internal.places.zzaj.zzk(r15, r10)
            int r6 = r6 + r8
        L_0x09ce:
            r7 = 0
        L_0x09d0:
            r13 = 0
            goto L_0x0a37
        L_0x09d3:
            r4 = 1
            r10 = 0
            r8 = r12 & r18
            r13 = 0
            if (r8 == 0) goto L_0x0a13
            int r8 = com.google.android.gms.internal.places.zzaj.zzh((int) r15, (long) r13)
            goto L_0x0a12
        L_0x09e0:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a13
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.places.zzaj.zzh((int) r15, (int) r8)
            goto L_0x0a12
        L_0x09f1:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a13
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.places.zzaj.zzf((int) r15, (long) r8)
            goto L_0x0a12
        L_0x0a02:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a13
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.places.zzaj.zze((int) r15, (long) r8)
        L_0x0a12:
            int r6 = r6 + r8
        L_0x0a13:
            r8 = 0
            goto L_0x0a35
        L_0x0a15:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r18
            if (r8 == 0) goto L_0x0a13
            r8 = 0
            int r9 = com.google.android.gms.internal.places.zzaj.zzc((int) r15, (float) r8)
            int r6 = r6 + r9
            goto L_0x0a35
        L_0x0a24:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a35
            r7 = 0
            int r11 = com.google.android.gms.internal.places.zzaj.zzc((int) r15, (double) r7)
            int r6 = r6 + r11
            goto L_0x0a37
        L_0x0a35:
            r7 = 0
        L_0x0a37:
            int r5 = r5 + 3
            r8 = r4
            r11 = r10
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0501
        L_0x0a42:
            r10 = r11
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r0.zzlg
            int r2 = zzb(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.zzkx
            if (r2 == 0) goto L_0x0a9c
            com.google.android.gms.internal.places.zzar<?> r2 = r0.zzlh
            com.google.android.gms.internal.places.zzav r1 = r2.zzb((java.lang.Object) r1)
            r11 = r10
        L_0x0a55:
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r2 = r1.zzfj
            int r2 = r2.zzcu()
            if (r11 >= r2) goto L_0x0a75
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r2 = r1.zzfj
            java.util.Map$Entry r2 = r2.zzam(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.places.zzax r3 = (com.google.android.gms.internal.places.zzax) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.places.zzav.zzc((com.google.android.gms.internal.places.zzax<?>) r3, (java.lang.Object) r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0a55
        L_0x0a75:
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r1.zzfj
            java.lang.Iterable r1 = r1.zzcv()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a7f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a9b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.places.zzax r3 = (com.google.android.gms.internal.places.zzax) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.places.zzav.zzc((com.google.android.gms.internal.places.zzax<?>) r3, (java.lang.Object) r2)
            int r10 = r10 + r2
            goto L_0x0a7f
        L_0x0a9b:
            int r6 = r6 + r10
        L_0x0a9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzn(java.lang.Object):int");
    }

    private static <UT, UB> int zzb(zzds<UT, UB> zzds, T t) {
        return zzds.zzn(zzds.zzr(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzdy.zzp(obj, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(T r14, com.google.android.gms.internal.places.zzel r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zzam()
            int r1 = com.google.android.gms.internal.places.zzbc.zze.zzix
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r13.zzlg
            zzb(r0, r14, (com.google.android.gms.internal.places.zzel) r15)
            boolean r0 = r13.zzkx
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.places.zzar<?> r0 = r13.zzlh
            com.google.android.gms.internal.places.zzav r0 = r0.zzb((java.lang.Object) r14)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r0.zzfj
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.zzks
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.zzai(r7)
            int[] r9 = r13.zzks
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.places.zzar<?> r10 = r13.zzlh
            int r10 = r10.zzb((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.places.zzar<?> r10 = r13.zzlh
            r10.zzb(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzc((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzc((int) r9, (long) r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzk(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzn(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzo(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzw r8 = (com.google.android.gms.internal.places.zzw) r8
            r15.zzb((int) r9, (com.google.android.gms.internal.places.zzw) r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzj(r14, r10)
            r15.zzc((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzg(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzd((int) r9, (long) r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzd((int) r9, (int) r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzg(r14, r10)
            r15.zzb((int) r9, (float) r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzf(r14, r10)
            r15.zzb((int) r9, (double) r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            r13.zzb((com.google.android.gms.internal.places.zzel) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            com.google.android.gms.internal.places.zzdc.zzc((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzf(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzk(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzh(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzm(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzn(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzj(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzo(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzl(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzg(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzi(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zze(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzd(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzc((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzf(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzk(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzh(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzm(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzn(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzj(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzc(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzo(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzl(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzg(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzi(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zze(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzd(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzc((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzc((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzc((int) r9, (long) r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzk(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzn(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzo(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzw r8 = (com.google.android.gms.internal.places.zzw) r8
            r15.zzb((int) r9, (com.google.android.gms.internal.places.zzw) r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.places.zzdy.zzm(r14, r10)
            r15.zzc((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzg(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzd((int) r9, (long) r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzd((int) r9, (int) r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.places.zzdy.zzn(r14, r10)
            r15.zzb((int) r9, (float) r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.places.zzdy.zzo(r14, r10)
            r15.zzb((int) r9, (double) r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.places.zzar<?> r14 = r13.zzlh
            r14.zzb(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            r1 = r14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.zzkz
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.zzkx
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.places.zzar<?> r0 = r13.zzlh
            com.google.android.gms.internal.places.zzav r0 = r0.zzb((java.lang.Object) r14)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r0.zzfj
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.zzks
            int r7 = r7.length
            r8 = r5
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.zzai(r8)
            int[] r10 = r13.zzks
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.places.zzar<?> r11 = r13.zzlh
            int r11 = r11.zzb((java.util.Map.Entry<?, ?>) r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.places.zzar<?> r11 = r13.zzlh
            r11.zzb(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzc((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzc((int) r10, (long) r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzk(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzn(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzo(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzw r9 = (com.google.android.gms.internal.places.zzw) r9
            r15.zzb((int) r10, (com.google.android.gms.internal.places.zzw) r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzj(r14, r11)
            r15.zzc((int) r10, (boolean) r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzg(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzd((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzd((int) r10, (int) r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzg(r14, r11)
            r15.zzb((int) r10, (float) r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzf(r14, r11)
            r15.zzb((int) r10, (double) r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            r13.zzb((com.google.android.gms.internal.places.zzel) r15, (int) r10, (java.lang.Object) r9, (int) r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            com.google.android.gms.internal.places.zzdc.zzc((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzf(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzo(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzf(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzo(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzc((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzc((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzk(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzn(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzo(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzw r9 = (com.google.android.gms.internal.places.zzw) r9
            r15.zzb((int) r10, (com.google.android.gms.internal.places.zzw) r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.places.zzdy.zzm(r14, r11)
            r15.zzc((int) r10, (boolean) r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzg(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzd((int) r10, (long) r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzd((int) r10, (int) r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.places.zzdy.zzn(r14, r11)
            r15.zzb((int) r10, (float) r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.places.zzdy.zzo(r14, r11)
            r15.zzb((int) r10, (double) r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.places.zzar<?> r2 = r13.zzlh
            r2.zzb(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r13.zzlg
            zzb(r0, r14, (com.google.android.gms.internal.places.zzel) r15)
            return
        L_0x0a44:
            r13.zzc(r14, (com.google.android.gms.internal.places.zzel) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, com.google.android.gms.internal.places.zzel):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(T r19, com.google.android.gms.internal.places.zzel r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.zzkx
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.places.zzar<?> r3 = r0.zzlh
            com.google.android.gms.internal.places.zzav r3 = r3.zzb((java.lang.Object) r1)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r5 = r3.zzfj
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.zzks
            int r7 = r7.length
            sun.misc.Unsafe r8 = zzkr
            r10 = 0
            r11 = 0
        L_0x002d:
            if (r10 >= r7) goto L_0x0494
            int r12 = r0.zzai(r10)
            int[] r13 = r0.zzks
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.zzkz
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005d
            r4 = 17
            if (r15 > r4) goto L_0x005d
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0057
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0060
        L_0x005d:
            r17 = r10
            r4 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.places.zzar<?> r9 = r0.zzlh
            int r9 = r9.zzb((java.util.Map.Entry<?, ?>) r5)
            if (r9 > r14) goto L_0x007e
            com.google.android.gms.internal.places.zzar<?> r9 = r0.zzlh
            r9.zzb(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0060
        L_0x007c:
            r5 = 0
            goto L_0x0060
        L_0x007e:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0485;
                case 1: goto L_0x0479;
                case 2: goto L_0x046d;
                case 3: goto L_0x0461;
                case 4: goto L_0x0455;
                case 5: goto L_0x0449;
                case 6: goto L_0x043d;
                case 7: goto L_0x0431;
                case 8: goto L_0x0425;
                case 9: goto L_0x0414;
                case 10: goto L_0x0405;
                case 11: goto L_0x03f8;
                case 12: goto L_0x03eb;
                case 13: goto L_0x03de;
                case 14: goto L_0x03d1;
                case 15: goto L_0x03c4;
                case 16: goto L_0x03b7;
                case 17: goto L_0x03a6;
                case 18: goto L_0x0396;
                case 19: goto L_0x0386;
                case 20: goto L_0x0376;
                case 21: goto L_0x0366;
                case 22: goto L_0x0356;
                case 23: goto L_0x0346;
                case 24: goto L_0x0336;
                case 25: goto L_0x0326;
                case 26: goto L_0x0317;
                case 27: goto L_0x0304;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c5;
                case 32: goto L_0x02b5;
                case 33: goto L_0x02a5;
                case 34: goto L_0x0295;
                case 35: goto L_0x0285;
                case 36: goto L_0x0275;
                case 37: goto L_0x0265;
                case 38: goto L_0x0255;
                case 39: goto L_0x0245;
                case 40: goto L_0x0235;
                case 41: goto L_0x0225;
                case 42: goto L_0x0215;
                case 43: goto L_0x0205;
                case 44: goto L_0x01f5;
                case 45: goto L_0x01e5;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01c5;
                case 48: goto L_0x01b5;
                case 49: goto L_0x01a2;
                case 50: goto L_0x0199;
                case 51: goto L_0x018a;
                case 52: goto L_0x017b;
                case 53: goto L_0x016c;
                case 54: goto L_0x015d;
                case 55: goto L_0x014e;
                case 56: goto L_0x013f;
                case 57: goto L_0x0130;
                case 58: goto L_0x0121;
                case 59: goto L_0x0112;
                case 60: goto L_0x00ff;
                case 61: goto L_0x00ef;
                case 62: goto L_0x00e1;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c5;
                case 65: goto L_0x00b7;
                case 66: goto L_0x00a9;
                case 67: goto L_0x009b;
                case 68: goto L_0x0089;
                default: goto L_0x0086;
            }
        L_0x0086:
            r13 = 0
            goto L_0x0490
        L_0x0089:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzc((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0086
        L_0x009b:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzc((int) r14, (long) r9)
            goto L_0x0086
        L_0x00a9:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x0086
        L_0x00b7:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzk(r14, r9)
            goto L_0x0086
        L_0x00c5:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzn(r14, r4)
            goto L_0x0086
        L_0x00d3:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzo(r14, r4)
            goto L_0x0086
        L_0x00e1:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zze(r14, r4)
            goto L_0x0086
        L_0x00ef:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            r2.zzb((int) r14, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x0086
        L_0x00ff:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0086
        L_0x0112:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzel) r2)
            goto L_0x0086
        L_0x0121:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            boolean r4 = zzj(r1, r9)
            r2.zzc((int) r14, (boolean) r4)
            goto L_0x0086
        L_0x0130:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzg(r14, r4)
            goto L_0x0086
        L_0x013f:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzd((int) r14, (long) r9)
            goto L_0x0086
        L_0x014e:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzd((int) r14, (int) r4)
            goto L_0x0086
        L_0x015d:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x0086
        L_0x016c:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x0086
        L_0x017b:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            float r4 = zzg(r1, r9)
            r2.zzb((int) r14, (float) r4)
            goto L_0x0086
        L_0x018a:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            double r9 = zzf(r1, r9)
            r2.zzb((int) r14, (double) r9)
            goto L_0x0086
        L_0x0199:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.zzb((com.google.android.gms.internal.places.zzel) r2, (int) r14, (java.lang.Object) r4, (int) r12)
            goto L_0x0086
        L_0x01a2:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r10 = r0.zzaf(r12)
            com.google.android.gms.internal.places.zzdc.zzc((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r2, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x0086
        L_0x01b5:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.android.gms.internal.places.zzdc.zzf(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01c5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01d5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01e5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01f5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0205:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0215:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzo(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0225:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0235:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0245:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0255:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0265:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0275:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0086
        L_0x0285:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0086
        L_0x0295:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.places.zzdc.zzf(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02a5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02b5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02c5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02d5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02e5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02f5:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc(r4, r9, r2)
            goto L_0x0086
        L_0x0304:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r10 = r0.zzaf(r12)
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r2, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x0086
        L_0x0317:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.places.zzel) r2)
            goto L_0x0086
        L_0x0326:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.places.zzdc.zzo(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0336:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0346:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0356:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0366:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0376:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0386:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0490
        L_0x0396:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0490
        L_0x03a6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzc((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0490
        L_0x03b7:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzc((int) r14, (long) r9)
            goto L_0x0490
        L_0x03c4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x0490
        L_0x03d1:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzk(r14, r9)
            goto L_0x0490
        L_0x03de:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzn(r14, r4)
            goto L_0x0490
        L_0x03eb:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzo(r14, r4)
            goto L_0x0490
        L_0x03f8:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zze(r14, r4)
            goto L_0x0490
        L_0x0405:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            r2.zzb((int) r14, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x0490
        L_0x0414:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0490
        L_0x0425:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzel) r2)
            goto L_0x0490
        L_0x0431:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            boolean r4 = com.google.android.gms.internal.places.zzdy.zzm(r1, r9)
            r2.zzc((int) r14, (boolean) r4)
            goto L_0x0490
        L_0x043d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzg(r14, r4)
            goto L_0x0490
        L_0x0449:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzd((int) r14, (long) r9)
            goto L_0x0490
        L_0x0455:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzd((int) r14, (int) r4)
            goto L_0x0490
        L_0x0461:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x0490
        L_0x046d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x0490
        L_0x0479:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            float r4 = com.google.android.gms.internal.places.zzdy.zzn(r1, r9)
            r2.zzb((int) r14, (float) r4)
            goto L_0x0490
        L_0x0485:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            double r9 = com.google.android.gms.internal.places.zzdy.zzo(r1, r9)
            r2.zzb((int) r14, (double) r9)
        L_0x0490:
            int r10 = r12 + 3
            goto L_0x002d
        L_0x0494:
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.places.zzar<?> r4 = r0.zzlh
            r4.zzb(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0494
        L_0x04a9:
            r5 = 0
            goto L_0x0494
        L_0x04ab:
            com.google.android.gms.internal.places.zzds<?, ?> r3 = r0.zzlg
            zzb(r3, r1, (com.google.android.gms.internal.places.zzel) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzc(java.lang.Object, com.google.android.gms.internal.places.zzel):void");
    }

    private final <K, V> void zzb(zzel zzel, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzel.zzb(i, this.zzli.zzl(zzag(i2)), this.zzli.zzh(obj));
        }
    }

    private static <UT, UB> void zzb(zzds<UT, UB> zzds, T t, zzel zzel) throws IOException {
        zzds.zzb(zzds.zzr(t), zzel);
    }

    private static zzdr zzo(Object obj) {
        zzbc zzbc = (zzbc) obj;
        zzdr zzdr = zzbc.zzih;
        if (zzdr != zzdr.zzdh()) {
            return zzdr;
        }
        zzdr zzdi = zzdr.zzdi();
        zzbc.zzih = zzdi;
        return zzdi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(byte[] r1, int r2, int r3, com.google.android.gms.internal.places.zzef r4, java.lang.Class<?> r5, com.google.android.gms.internal.places.zzr r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.places.zzcn.zzfi
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x009a;
                case 2: goto L_0x0095;
                case 3: goto L_0x0088;
                case 4: goto L_0x007b;
                case 5: goto L_0x007b;
                case 6: goto L_0x0070;
                case 7: goto L_0x0070;
                case 8: goto L_0x0065;
                case 9: goto L_0x0058;
                case 10: goto L_0x0058;
                case 11: goto L_0x0058;
                case 12: goto L_0x004b;
                case 13: goto L_0x004b;
                case 14: goto L_0x003e;
                case 15: goto L_0x002c;
                case 16: goto L_0x001a;
                case 17: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0014:
            int r1 = com.google.android.gms.internal.places.zzs.zze(r1, r2, r6)
            goto L_0x00af
        L_0x001a:
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r1, r2, r6)
            long r2 = r6.zzea
            long r2 = com.google.android.gms.internal.places.zzai.zzb(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00af
        L_0x002c:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r1, r2, r6)
            int r2 = r6.zzdz
            int r2 = com.google.android.gms.internal.places.zzai.zzm(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00af
        L_0x003e:
            com.google.android.gms.internal.places.zzcv r4 = com.google.android.gms.internal.places.zzcv.zzcq()
            com.google.android.gms.internal.places.zzda r4 = r4.zzf(r5)
            int r1 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzr) r6)
            goto L_0x00af
        L_0x004b:
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r1, r2, r6)
            long r2 = r6.zzea
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00af
        L_0x0058:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r1, r2, r6)
            int r2 = r6.zzdz
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00af
        L_0x0065:
            float r1 = com.google.android.gms.internal.places.zzs.zze(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.zzeb = r1
            goto L_0x0085
        L_0x0070:
            long r3 = com.google.android.gms.internal.places.zzs.zzc(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.zzeb = r1
            goto L_0x0092
        L_0x007b:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.zzeb = r1
        L_0x0085:
            int r1 = r2 + 4
            goto L_0x00af
        L_0x0088:
            double r3 = com.google.android.gms.internal.places.zzs.zzd(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.zzeb = r1
        L_0x0092:
            int r1 = r2 + 8
            goto L_0x00af
        L_0x0095:
            int r1 = com.google.android.gms.internal.places.zzs.zzf(r1, r2, r6)
            goto L_0x00af
        L_0x009a:
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r1, r2, r6)
            long r2 = r6.zzea
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00a8
            r2 = 1
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.zzeb = r2
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(byte[], int, int, com.google.android.gms.internal.places.zzef, java.lang.Class, com.google.android.gms.internal.places.zzr):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0423 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int zzb(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.places.zzr r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = zzkr
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.places.zzbh r11 = (com.google.android.gms.internal.places.zzbh) r11
            boolean r12 = r11.zzaa()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.places.zzbh r11 = r11.zzh(r12)
            sun.misc.Unsafe r12 = zzkr
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.places.zzda r1 = r0.zzaf(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.places.zzr) r27)
            java.lang.Object r8 = r7.zzeb
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r9 = r7.zzdz
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.places.zzr) r27)
            java.lang.Object r8 = r7.zzeb
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.places.zzby r11 = (com.google.android.gms.internal.places.zzby) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r1, r7)
            long r4 = r7.zzea
            long r4 = com.google.android.gms.internal.places.zzai.zzb(r4)
            r11.zzm(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.places.zzby r11 = (com.google.android.gms.internal.places.zzby) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            long r8 = com.google.android.gms.internal.places.zzai.zzb(r8)
            r11.zzm(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            long r8 = com.google.android.gms.internal.places.zzai.zzb(r8)
            r11.zzm(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.places.zzbe r11 = (com.google.android.gms.internal.places.zzbe) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r4 = r7.zzdz
            int r4 = com.google.android.gms.internal.places.zzai.zzm(r4)
            r11.zzac(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.places.zzbe r11 = (com.google.android.gms.internal.places.zzbe) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            int r4 = com.google.android.gms.internal.places.zzai.zzm(r4)
            r11.zzac(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            int r4 = com.google.android.gms.internal.places.zzai.zzm(r4)
            r11.zzac(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.places.zzs.zzb((byte[]) r3, (int) r4, (com.google.android.gms.internal.places.zzbh<?>) r11, (com.google.android.gms.internal.places.zzr) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.places.zzs.zzb((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzbh<?>) r6, (com.google.android.gms.internal.places.zzr) r7)
        L_0x0131:
            com.google.android.gms.internal.places.zzbc r1 = (com.google.android.gms.internal.places.zzbc) r1
            com.google.android.gms.internal.places.zzdr r3 = r1.zzih
            com.google.android.gms.internal.places.zzdr r4 = com.google.android.gms.internal.places.zzdr.zzdh()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.places.zzbf r4 = r0.zzah(r8)
            com.google.android.gms.internal.places.zzds<?, ?> r5 = r0.zzlg
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdc.zzb(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.places.zzdr r3 = (com.google.android.gms.internal.places.zzdr) r3
            if (r3 == 0) goto L_0x014e
            r1.zzih = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.places.zzw r4 = com.google.android.gms.internal.places.zzw.zzeg
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.places.zzw r6 = com.google.android.gms.internal.places.zzw.zzc((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.places.zzw r4 = com.google.android.gms.internal.places.zzw.zzeg
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.places.zzw r6 = com.google.android.gms.internal.places.zzw.zzc((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.places.zzda r1 = r0.zzaf(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0216
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x0211
            if (r4 != 0) goto L_0x01de
            r11.add(r6)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.places.zzbd.UTF_8
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x01e8:
            int r1 = r1 + r4
        L_0x01e9:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r8 = r7.zzdz
            if (r2 != r8) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x020c
            if (r4 != 0) goto L_0x0201
            r11.add(r6)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.places.zzbd.UTF_8
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x0216:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x0271
            if (r4 != 0) goto L_0x0224
            r11.add(r6)
            goto L_0x0237
        L_0x0224:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.places.zzea.zzf(r3, r1, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.places.zzbd.UTF_8
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
        L_0x0236:
            r1 = r8
        L_0x0237:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r8 = r7.zzdz
            if (r2 != r8) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x0267
            if (r4 != 0) goto L_0x024f
            r11.add(r6)
            goto L_0x0237
        L_0x024f:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.places.zzea.zzf(r3, r1, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.places.zzbd.UTF_8
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbu()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbu()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.places.zzu r11 = (com.google.android.gms.internal.places.zzu) r11
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r2, r7)
            long r5 = r7.zzea
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0290
            r5 = r13
            goto L_0x0291
        L_0x0290:
            r5 = r1
        L_0x0291:
            r11.addBoolean(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.places.zzu r11 = (com.google.android.gms.internal.places.zzu) r11
            int r4 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = r13
            goto L_0x02af
        L_0x02ae:
            r6 = r1
        L_0x02af:
            r11.addBoolean(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r8 = r7.zzdz
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.places.zzs.zzc(r3, r6, r7)
            long r8 = r7.zzea
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = r13
            goto L_0x02c9
        L_0x02c8:
            r6 = r1
        L_0x02c9:
            r11.addBoolean(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.places.zzbe r11 = (com.google.android.gms.internal.places.zzbe) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1)
            r11.zzac(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.places.zzbe r11 = (com.google.android.gms.internal.places.zzbe) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r18, r19)
            r11.zzac(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4)
            r11.zzac(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.places.zzby r11 = (com.google.android.gms.internal.places.zzby) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.places.zzs.zzc(r3, r1)
            r11.zzm(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.places.zzby r11 = (com.google.android.gms.internal.places.zzby) r11
            long r8 = com.google.android.gms.internal.places.zzs.zzc(r18, r19)
            r11.zzm(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.places.zzs.zzc(r3, r4)
            r11.zzm(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.places.zzs.zzb((byte[]) r3, (int) r4, (com.google.android.gms.internal.places.zzbh<?>) r11, (com.google.android.gms.internal.places.zzr) r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.places.zzs.zzb((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.places.zzbh<?>) r25, (com.google.android.gms.internal.places.zzr) r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.places.zzby r11 = (com.google.android.gms.internal.places.zzby) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r1, r7)
            long r4 = r7.zzea
            r11.zzm(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.places.zzby r11 = (com.google.android.gms.internal.places.zzby) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            r11.zzm(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            r11.zzm(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.places.zzbb r11 = (com.google.android.gms.internal.places.zzbb) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.places.zzs.zze(r3, r1)
            r11.zzf((float) r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.places.zzbb r11 = (com.google.android.gms.internal.places.zzbb) r11
            float r1 = com.google.android.gms.internal.places.zzs.zze(r18, r19)
            r11.zzf((float) r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.places.zzs.zze(r3, r4)
            r11.zzf((float) r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.places.zzao r11 = (com.google.android.gms.internal.places.zzao) r11
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.places.zzs.zzd(r3, r1)
            r11.zzd(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.places.zzao r11 = (com.google.android.gms.internal.places.zzao) r11
            double r8 = com.google.android.gms.internal.places.zzs.zzd(r18, r19)
            r11.zzd(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.places.zzs.zzd(r3, r4)
            r11.zzd(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zzb(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.places.zzr r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = zzkr
            java.lang.Object r12 = r7.zzag(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.places.zzcd r2 = r7.zzli
            boolean r2 = r2.zzi(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.places.zzcd r2 = r7.zzli
            java.lang.Object r2 = r2.zzk(r12)
            com.google.android.gms.internal.places.zzcd r3 = r7.zzli
            r3.zzc(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.places.zzcd r8 = r7.zzli
            com.google.android.gms.internal.places.zzcb r8 = r8.zzl(r12)
            com.google.android.gms.internal.places.zzcd r12 = r7.zzli
            java.util.Map r12 = r12.zzg(r1)
            int r10 = com.google.android.gms.internal.places.zzs.zzb(r9, r10, r15)
            int r13 = r15.zzdz
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.zzkk
            V r0 = r8.zzkm
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.places.zzs.zzb((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.places.zzr) r15)
            int r10 = r15.zzdz
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.places.zzef r1 = r8.zzkl
            int r1 = r1.zzds()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.places.zzef r4 = r8.zzkl
            V r10 = r8.zzkm
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zzb((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzef) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.places.zzr) r6)
            java.lang.Object r0 = r15.zzeb
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.places.zzef r1 = r8.zzkj
            int r1 = r1.zzds()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.places.zzef r4 = r8.zzkj
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zzb((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzef) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.places.zzr) r6)
            java.lang.Object r14 = r15.zzeb
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.places.zzs.zzb((int) r10, (byte[]) r9, (int) r2, (int) r11, (com.google.android.gms.internal.places.zzr) r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.places.zzbk r8 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.places.zzbk r8 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzb(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.places.zzr r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzkr
            int[] r7 = r0.zzks
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            com.google.android.gms.internal.places.zzda r5 = r0.zzaf(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.places.zzr) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.zzeb
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.zzeb
            java.lang.Object r3 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r11)
            long r3 = r11.zzea
            long r3 = com.google.android.gms.internal.places.zzai.zzb(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r3 = r11.zzdz
            int r3 = com.google.android.gms.internal.places.zzai.zzm(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r4 = r11.zzdz
            com.google.android.gms.internal.places.zzbf r5 = r0.zzah(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.zzad(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.places.zzdr r1 = zzo(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzc(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzf(r3, r4, r11)
            java.lang.Object r3 = r11.zzeb
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.places.zzda r2 = r0.zzaf(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzr) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.zzeb
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.zzeb
            java.lang.Object r3 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r4 = r11.zzdz
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.places.zzea.zzf(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbu()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.places.zzbd.UTF_8
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r11)
            long r3 = r11.zzea
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.places.zzs.zzc(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r3 = r11.zzdz
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r11)
            long r3 = r11.zzea
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.places.zzs.zze(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.places.zzs.zzd(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.places.zzr):int");
    }

    private final zzda zzaf(int i) {
        int i2 = (i / 3) << 1;
        zzda zzda = (zzda) this.zzkt[i2];
        if (zzda != null) {
            return zzda;
        }
        zzda zzf = zzcv.zzcq().zzf((Class) this.zzkt[i2 + 1]);
        this.zzkt[i2] = zzf;
        return zzf;
    }

    private final Object zzag(int i) {
        return this.zzkt[(i / 3) << 1];
    }

    private final zzbf zzah(int i) {
        return (zzbf) this.zzkt[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0358, code lost:
        if (r0 == r15) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x038c, code lost:
        if (r0 == r15) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x038f, code lost:
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r1 = r36;
        r11 = r37;
        r7 = r18;
        r3 = r22;
        r2 = r25;
        r4 = r26;
        r8 = r27;
        r9 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fe, code lost:
        r8 = r8 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0102, code lost:
        r12 = r33;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0172, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0210, code lost:
        r8 = r8 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0271, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a4, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a8, code lost:
        r13 = r35;
        r1 = r36;
        r3 = r6;
        r4 = r7;
        r2 = r10;
        r7 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b3, code lost:
        r22 = r6;
        r28 = r9;
        r25 = r10;
        r2 = r13;
        r6 = r36;
        r9 = r7;
        r7 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.places.zzr r37) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r37
            sun.misc.Unsafe r9 = zzkr
            r16 = 0
            r0 = r34
            r1 = r36
            r3 = r16
            r4 = r3
            r8 = r4
            r2 = -1
            r7 = -1
        L_0x0018:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x0461
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r12, (int) r4, (com.google.android.gms.internal.places.zzr) r11)
            int r4 = r11.zzdz
            r6 = r0
            r5 = r4
            goto L_0x002e
        L_0x002c:
            r5 = r0
            r6 = r4
        L_0x002e:
            int r4 = r5 >>> 3
            r0 = r5 & 7
            r10 = 3
            if (r4 <= r2) goto L_0x003b
            int r3 = r3 / r10
            int r2 = r15.zzq(r4, r3)
            goto L_0x003f
        L_0x003b:
            int r2 = r15.zzak(r4)
        L_0x003f:
            r3 = r2
            r2 = -1
            if (r3 != r2) goto L_0x004e
            r25 = r4
            r2 = r6
            r28 = r9
            r22 = r16
            r6 = r1
            r9 = r5
            goto L_0x03d1
        L_0x004e:
            int[] r1 = r15.zzks
            int r2 = r3 + 1
            r2 = r1[r2]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r2 & r19
            int r10 = r19 >>> 20
            r19 = r5
            r5 = r2 & r17
            long r12 = (long) r5
            r5 = 17
            r20 = r2
            if (r10 > r5) goto L_0x02c1
            int r5 = r3 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r2 = 1
            int r22 = r2 << r5
            r1 = r1 & r17
            if (r1 == r7) goto L_0x0082
            r5 = -1
            r18 = r6
            if (r7 == r5) goto L_0x007b
            long r5 = (long) r7
            r9.putInt(r14, r5, r8)
        L_0x007b:
            long r5 = (long) r1
            int r8 = r9.getInt(r14, r5)
            r7 = r1
            goto L_0x0084
        L_0x0082:
            r18 = r6
        L_0x0084:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x028d;
                case 1: goto L_0x0273;
                case 2: goto L_0x024e;
                case 3: goto L_0x024e;
                case 4: goto L_0x0234;
                case 5: goto L_0x0215;
                case 6: goto L_0x01f8;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01ac;
                case 9: goto L_0x0174;
                case 10: goto L_0x0159;
                case 11: goto L_0x0234;
                case 12: goto L_0x0125;
                case 13: goto L_0x01f8;
                case 14: goto L_0x0215;
                case 15: goto L_0x0108;
                case 16: goto L_0x00dc;
                case 17: goto L_0x0096;
                default: goto L_0x0088;
            }
        L_0x0088:
            r12 = r33
            r6 = r3
            r10 = r4
            r34 = r7
            r13 = r18
            r7 = r19
            r19 = -1
            goto L_0x02b3
        L_0x0096:
            r5 = 3
            if (r0 != r5) goto L_0x00d3
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r3)
            int r1 = r4 << 3
            r5 = r1 | 4
            r1 = r33
            r2 = r18
            r6 = r3
            r3 = r35
            r10 = r4
            r4 = r5
            r34 = r7
            r7 = r19
            r19 = -1
            r5 = r37
            int r0 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.places.zzr) r5)
            r1 = r8 & r22
            if (r1 != 0) goto L_0x00c0
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r12, r1)
            goto L_0x00cd
        L_0x00c0:
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r11.zzeb
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r1, (java.lang.Object) r2)
            r9.putObject(r14, r12, r1)
        L_0x00cd:
            r8 = r8 | r22
            r12 = r33
            goto L_0x02a8
        L_0x00d3:
            r6 = r3
            r10 = r4
            r34 = r7
            r7 = r19
            r19 = -1
            goto L_0x0102
        L_0x00dc:
            r6 = r3
            r10 = r4
            r34 = r7
            r7 = r19
            r19 = -1
            if (r0 != 0) goto L_0x0102
            r4 = r12
            r13 = r18
            r12 = r33
            int r13 = com.google.android.gms.internal.places.zzs.zzc(r12, r13, r11)
            long r0 = r11.zzea
            long r17 = com.google.android.gms.internal.places.zzai.zzb(r0)
            r0 = r9
            r1 = r32
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
        L_0x00fe:
            r8 = r8 | r22
            goto L_0x0271
        L_0x0102:
            r12 = r33
            r13 = r18
            goto L_0x02b3
        L_0x0108:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != 0) goto L_0x02b3
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r13, r11)
            int r1 = r11.zzdz
            int r1 = com.google.android.gms.internal.places.zzai.zzm(r1)
            r9.putInt(r14, r4, r1)
            goto L_0x0172
        L_0x0125:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != 0) goto L_0x02b3
            int r13 = com.google.android.gms.internal.places.zzs.zzb(r12, r13, r11)
            int r0 = r11.zzdz
            com.google.android.gms.internal.places.zzbf r1 = r15.zzah(r6)
            if (r1 == 0) goto L_0x0155
            boolean r1 = r1.zzad(r0)
            if (r1 == 0) goto L_0x0147
            goto L_0x0155
        L_0x0147:
            com.google.android.gms.internal.places.zzdr r1 = zzo(r32)
            long r2 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.zzc(r7, r0)
            goto L_0x0271
        L_0x0155:
            r9.putInt(r14, r4, r0)
            goto L_0x00fe
        L_0x0159:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r1 = 2
            r19 = -1
            r12 = r33
            if (r0 != r1) goto L_0x02b3
            int r0 = com.google.android.gms.internal.places.zzs.zzf(r12, r13, r11)
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r4, r1)
        L_0x0172:
            r13 = r0
            goto L_0x00fe
        L_0x0174:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r1 = 2
            r19 = -1
            r12 = r33
            if (r0 != r1) goto L_0x01a8
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r6)
            r3 = r35
            int r0 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r0, (byte[]) r12, (int) r13, (int) r3, (com.google.android.gms.internal.places.zzr) r11)
            r1 = r8 & r22
            if (r1 != 0) goto L_0x0199
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r4, r1)
            goto L_0x0210
        L_0x0199:
            java.lang.Object r1 = r9.getObject(r14, r4)
            java.lang.Object r2 = r11.zzeb
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r1, (java.lang.Object) r2)
            r9.putObject(r14, r4, r1)
            goto L_0x0210
        L_0x01a8:
            r3 = r35
            goto L_0x02b3
        L_0x01ac:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r1 = 2
            r19 = -1
            r12 = r33
            r3 = r35
            if (r0 != r1) goto L_0x02b3
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01c9
            int r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r13, r11)
            goto L_0x01cd
        L_0x01c9:
            int r0 = com.google.android.gms.internal.places.zzs.zze(r12, r13, r11)
        L_0x01cd:
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r4, r1)
            goto L_0x0210
        L_0x01d3:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            r3 = r35
            if (r0 != 0) goto L_0x02b3
            int r0 = com.google.android.gms.internal.places.zzs.zzc(r12, r13, r11)
            long r2 = r11.zzea
            r20 = 0
            int r1 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01f2
            r2 = 1
            goto L_0x01f4
        L_0x01f2:
            r2 = r16
        L_0x01f4:
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r4, (boolean) r2)
            goto L_0x0210
        L_0x01f8:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != r1) goto L_0x02b3
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r13)
            r9.putInt(r14, r4, r0)
            int r0 = r13 + 4
        L_0x0210:
            r1 = r8 | r22
            r8 = r1
            goto L_0x02a8
        L_0x0215:
            r1 = r2
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != r1) goto L_0x02b3
            long r17 = com.google.android.gms.internal.places.zzs.zzc(r12, r13)
            r0 = r9
            r1 = r32
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x02a4
        L_0x0234:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != 0) goto L_0x02b3
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r13, r11)
            int r1 = r11.zzdz
            r9.putInt(r14, r4, r1)
            goto L_0x0172
        L_0x024e:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != 0) goto L_0x02b3
            int r13 = com.google.android.gms.internal.places.zzs.zzc(r12, r13, r11)
            long r2 = r11.zzea
            r0 = r9
            r1 = r32
            r17 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r8 | r22
            r8 = r0
        L_0x0271:
            r0 = r13
            goto L_0x02a8
        L_0x0273:
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != r1) goto L_0x02b3
            float r0 = com.google.android.gms.internal.places.zzs.zze(r12, r13)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r13 + 4
            goto L_0x0172
        L_0x028d:
            r1 = r2
            r6 = r3
            r10 = r4
            r34 = r7
            r4 = r12
            r13 = r18
            r7 = r19
            r19 = -1
            r12 = r33
            if (r0 != r1) goto L_0x02b3
            double r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r13)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r4, (double) r0)
        L_0x02a4:
            int r0 = r13 + 8
            goto L_0x0172
        L_0x02a8:
            r13 = r35
            r1 = r36
            r3 = r6
            r4 = r7
            r2 = r10
            r7 = r34
            goto L_0x0018
        L_0x02b3:
            r22 = r6
            r28 = r9
            r25 = r10
            r2 = r13
            r6 = r36
            r9 = r7
            r7 = r34
            goto L_0x03d1
        L_0x02c1:
            r18 = r7
            r7 = r19
            r19 = -1
            r29 = r12
            r12 = r33
            r13 = r6
            r6 = r3
            r3 = r4
            r4 = r29
            r1 = 27
            if (r10 != r1) goto L_0x0322
            r1 = 2
            if (r0 != r1) goto L_0x0315
            java.lang.Object r0 = r9.getObject(r14, r4)
            com.google.android.gms.internal.places.zzbh r0 = (com.google.android.gms.internal.places.zzbh) r0
            boolean r1 = r0.zzaa()
            if (r1 != 0) goto L_0x02f5
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02ec
            r1 = 10
            goto L_0x02ee
        L_0x02ec:
            int r1 = r1 << 1
        L_0x02ee:
            com.google.android.gms.internal.places.zzbh r0 = r0.zzh(r1)
            r9.putObject(r14, r4, r0)
        L_0x02f5:
            r5 = r0
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r6)
            r1 = r7
            r2 = r33
            r10 = r3
            r3 = r13
            r4 = r35
            r22 = r6
            r6 = r37
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r0, r1, r2, r3, r4, r5, r6)
            r13 = r35
            r1 = r36
            r4 = r7
            r2 = r10
            r7 = r18
            r3 = r22
            goto L_0x0018
        L_0x0315:
            r22 = r6
            r25 = r3
            r26 = r7
            r27 = r8
            r28 = r9
            r15 = r13
            goto L_0x03a9
        L_0x0322:
            r22 = r6
            r6 = r3
            r1 = 49
            if (r10 > r1) goto L_0x035d
            r2 = r20
            long r2 = (long) r2
            r1 = r0
            r0 = r31
            r34 = r1
            r1 = r32
            r20 = r2
            r2 = r33
            r3 = r13
            r23 = r4
            r4 = r35
            r5 = r7
            r25 = r6
            r26 = r7
            r7 = r34
            r27 = r8
            r8 = r22
            r28 = r9
            r19 = r10
            r9 = r20
            r11 = r19
            r15 = r13
            r12 = r23
            r14 = r37
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.places.zzr) r14)
            if (r0 != r15) goto L_0x038f
        L_0x035a:
            r6 = r0
            goto L_0x03c8
        L_0x035d:
            r34 = r0
            r23 = r4
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r19 = r10
            r15 = r13
            r2 = r20
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x03ab
            r7 = r34
            r0 = 2
            if (r7 != r0) goto L_0x03a9
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r22
            r6 = r23
            r8 = r37
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.places.zzr) r8)
            if (r0 != r15) goto L_0x038f
            goto L_0x035a
        L_0x038f:
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r1 = r36
            r11 = r37
            r7 = r18
            r3 = r22
            r2 = r25
            r4 = r26
            r8 = r27
            r9 = r28
            goto L_0x0018
        L_0x03a9:
            r6 = r15
            goto L_0x03c8
        L_0x03ab:
            r7 = r34
            r0 = r31
            r1 = r32
            r8 = r2
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r26
            r6 = r25
            r10 = r23
            r12 = r22
            r13 = r37
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.places.zzr) r13)
            if (r0 != r15) goto L_0x0445
            goto L_0x035a
        L_0x03c8:
            r2 = r6
            r7 = r18
            r9 = r26
            r8 = r27
            r6 = r36
        L_0x03d1:
            if (r9 != r6) goto L_0x03e0
            if (r6 != 0) goto L_0x03d6
            goto L_0x03e0
        L_0x03d6:
            r10 = r31
            r13 = r32
            r0 = r7
            r1 = r8
            r7 = r2
            r8 = r6
            goto L_0x0470
        L_0x03e0:
            r10 = r31
            boolean r0 = r10.zzkx
            if (r0 == 0) goto L_0x0421
            r11 = r37
            com.google.android.gms.internal.places.zzap r0 = r11.zzec
            com.google.android.gms.internal.places.zzap r1 = com.google.android.gms.internal.places.zzap.zzao()
            if (r0 == r1) goto L_0x041e
            com.google.android.gms.internal.places.zzck r0 = r10.zzkw
            com.google.android.gms.internal.places.zzap r1 = r11.zzec
            r12 = r25
            com.google.android.gms.internal.places.zzbc$zzf r0 = r1.zzb(r0, r12)
            if (r0 != 0) goto L_0x040e
            com.google.android.gms.internal.places.zzdr r4 = zzo(r32)
            r0 = r9
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzdr) r4, (com.google.android.gms.internal.places.zzr) r5)
            r13 = r32
            goto L_0x0436
        L_0x040e:
            r13 = r32
            r0 = r13
            com.google.android.gms.internal.places.zzbc$zzc r0 = (com.google.android.gms.internal.places.zzbc.zzc) r0
            r0.zzbm()
            com.google.android.gms.internal.places.zzav<java.lang.Object> r0 = r0.zzik
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x041e:
            r13 = r32
            goto L_0x0425
        L_0x0421:
            r13 = r32
            r11 = r37
        L_0x0425:
            r12 = r25
            com.google.android.gms.internal.places.zzdr r4 = zzo(r32)
            r0 = r9
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzdr) r4, (com.google.android.gms.internal.places.zzr) r5)
        L_0x0436:
            r1 = r6
            r4 = r9
            r15 = r10
            r2 = r12
            r14 = r13
            r3 = r22
            r9 = r28
            r12 = r33
            r13 = r35
            goto L_0x0018
        L_0x0445:
            r12 = r25
            r9 = r26
            r15 = r31
            r14 = r32
            r13 = r35
            r1 = r36
            r11 = r37
            r4 = r9
            r2 = r12
            r7 = r18
            r3 = r22
            r8 = r27
            r9 = r28
            r12 = r33
            goto L_0x0018
        L_0x0461:
            r18 = r7
            r27 = r8
            r28 = r9
            r13 = r14
            r10 = r15
            r7 = r0
            r8 = r1
            r9 = r4
            r0 = r18
            r1 = r27
        L_0x0470:
            r2 = -1
            if (r0 == r2) goto L_0x0479
            long r2 = (long) r0
            r0 = r28
            r0.putInt(r13, r2, r1)
        L_0x0479:
            int r0 = r10.zzlc
            r1 = 0
            r11 = r0
            r5 = r1
        L_0x047e:
            int r0 = r10.zzld
            if (r11 >= r0) goto L_0x04b2
            int[] r0 = r10.zzlb
            r1 = r0[r11]
            com.google.android.gms.internal.places.zzds<?, ?> r6 = r10.zzlg
            int[] r0 = r10.zzks
            r2 = r0[r1]
            int r0 = r10.zzai(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.places.zzdy.zzp(r13, r3)
            if (r0 != 0) goto L_0x049a
            goto L_0x04ad
        L_0x049a:
            com.google.android.gms.internal.places.zzbf r4 = r10.zzah(r1)
            if (r4 != 0) goto L_0x04a1
            goto L_0x04ad
        L_0x04a1:
            com.google.android.gms.internal.places.zzcd r3 = r10.zzli
            java.util.Map r3 = r3.zzg(r0)
            r0 = r31
            java.lang.Object r5 = r0.zzb((int) r1, (int) r2, r3, (com.google.android.gms.internal.places.zzbf) r4, r5, r6)
        L_0x04ad:
            com.google.android.gms.internal.places.zzdr r5 = (com.google.android.gms.internal.places.zzdr) r5
            int r11 = r11 + 1
            goto L_0x047e
        L_0x04b2:
            if (r5 == 0) goto L_0x04b9
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r10.zzlg
            r0.zzg(r13, r5)
        L_0x04b9:
            if (r8 != 0) goto L_0x04c5
            r0 = r35
            if (r7 != r0) goto L_0x04c0
            goto L_0x04cb
        L_0x04c0:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r0
        L_0x04c5:
            r0 = r35
            if (r7 > r0) goto L_0x04cc
            if (r9 != r8) goto L_0x04cc
        L_0x04cb:
            return r7
        L_0x04cc:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010d, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013f, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0150, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015e, code lost:
        r8 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0161, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e0, code lost:
        if (r0 == r15) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020d, code lost:
        if (r0 == r15) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022c, code lost:
        if (r0 == r15) goto L_0x022e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.places.zzr r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.zzkz
            if (r0 == 0) goto L_0x025c
            sun.misc.Unsafe r9 = zzkr
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = r10
            r2 = r16
        L_0x0018:
            if (r0 >= r13) goto L_0x0253
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.places.zzr) r11)
            int r3 = r11.zzdz
            r8 = r0
            r17 = r3
            goto L_0x002d
        L_0x002a:
            r17 = r0
            r8 = r3
        L_0x002d:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x003a
            int r2 = r2 / 3
            int r0 = r15.zzq(r7, r2)
            goto L_0x003e
        L_0x003a:
            int r0 = r15.zzak(r7)
        L_0x003e:
            r4 = r0
            if (r4 != r10) goto L_0x004c
            r24 = r7
            r2 = r8
            r18 = r9
            r26 = r10
            r19 = r16
            goto L_0x022f
        L_0x004c:
            int[] r0 = r15.zzks
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0164
            r0 = 1
            switch(r3) {
                case 0: goto L_0x0153;
                case 1: goto L_0x0141;
                case 2: goto L_0x012f;
                case 3: goto L_0x012f;
                case 4: goto L_0x0121;
                case 5: goto L_0x0111;
                case 6: goto L_0x0100;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00d2;
                case 9: goto L_0x00b1;
                case 10: goto L_0x00a4;
                case 11: goto L_0x0121;
                case 12: goto L_0x0095;
                case 13: goto L_0x0100;
                case 14: goto L_0x0111;
                case 15: goto L_0x0082;
                case 16: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x01a2
        L_0x0067:
            if (r6 != 0) goto L_0x01a2
            int r6 = com.google.android.gms.internal.places.zzs.zzc(r12, r8, r11)
            r19 = r1
            long r0 = r11.zzea
            long r21 = com.google.android.gms.internal.places.zzai.zzb(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013f
        L_0x0082:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0161
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8, r11)
            int r1 = r11.zzdz
            int r1 = com.google.android.gms.internal.places.zzai.zzm(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0150
        L_0x0095:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0161
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8, r11)
            int r1 = r11.zzdz
            r9.putInt(r14, r2, r1)
            goto L_0x0150
        L_0x00a4:
            r2 = r1
            if (r6 != r10) goto L_0x01a2
            int r0 = com.google.android.gms.internal.places.zzs.zzf(r12, r8, r11)
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r2, r1)
            goto L_0x010d
        L_0x00b1:
            r2 = r1
            if (r6 != r10) goto L_0x01a2
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r4)
            int r0 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r0, (byte[]) r12, (int) r8, (int) r13, (com.google.android.gms.internal.places.zzr) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c8
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r2, r1)
            goto L_0x010d
        L_0x00c8:
            java.lang.Object r5 = r11.zzeb
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r1, (java.lang.Object) r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010d
        L_0x00d2:
            r2 = r1
            if (r6 != r10) goto L_0x01a2
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00df
            int r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r8, r11)
            goto L_0x00e3
        L_0x00df:
            int r0 = com.google.android.gms.internal.places.zzs.zze(r12, r8, r11)
        L_0x00e3:
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r2, r1)
            goto L_0x010d
        L_0x00e9:
            r2 = r1
            if (r6 != 0) goto L_0x01a2
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r12, r8, r11)
            long r5 = r11.zzea
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r0 = r16
        L_0x00fb:
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x010d
        L_0x0100:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a2
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010d:
            r19 = r4
            goto L_0x019c
        L_0x0111:
            r2 = r1
            if (r6 != r0) goto L_0x01a2
            long r5 = com.google.android.gms.internal.places.zzs.zzc(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x015e
        L_0x0121:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0161
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8, r11)
            int r1 = r11.zzdz
            r9.putInt(r14, r2, r1)
            goto L_0x0150
        L_0x012f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0161
            int r6 = com.google.android.gms.internal.places.zzs.zzc(r12, r8, r11)
            long r4 = r11.zzea
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013f:
            r0 = r6
            goto L_0x0150
        L_0x0141:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x0161
            float r0 = com.google.android.gms.internal.places.zzs.zze(r12, r8)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (float) r0)
            int r8 = r8 + 4
        L_0x014f:
            r0 = r8
        L_0x0150:
            r19 = r10
            goto L_0x019c
        L_0x0153:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0161
            double r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r8)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x015e:
            int r8 = r8 + 8
            goto L_0x014f
        L_0x0161:
            r19 = r10
            goto L_0x01a4
        L_0x0164:
            r0 = 27
            if (r3 != r0) goto L_0x01ad
            if (r6 != r10) goto L_0x01a2
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.places.zzbh r0 = (com.google.android.gms.internal.places.zzbh) r0
            boolean r3 = r0.zzaa()
            if (r3 != 0) goto L_0x0188
            int r3 = r0.size()
            if (r3 != 0) goto L_0x017f
            r3 = 10
            goto L_0x0181
        L_0x017f:
            int r3 = r3 << 1
        L_0x0181:
            com.google.android.gms.internal.places.zzbh r0 = r0.zzh(r3)
            r9.putObject(r14, r1, r0)
        L_0x0188:
            r5 = r0
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r0, r1, r2, r3, r4, r5, r6)
        L_0x019c:
            r1 = r7
            r2 = r19
            r10 = -1
            goto L_0x0018
        L_0x01a2:
            r19 = r4
        L_0x01a4:
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            goto L_0x0210
        L_0x01ad:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e3
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.places.zzr) r14)
            if (r0 != r15) goto L_0x023f
            goto L_0x022e
        L_0x01e3:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0212
            r7 = r30
            if (r7 != r10) goto L_0x0210
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.places.zzr) r8)
            if (r0 != r15) goto L_0x023f
            goto L_0x022e
        L_0x0210:
            r2 = r15
            goto L_0x022f
        L_0x0212:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.places.zzr) r13)
            if (r0 != r15) goto L_0x023f
        L_0x022e:
            r2 = r0
        L_0x022f:
            com.google.android.gms.internal.places.zzdr r4 = zzo(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzdr) r4, (com.google.android.gms.internal.places.zzr) r5)
        L_0x023f:
            r2 = r19
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r1 = r24
            r10 = r26
            goto L_0x0018
        L_0x0253:
            r4 = r13
            if (r0 != r4) goto L_0x0257
            return
        L_0x0257:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r0
        L_0x025c:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzr) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, com.google.android.gms.internal.places.zzr):void");
    }

    public final void zzd(T t) {
        int i;
        int i2 = this.zzlc;
        while (true) {
            i = this.zzld;
            if (i2 >= i) {
                break;
            }
            long zzai = (long) (zzai(this.zzlb[i2]) & 1048575);
            Object zzp = zzdy.zzp(t, zzai);
            if (zzp != null) {
                zzdy.zzb((Object) t, zzai, this.zzli.zzj(zzp));
            }
            i2++;
        }
        int length = this.zzlb.length;
        while (i < length) {
            this.zzlf.zzb(t, (long) this.zzlb[i]);
            i++;
        }
        this.zzlg.zzd(t);
        if (this.zzkx) {
            this.zzlh.zzd(t);
        }
    }

    private final <K, V, UT, UB> UB zzb(int i, int i2, Map<K, V> map, zzbf zzbf, UB ub, zzds<UT, UB> zzds) {
        zzcb<?, ?> zzl = this.zzli.zzl(zzag(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzbf.zzad(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzds.zzdk();
                }
                zzae zzk = zzw.zzk(zzcc.zzb(zzl, next.getKey(), next.getValue()));
                try {
                    zzcc.zzb(zzk.zzai(), zzl, next.getKey(), next.getValue());
                    zzds.zzb(ub, i2, zzk.zzah());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final boolean zzp(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzlc) {
                return !this.zzkx || this.zzlh.zzb((Object) t).isInitialized();
            }
            int i5 = this.zzlb[i3];
            int i6 = this.zzks[i5];
            int zzai = zzai(i5);
            if (!this.zzkz) {
                int i7 = this.zzks[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzkr.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & zzai) != 0) && !zzb(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzai) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zzb(t, i6, i5) && !zzb((Object) t, zzai, zzaf(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzh = this.zzli.zzh(zzdy.zzp(t, (long) (zzai & 1048575)));
                            if (!zzh.isEmpty()) {
                                if (this.zzli.zzl(zzag(i5)).zzkl.zzdr() == zzem.MESSAGE) {
                                    zzda<?> zzda = null;
                                    Iterator<?> it = zzh.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzda == null) {
                                            zzda = zzcv.zzcq().zzf(next.getClass());
                                        }
                                        if (!zzda.zzp(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzdy.zzp(t, (long) (zzai & 1048575));
                if (!list.isEmpty()) {
                    zzda zzaf = zzaf(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zzaf.zzp(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zzb(t, i5, i4, i) && !zzb((Object) t, zzai, zzaf(i5))) {
                return false;
            }
            i3++;
        }
    }

    private static boolean zzb(Object obj, int i, zzda zzda) {
        return zzda.zzp(zzdy.zzp(obj, (long) (i & 1048575)));
    }

    private static void zzb(int i, Object obj, zzel zzel) throws IOException {
        if (obj instanceof String) {
            zzel.zzb(i, (String) obj);
        } else {
            zzel.zzb(i, (zzw) obj);
        }
    }

    private final int zzai(int i) {
        return this.zzks[i + 1];
    }

    private final int zzaj(int i) {
        return this.zzks[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzdy.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzdy.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzdy.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzdy.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzdy.zzp(t, j)).booleanValue();
    }

    private final boolean zzd(T t, T t2, int i) {
        return zzb(t, i) == zzb(t2, i);
    }

    private final boolean zzb(T t, int i, int i2, int i3) {
        if (this.zzkz) {
            return zzb(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zzb(T t, int i) {
        if (this.zzkz) {
            int zzai = zzai(i);
            long j = (long) (zzai & 1048575);
            switch ((zzai & 267386880) >>> 20) {
                case 0:
                    return zzdy.zzo(t, j) != 0.0d;
                case 1:
                    return zzdy.zzn(t, j) != BitmapDescriptorFactory.HUE_RED;
                case 2:
                    return zzdy.zzl(t, j) != 0;
                case 3:
                    return zzdy.zzl(t, j) != 0;
                case 4:
                    return zzdy.zzk(t, j) != 0;
                case 5:
                    return zzdy.zzl(t, j) != 0;
                case 6:
                    return zzdy.zzk(t, j) != 0;
                case 7:
                    return zzdy.zzm(t, j);
                case 8:
                    Object zzp = zzdy.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzw) {
                        return !zzw.zzeg.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzdy.zzp(t, j) != null;
                case 10:
                    return !zzw.zzeg.equals(zzdy.zzp(t, j));
                case 11:
                    return zzdy.zzk(t, j) != 0;
                case 12:
                    return zzdy.zzk(t, j) != 0;
                case 13:
                    return zzdy.zzk(t, j) != 0;
                case 14:
                    return zzdy.zzl(t, j) != 0;
                case 15:
                    return zzdy.zzk(t, j) != 0;
                case 16:
                    return zzdy.zzl(t, j) != 0;
                case 17:
                    return zzdy.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzaj = zzaj(i);
            return (zzdy.zzk(t, (long) (zzaj & 1048575)) & (1 << (zzaj >>> 20))) != 0;
        }
    }

    private final void zzc(T t, int i) {
        if (!this.zzkz) {
            int zzaj = zzaj(i);
            long j = (long) (1048575 & zzaj);
            zzdy.zzb((Object) t, j, (1 << (zzaj >>> 20)) | zzdy.zzk(t, j));
        }
    }

    private final boolean zzb(T t, int i, int i2) {
        return zzdy.zzk(t, (long) (zzaj(i2) & 1048575)) == i;
    }

    private final void zzc(T t, int i, int i2) {
        zzdy.zzb((Object) t, (long) (zzaj(i2) & 1048575), i);
    }

    private final int zzak(int i) {
        if (i < this.zzku || i > this.zzkv) {
            return -1;
        }
        return zzr(i, 0);
    }

    private final int zzq(int i, int i2) {
        if (i < this.zzku || i > this.zzkv) {
            return -1;
        }
        return zzr(i, i2);
    }

    private final int zzr(int i, int i2) {
        int length = (this.zzks.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzks[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
