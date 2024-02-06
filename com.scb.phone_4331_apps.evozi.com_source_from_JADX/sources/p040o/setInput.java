package p040o;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.jmrtd.PassportService;
import p040o.ScriptGroup;
import p040o.getLayers;
import p040o.getMaskAnimations;

/* renamed from: o.setInput */
public final class setInput {
    private static final char[] read = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static getMaskAnimations.read read(byte[] bArr, ScriptGroup.Binding binding, execute execute, Map<rsnIncContextCreate, ?> map) throws FormatException {
        access$002 MediaBrowserCompat$ItemReceiver;
        access$002 access_002;
        String str;
        int i;
        int MediaBrowserCompat$ItemReceiver2;
        int i2;
        ScriptGroup.Binding binding2 = binding;
        getLayers.IconCompatParcelizer iconCompatParcelizer = new getLayers.IconCompatParcelizer(bArr);
        StringBuilder sb = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList = new ArrayList(1);
        int i3 = -1;
        int i4 = -1;
        boolean z2 = false;
        rsnScriptSetTimeZone rsnscriptsettimezone = null;
        while (true) {
            try {
                if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read < 4) {
                    MediaBrowserCompat$ItemReceiver = access$002.TERMINATOR;
                } else {
                    MediaBrowserCompat$ItemReceiver = access$002.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(4));
                }
                access$002 access_0022 = MediaBrowserCompat$ItemReceiver;
                switch (C14973.MediaBrowserCompat$CustomActionResultReceiver[access_0022.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        break;
                    case 8:
                        if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 16) {
                            i3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8);
                            i4 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8);
                            break;
                        } else {
                            throw FormatException.read();
                        }
                    case 9:
                        int MediaBrowserCompat$ItemReceiver3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8);
                        if ((MediaBrowserCompat$ItemReceiver3 & 128) == 0) {
                            i = MediaBrowserCompat$ItemReceiver3 & 127;
                        } else {
                            if ((MediaBrowserCompat$ItemReceiver3 & 192) == 128) {
                                MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8);
                                i2 = (MediaBrowserCompat$ItemReceiver3 & 63) << 8;
                            } else if ((MediaBrowserCompat$ItemReceiver3 & PassportService.DEFAULT_MAX_BLOCKSIZE) == 192) {
                                MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(16);
                                i2 = (MediaBrowserCompat$ItemReceiver3 & 31) << 16;
                            } else {
                                throw FormatException.read();
                            }
                            i = i2 | MediaBrowserCompat$ItemReceiver2;
                        }
                        rsnScriptSetTimeZone IconCompatParcelizer = rsnScriptSetTimeZone.IconCompatParcelizer(i);
                        if (IconCompatParcelizer != null) {
                            rsnscriptsettimezone = IconCompatParcelizer;
                            break;
                        } else {
                            throw FormatException.read();
                        }
                    case 10:
                        int MediaBrowserCompat$ItemReceiver4 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(4);
                        int MediaBrowserCompat$ItemReceiver5 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(access_0022.MediaBrowserCompat$CustomActionResultReceiver(binding2));
                        if (MediaBrowserCompat$ItemReceiver4 == z) {
                            MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, sb, MediaBrowserCompat$ItemReceiver5);
                            break;
                        }
                        break;
                    default:
                        int MediaBrowserCompat$ItemReceiver6 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(access_0022.MediaBrowserCompat$CustomActionResultReceiver(binding2));
                        int i5 = C14973.MediaBrowserCompat$CustomActionResultReceiver[access_0022.ordinal()];
                        if (i5 != z) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    access_002 = access_0022;
                                    read(iconCompatParcelizer, sb, MediaBrowserCompat$ItemReceiver6, rsnscriptsettimezone, arrayList, map);
                                    break;
                                } else if (i5 == 4) {
                                    read(iconCompatParcelizer, sb, MediaBrowserCompat$ItemReceiver6);
                                    break;
                                } else {
                                    throw FormatException.read();
                                }
                            } else {
                                access_002 = access_0022;
                                write(iconCompatParcelizer, sb, MediaBrowserCompat$ItemReceiver6, z2);
                                break;
                            }
                        } else {
                            access_002 = access_0022;
                            write(iconCompatParcelizer, sb, MediaBrowserCompat$ItemReceiver6);
                            break;
                        }
                }
                access_002 = access_0022;
                if (access_002 == access$002.TERMINATOR) {
                    String obj = sb.toString();
                    ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                    if (execute == null) {
                        str = null;
                    } else {
                        str = execute.toString();
                    }
                    return new getMaskAnimations.read(bArr, obj, arrayList2, str, i3, i4);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.read();
            }
        }
    }

    /* renamed from: o.setInput$3 */
    static /* synthetic */ class C14973 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.access$002[] r0 = p040o.access$002.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.access$002 r1 = p040o.access$002.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.access$002 r1 = p040o.access$002.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.access$002 r1 = p040o.access$002.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.access$002 r1 = p040o.access$002.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.access$002 r1 = p040o.access$002.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.access$002 r1 = p040o.access$002.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.access$002 r1 = p040o.access$002.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.access$002 r1 = p040o.access$002.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x006c }
                o.access$002 r1 = p040o.access$002.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.access$002 r1 = p040o.access$002.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setInput.C14973.<clinit>():void");
        }
    }

    private static void write(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 11) {
                int MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(11);
                int i2 = MediaBrowserCompat$ItemReceiver / 45;
                char[] cArr = read;
                if (i2 < cArr.length) {
                    sb.append(cArr[i2]);
                    int i3 = MediaBrowserCompat$ItemReceiver % 45;
                    char[] cArr2 = read;
                    if (i3 < cArr2.length) {
                        sb.append(cArr2[i3]);
                        i -= 2;
                    } else {
                        throw FormatException.read();
                    }
                } else {
                    throw FormatException.read();
                }
            } else {
                throw FormatException.read();
            }
        }
        if (i == 1) {
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 6) {
                int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(6);
                char[] cArr3 = read;
                if (MediaBrowserCompat$ItemReceiver2 < cArr3.length) {
                    sb.append(cArr3[MediaBrowserCompat$ItemReceiver2]);
                } else {
                    throw FormatException.read();
                }
            } else {
                throw FormatException.read();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i4 = length + 1;
                        if (sb.charAt(i4) == '%') {
                            sb.deleteCharAt(i4);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    private static void read(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, int i, rsnScriptSetTimeZone rsnscriptsettimezone, Collection<byte[]> collection, Map<rsnIncContextCreate, ?> map) throws FormatException {
        String str;
        if ((i << 3) <= ((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(8);
            }
            if (rsnscriptsettimezone == null) {
                str = rsnScriptSetVarV.read(bArr, map);
            } else {
                str = rsnscriptsettimezone.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.read();
            }
        } else {
            throw FormatException.read();
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, int i) throws FormatException {
        if (i * 13 <= ((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read) {
            byte[] bArr = new byte[(i << 1)];
            int i2 = 0;
            while (i > 0) {
                int MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(13);
                int i3 = ((MediaBrowserCompat$ItemReceiver / 96) << 8) | (MediaBrowserCompat$ItemReceiver % 96);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.read();
            }
        } else {
            throw FormatException.read();
        }
    }

    private static void read(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, int i) throws FormatException {
        if (i * 13 <= ((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read) {
            byte[] bArr = new byte[(i << 1)];
            int i2 = 0;
            while (i > 0) {
                int MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(13);
                int i3 = ((MediaBrowserCompat$ItemReceiver / 192) << 8) | (MediaBrowserCompat$ItemReceiver % 192);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.read();
            }
        } else {
            throw FormatException.read();
        }
    }

    private static void write(getLayers.IconCompatParcelizer iconCompatParcelizer, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 10) {
                int MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(10);
                if (MediaBrowserCompat$ItemReceiver < 1000) {
                    int i2 = MediaBrowserCompat$ItemReceiver / 100;
                    char[] cArr = read;
                    if (i2 < cArr.length) {
                        sb.append(cArr[i2]);
                        int i3 = (MediaBrowserCompat$ItemReceiver / 10) % 10;
                        char[] cArr2 = read;
                        if (i3 < cArr2.length) {
                            sb.append(cArr2[i3]);
                            int i4 = MediaBrowserCompat$ItemReceiver % 10;
                            char[] cArr3 = read;
                            if (i4 < cArr3.length) {
                                sb.append(cArr3[i4]);
                                i -= 3;
                            } else {
                                throw FormatException.read();
                            }
                        } else {
                            throw FormatException.read();
                        }
                    } else {
                        throw FormatException.read();
                    }
                } else {
                    throw FormatException.read();
                }
            } else {
                throw FormatException.read();
            }
        }
        if (i == 2) {
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 7) {
                int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(7);
                if (MediaBrowserCompat$ItemReceiver2 < 100) {
                    int i5 = MediaBrowserCompat$ItemReceiver2 / 10;
                    char[] cArr4 = read;
                    if (i5 < cArr4.length) {
                        sb.append(cArr4[i5]);
                        int i6 = MediaBrowserCompat$ItemReceiver2 % 10;
                        char[] cArr5 = read;
                        if (i6 < cArr5.length) {
                            sb.append(cArr5[i6]);
                            return;
                        }
                        throw FormatException.read();
                    }
                    throw FormatException.read();
                }
                throw FormatException.read();
            }
            throw FormatException.read();
        } else if (i != 1) {
        } else {
            if (((iconCompatParcelizer.IconCompatParcelizer.length - iconCompatParcelizer.write) << 3) - iconCompatParcelizer.read >= 4) {
                int MediaBrowserCompat$ItemReceiver3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(4);
                if (MediaBrowserCompat$ItemReceiver3 < 10) {
                    char[] cArr6 = read;
                    if (MediaBrowserCompat$ItemReceiver3 < cArr6.length) {
                        sb.append(cArr6[MediaBrowserCompat$ItemReceiver3]);
                        return;
                    }
                    throw FormatException.read();
                }
                throw FormatException.read();
            }
            throw FormatException.read();
        }
    }
}
