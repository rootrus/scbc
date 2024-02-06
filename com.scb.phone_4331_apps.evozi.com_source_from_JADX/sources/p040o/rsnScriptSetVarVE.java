package p040o;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.jmrtd.PassportService;
import p040o.getLayers;

/* renamed from: o.rsnScriptSetVarVE */
public final class rsnScriptSetVarVE {
    private static final char[] IconCompatParcelizer = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};
    private static final char[] MediaBrowserCompat$CustomActionResultReceiver;
    private static final char[] MediaBrowserCompat$ItemReceiver = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] read = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, '{', '|', '}', '~', 127};
    private static final char[] write;

    /* renamed from: o.rsnScriptSetVarVE$IconCompatParcelizer */
    enum IconCompatParcelizer {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        MediaBrowserCompat$CustomActionResultReceiver = cArr;
        write = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.getMaskAnimations.read MediaBrowserCompat$ItemReceiver(byte[] r9) throws com.google.zxing.FormatException {
        /*
            o.getLayers$IconCompatParcelizer r0 = new o.getLayers$IconCompatParcelizer
            r0.<init>(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            o.rsnScriptSetVarVE$IconCompatParcelizer r5 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.ASCII_ENCODE
        L_0x001a:
            o.rsnScriptSetVarVE$IconCompatParcelizer r6 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.ASCII_ENCODE
            r7 = 3
            if (r5 != r6) goto L_0x0024
            o.rsnScriptSetVarVE$IconCompatParcelizer r5 = IconCompatParcelizer(r0, r1, r2)
            goto L_0x0053
        L_0x0024:
            int[] r6 = p040o.rsnScriptSetVarVE.C14425.MediaBrowserCompat$ItemReceiver
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r4) goto L_0x004e
            r6 = 2
            if (r5 == r6) goto L_0x004a
            if (r5 == r7) goto L_0x0046
            r6 = 4
            if (r5 == r6) goto L_0x0042
            r6 = 5
            if (r5 != r6) goto L_0x003d
            MediaBrowserCompat$ItemReceiver(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.read()
            throw r9
        L_0x0042:
            IconCompatParcelizer(r0, r1)
            goto L_0x0051
        L_0x0046:
            read(r0, r1)
            goto L_0x0051
        L_0x004a:
            MediaBrowserCompat$ItemReceiver(r0, r1)
            goto L_0x0051
        L_0x004e:
            write(r0, r1)
        L_0x0051:
            o.rsnScriptSetVarVE$IconCompatParcelizer r5 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.ASCII_ENCODE
        L_0x0053:
            o.rsnScriptSetVarVE$IconCompatParcelizer r6 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.PAD_ENCODE
            if (r5 == r6) goto L_0x0063
            byte[] r6 = r0.IconCompatParcelizer
            int r6 = r6.length
            int r8 = r0.write
            int r6 = r6 - r8
            int r6 = r6 << r7
            int r7 = r0.read
            int r6 = r6 - r7
            if (r6 > 0) goto L_0x001a
        L_0x0063:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x006c
            r1.append(r2)
        L_0x006c:
            java.lang.String r0 = r1.toString()
            boolean r1 = r3.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0078
            r3 = r2
        L_0x0078:
            o.getMaskAnimations$read r1 = new o.getMaskAnimations$read
            r1.<init>(r9, r0, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnScriptSetVarVE.MediaBrowserCompat$ItemReceiver(byte[]):o.getMaskAnimations$read");
    }

    /* renamed from: o.rsnScriptSetVarVE$5 */
    static /* synthetic */ class C14425 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.rsnScriptSetVarVE$IconCompatParcelizer[] r0 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.rsnScriptSetVarVE$IconCompatParcelizer r1 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.rsnScriptSetVarVE$IconCompatParcelizer r1 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.rsnScriptSetVarVE$IconCompatParcelizer r1 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.rsnScriptSetVarVE$IconCompatParcelizer r1 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.rsnScriptSetVarVE$IconCompatParcelizer r1 = p040o.rsnScriptSetVarVE.IconCompatParcelizer.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.rsnScriptSetVarVE.C14425.<clinit>():void");
        }
    }

    private static IconCompatParcelizer IconCompatParcelizer(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z = false;
        do {
            int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8);
            if (MediaBrowserCompat$ItemReceiver2 == 0) {
                throw FormatException.read();
            } else if (MediaBrowserCompat$ItemReceiver2 <= 128) {
                if (z) {
                    MediaBrowserCompat$ItemReceiver2 += 128;
                }
                sb.append((char) (MediaBrowserCompat$ItemReceiver2 - 1));
                return IconCompatParcelizer.ASCII_ENCODE;
            } else if (MediaBrowserCompat$ItemReceiver2 == 129) {
                return IconCompatParcelizer.PAD_ENCODE;
            } else {
                if (MediaBrowserCompat$ItemReceiver2 <= 229) {
                    int i = MediaBrowserCompat$ItemReceiver2 - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else {
                    switch (MediaBrowserCompat$ItemReceiver2) {
                        case 230:
                            return IconCompatParcelizer.C40_ENCODE;
                        case 231:
                            return IconCompatParcelizer.BASE256_ENCODE;
                        case 232:
                            sb.append(29);
                            break;
                        case 233:
                        case 234:
                        case 241:
                            break;
                        case 235:
                            z = true;
                            break;
                        case 236:
                            sb.append("[)>\u001e05\u001d");
                            sb2.insert(0, "\u001e\u0004");
                            break;
                        case 237:
                            sb.append("[)>\u001e06\u001d");
                            sb2.insert(0, "\u001e\u0004");
                            break;
                        case 238:
                            return IconCompatParcelizer.ANSIX12_ENCODE;
                        case 239:
                            return IconCompatParcelizer.TEXT_ENCODE;
                        case 240:
                            return IconCompatParcelizer.EDIFACT_ENCODE;
                        default:
                            if (MediaBrowserCompat$ItemReceiver2 >= 242 && !(MediaBrowserCompat$ItemReceiver2 == 254 && ((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read == 0)) {
                                throw FormatException.read();
                            }
                    }
                }
            }
        } while (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read > 0);
        return IconCompatParcelizer.ASCII_ENCODE;
    }

    private static void write(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static void read(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb) throws FormatException {
        int MediaBrowserCompat$ItemReceiver2;
        int[] iArr = new int[3];
        while (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read != 8 && (MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8)) != 254) {
            write(MediaBrowserCompat$ItemReceiver2, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append(13);
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('>');
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw FormatException.read();
                }
            }
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read <= 0) {
                return;
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int i = iconCompatParcelizer.write + 1;
        int i2 = i + 1;
        int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8) - (((i * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 255) + 1);
        if (MediaBrowserCompat$ItemReceiver2 < 0) {
            MediaBrowserCompat$ItemReceiver2 += 256;
        }
        if (MediaBrowserCompat$ItemReceiver2 == 0) {
            MediaBrowserCompat$ItemReceiver2 = (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read) / 8;
        } else if (MediaBrowserCompat$ItemReceiver2 >= 250) {
            int i3 = (MediaBrowserCompat$ItemReceiver2 - 249) * 250;
            int MediaBrowserCompat$ItemReceiver3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8) - (((i2 * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 255) + 1);
            if (MediaBrowserCompat$ItemReceiver3 < 0) {
                MediaBrowserCompat$ItemReceiver3 += 256;
            }
            MediaBrowserCompat$ItemReceiver2 = i3 + MediaBrowserCompat$ItemReceiver3;
            i2++;
        }
        if (MediaBrowserCompat$ItemReceiver2 >= 0) {
            byte[] bArr = new byte[MediaBrowserCompat$ItemReceiver2];
            int i4 = 0;
            while (i4 < MediaBrowserCompat$ItemReceiver2) {
                if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 8) {
                    int MediaBrowserCompat$ItemReceiver4 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8) - (((i2 * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 255) + 1);
                    if (MediaBrowserCompat$ItemReceiver4 < 0) {
                        MediaBrowserCompat$ItemReceiver4 += 256;
                    }
                    bArr[i4] = (byte) MediaBrowserCompat$ItemReceiver4;
                    i4++;
                    i2++;
                } else {
                    throw FormatException.read();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb2 = new StringBuilder("Platform does not support required encoding: ");
                sb2.append(e);
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            throw FormatException.read();
        }
    }

    private static void write(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb) throws FormatException {
        int MediaBrowserCompat$ItemReceiver2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read != 8 && (MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8)) != 254) {
            write(MediaBrowserCompat$ItemReceiver2, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = MediaBrowserCompat$CustomActionResultReceiver;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.read();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw FormatException.read();
                        } else if (z) {
                            sb.append((char) (i3 + PassportService.DEFAULT_MAX_BLOCKSIZE));
                        } else {
                            sb.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = IconCompatParcelizer;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
                        }
                    } else {
                        throw FormatException.read();
                    }
                }
            }
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read <= 0) {
                return;
            }
        }
    }

    private static void IconCompatParcelizer(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb) {
        while (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read > 16) {
            for (int i = 0; i < 4; i++) {
                int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(6);
                if (MediaBrowserCompat$ItemReceiver2 == 31) {
                    int i2 = 8 - iconCompatParcelizer.read;
                    if (i2 != 8) {
                        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2);
                        return;
                    }
                    return;
                }
                if ((MediaBrowserCompat$ItemReceiver2 & 32) == 0) {
                    MediaBrowserCompat$ItemReceiver2 |= 64;
                }
                sb.append((char) MediaBrowserCompat$ItemReceiver2);
            }
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read <= 0) {
                return;
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb) throws FormatException {
        int MediaBrowserCompat$ItemReceiver2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read != 8 && (MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8)) != 254) {
            write(MediaBrowserCompat$ItemReceiver2, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = write;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.read();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = read;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw FormatException.read();
                            }
                        } else {
                            throw FormatException.read();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = MediaBrowserCompat$ItemReceiver;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.read();
                    }
                }
            }
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read <= 0) {
                return;
            }
        }
    }
}
