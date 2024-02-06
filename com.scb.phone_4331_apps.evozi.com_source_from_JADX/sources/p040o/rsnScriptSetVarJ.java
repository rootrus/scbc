package p040o;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* renamed from: o.rsnScriptSetVarJ */
public final class rsnScriptSetVarJ extends rsnScriptSetVarD {
    private rsnScriptSetVarI MediaBrowserCompat$CustomActionResultReceiver;

    public rsnScriptSetVarJ(rsnIncElementCreate rsnincelementcreate) {
        super(rsnincelementcreate);
    }

    public final rsnScriptSetVarI read() throws NotFoundException {
        byte b;
        byte b2;
        int i;
        int i2;
        rsnScriptSetVarI rsnscriptsetvari = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (rsnscriptsetvari != null) {
            return rsnscriptsetvari;
        }
        rsnIncElementCreate rsnincelementcreate = this.read;
        int i3 = rsnincelementcreate.IconCompatParcelizer;
        int i4 = rsnincelementcreate.MediaBrowserCompat$ItemReceiver;
        if (i3 < 40 || i4 < 40) {
            this.MediaBrowserCompat$CustomActionResultReceiver = super.read();
        } else {
            byte[] MediaBrowserCompat$ItemReceiver = rsnincelementcreate.MediaBrowserCompat$ItemReceiver();
            int i5 = i3 >> 3;
            if ((i3 & 7) != 0) {
                i5++;
            }
            int i6 = i4 >> 3;
            if ((i4 & 7) != 0) {
                i6++;
            }
            int i7 = i4 - 8;
            int i8 = i3 - 8;
            int[] iArr = new int[2];
            iArr[1] = i5;
            int i9 = 0;
            iArr[0] = i6;
            int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
            int i10 = 0;
            while (true) {
                int i11 = 8;
                if (i10 >= i6) {
                    break;
                }
                int i12 = i10 << 3;
                if (i12 > i7) {
                    i12 = i7;
                }
                while (i9 < i5) {
                    int i13 = i9 << 3;
                    if (i13 > i8) {
                        i13 = i8;
                    }
                    int i14 = (i12 * i3) + i13;
                    int i15 = 0;
                    int i16 = 0;
                    byte b3 = 0;
                    byte b4 = 255;
                    while (i15 < i11) {
                        byte b5 = b3;
                        byte b6 = b4;
                        int i17 = 0;
                        while (i17 < i11) {
                            int i18 = i15;
                            byte b7 = MediaBrowserCompat$ItemReceiver[i14 + i17] & 255;
                            i16 += b7;
                            byte b8 = b6;
                            b6 = b7 < b8 ? b7 : b8;
                            if (b7 > b5) {
                                b5 = b7;
                            }
                            i17++;
                            i15 = i18;
                            i11 = 8;
                        }
                        int i19 = i15;
                        byte b9 = b6;
                        if (b5 - b9 > 24) {
                            while (true) {
                                i2 = i19 + 1;
                                i14 += i3;
                                b2 = b9;
                                if (i2 >= 8) {
                                    break;
                                }
                                int i20 = 0;
                                for (int i21 = 8; i20 < i21; i21 = 8) {
                                    i16 += MediaBrowserCompat$ItemReceiver[i14 + i20] & 255;
                                    i20++;
                                    b5 = b5;
                                }
                                i19 = i2;
                                b9 = b2;
                            }
                            b = b5;
                            i = i2;
                        } else {
                            b2 = b9;
                            b = b5;
                            i = i19;
                        }
                        i15 = i + 1;
                        i14 += i3;
                        i11 = 8;
                        byte b10 = b;
                        b4 = b2;
                        b3 = b10;
                    }
                    int i22 = i16 >> 6;
                    byte b11 = b4;
                    if (b3 - b11 <= 24) {
                        i22 = b11 / 2;
                        if (i10 > 0 && i9 > 0) {
                            int i23 = i10 - 1;
                            int i24 = i9 - 1;
                            int i25 = ((iArr2[i23][i9] + (iArr2[i10][i24] << 1)) + iArr2[i23][i24]) / 4;
                            if (b11 < i25) {
                                i22 = i25;
                            }
                        }
                    }
                    iArr2[i10][i9] = i22;
                    i9++;
                    i11 = 8;
                }
                i10++;
                i9 = 0;
            }
            rsnScriptSetVarI rsnscriptsetvari2 = new rsnScriptSetVarI(i3, i4);
            for (int i26 = 0; i26 < i6; i26++) {
                int i27 = i26 << 3;
                if (i27 > i7) {
                    i27 = i7;
                }
                int i28 = i6 - 3;
                if (i26 < 2) {
                    i28 = 2;
                } else if (i26 <= i28) {
                    i28 = i26;
                }
                int i29 = 0;
                while (i29 < i5) {
                    int i30 = i29 << 3;
                    if (i30 > i8) {
                        i30 = i8;
                    }
                    int i31 = i5 - 3;
                    int i32 = 2;
                    if (i29 < 2) {
                        i31 = 2;
                    } else if (i29 <= i31) {
                        i31 = i29;
                    }
                    int i33 = i5;
                    int i34 = -2;
                    int i35 = 0;
                    while (i34 <= i32) {
                        int[] iArr3 = iArr2[i28 + i34];
                        i35 += iArr3[i31 - 2] + iArr3[i31 - 1] + iArr3[i31] + iArr3[i31 + 1] + iArr3[i31 + 2];
                        i34++;
                        i32 = 2;
                    }
                    int i36 = i32;
                    int i37 = i35 / 25;
                    int i38 = (i27 * i3) + i30;
                    int i39 = i6;
                    int i40 = 8;
                    int i41 = 0;
                    while (i41 < i40) {
                        int i42 = i7;
                        int i43 = 0;
                        while (i43 < i40) {
                            byte[] bArr = MediaBrowserCompat$ItemReceiver;
                            if ((MediaBrowserCompat$ItemReceiver[i38 + i43] & 255) <= i37) {
                                int i44 = i30 + i43;
                                int i45 = ((i27 + i41) * rsnscriptsetvari2.read) + (i44 / 32);
                                int[] iArr4 = rsnscriptsetvari2.MediaBrowserCompat$CustomActionResultReceiver;
                                iArr4[i45] = (1 << (i44 & 31)) | iArr4[i45];
                            }
                            i43++;
                            MediaBrowserCompat$ItemReceiver = bArr;
                            i40 = 8;
                        }
                        byte[] bArr2 = MediaBrowserCompat$ItemReceiver;
                        i41++;
                        i38 += i3;
                        i7 = i42;
                        i40 = 8;
                    }
                    byte[] bArr3 = MediaBrowserCompat$ItemReceiver;
                    int i46 = i7;
                    i29++;
                    i5 = i33;
                    i6 = i39;
                }
                byte[] bArr4 = MediaBrowserCompat$ItemReceiver;
                int i47 = i5;
                int i48 = i6;
                int i49 = i7;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptsetvari2;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final rsnElementCreate2 MediaBrowserCompat$CustomActionResultReceiver(rsnIncElementCreate rsnincelementcreate) {
        return new rsnScriptSetVarJ(rsnincelementcreate);
    }
}
