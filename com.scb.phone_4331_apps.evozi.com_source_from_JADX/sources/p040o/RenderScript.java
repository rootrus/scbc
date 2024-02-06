package p040o;

import android.util.Base64;
import com.google.common.base.Ascii;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.p088sf.scuba.smartcards.ISO7816;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.getMaskAnimations;
import p040o.loadOrthoWindow;

/* renamed from: o.RenderScript */
public abstract class RenderScript {

    /* renamed from: o.RenderScript$ContextType */
    public enum ContextType {
        FORCE_NONE,
        FORCE_SQUARE,
        FORCE_RECTANGLE
    }

    public abstract byte[] MediaBrowserCompat$ItemReceiver();

    public abstract Int4 read();

    public abstract String write();

    /* renamed from: o.RenderScript$RSMessageHandler */
    public final class RSMessageHandler extends getWrapS {
        private static final char IconCompatParcelizer;
        private static final char[] MediaBrowserCompat$CustomActionResultReceiver;
        private static final char[] MediaBrowserCompat$ItemReceiver = {'T', 'N', '*', 'E'};
        private static final char[] write = {'/', ':', '+', '.'};

        static {
            char[] cArr = {'A', 'B', 'C', 'D'};
            MediaBrowserCompat$CustomActionResultReceiver = cArr;
            IconCompatParcelizer = cArr[0];
        }

        public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
            int i;
            if (str.length() < 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(IconCompatParcelizer);
                sb.append(str);
                sb.append(IconCompatParcelizer);
                str = sb.toString();
            } else {
                char upperCase = Character.toUpperCase(str.charAt(0));
                char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
                boolean MediaBrowserCompat$ItemReceiver2 = run.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, upperCase);
                boolean MediaBrowserCompat$ItemReceiver3 = run.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, upperCase2);
                boolean MediaBrowserCompat$ItemReceiver4 = run.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, upperCase);
                boolean MediaBrowserCompat$ItemReceiver5 = run.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, upperCase2);
                if (MediaBrowserCompat$ItemReceiver2) {
                    if (!MediaBrowserCompat$ItemReceiver3) {
                        StringBuilder sb2 = new StringBuilder("Invalid start/end guards: ");
                        sb2.append(str);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (MediaBrowserCompat$ItemReceiver4) {
                    if (!MediaBrowserCompat$ItemReceiver5) {
                        StringBuilder sb3 = new StringBuilder("Invalid start/end guards: ");
                        sb3.append(str);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                } else if (MediaBrowserCompat$ItemReceiver3 || MediaBrowserCompat$ItemReceiver5) {
                    StringBuilder sb4 = new StringBuilder("Invalid start/end guards: ");
                    sb4.append(str);
                    throw new IllegalArgumentException(sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(IconCompatParcelizer);
                    sb5.append(str);
                    sb5.append(IconCompatParcelizer);
                    str = sb5.toString();
                }
            }
            int i2 = 20;
            for (int i3 = 1; i3 < str.length() - 1; i3++) {
                if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                    i2 += 9;
                } else if (run.MediaBrowserCompat$ItemReceiver(write, str.charAt(i3))) {
                    i2 += 10;
                } else {
                    StringBuilder sb6 = new StringBuilder("Cannot encode : '");
                    sb6.append(str.charAt(i3));
                    sb6.append('\'');
                    throw new IllegalArgumentException(sb6.toString());
                }
            }
            boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
            int i4 = 0;
            for (int i5 = 0; i5 < str.length(); i5++) {
                char upperCase3 = Character.toUpperCase(str.charAt(i5));
                if (i5 == 0 || i5 == str.length() - 1) {
                    if (upperCase3 == '*') {
                        upperCase3 = 'C';
                    } else if (upperCase3 == 'E') {
                        upperCase3 = 'D';
                    } else if (upperCase3 == 'N') {
                        upperCase3 = 'B';
                    } else if (upperCase3 == 'T') {
                        upperCase3 = 'A';
                    }
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= run.MediaBrowserCompat$CustomActionResultReceiver.length) {
                        i = 0;
                        break;
                    } else if (upperCase3 == run.MediaBrowserCompat$CustomActionResultReceiver[i6]) {
                        i = run.IconCompatParcelizer[i6];
                        break;
                    } else {
                        i6++;
                    }
                }
                int i7 = 0;
                int i8 = 0;
                boolean z = true;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                        i8 = 0;
                    } else {
                        i8++;
                    }
                }
                if (i5 < str.length() - 1) {
                    zArr[i4] = false;
                    i4++;
                }
            }
            return zArr;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = write();
        objArr[1] = read();
        objArr[2] = MediaBrowserCompat$ItemReceiver() == null ? "" : Base64.encodeToString(MediaBrowserCompat$ItemReceiver(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public static RenderScript$MediaBrowserCompat$ItemReceiver IconCompatParcelizer() {
        loadOrthoWindow.IconCompatParcelizer iconCompatParcelizer = new loadOrthoWindow.IconCompatParcelizer();
        Int4 int4 = Int4.DEFAULT;
        if (int4 != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = int4;
            return iconCompatParcelizer;
        }
        throw new NullPointerException("Null priority");
    }

    /* renamed from: o.RenderScript$Priority */
    public final class Priority extends getWrapS {

        /* renamed from: o.RenderScript$Priority$read */
        enum read {
            UNCODABLE,
            ONE_DIGIT,
            TWO_DIGITS,
            FNC_1
        }

        public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
            if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.CODE_128) {
                return super.write(str, rsnincallocationcreatetyped, i, i2, map);
            }
            StringBuilder sb = new StringBuilder("Can only encode CODE_128, but got ");
            sb.append(rsnincallocationcreatetyped);
            throw new IllegalArgumentException(sb.toString());
        }

        public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
            int length = str.length();
            if (length <= 0 || length > 80) {
                StringBuilder sb = new StringBuilder("Contents length should be between 1 and 80 characters, but got ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt <= 127) {
                            break;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Bad character in input: ");
                            sb2.append(charAt);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList<>();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                int i7 = 103;
                if (i3 < length) {
                    int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(str, i3, i5);
                    int i8 = 100;
                    if (MediaBrowserCompat$ItemReceiver == i5) {
                        switch (str.charAt(i3)) {
                            case 241:
                                i8 = 102;
                                break;
                            case 242:
                                i8 = 97;
                                break;
                            case 243:
                                i8 = 96;
                                break;
                            case 244:
                                if (i5 == 101) {
                                    i8 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i5 != 100) {
                                    if (i5 == 101) {
                                        i8 = str.charAt(i3) - ' ';
                                        if (i8 < 0) {
                                            i8 += 96;
                                            break;
                                        }
                                    } else {
                                        i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                        i3++;
                                        break;
                                    }
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    break;
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i5 != 0) {
                            i7 = MediaBrowserCompat$ItemReceiver;
                        } else if (MediaBrowserCompat$ItemReceiver == 100) {
                            i7 = 104;
                        } else if (MediaBrowserCompat$ItemReceiver != 101) {
                            i7 = 105;
                        }
                        i8 = i7;
                        i5 = MediaBrowserCompat$ItemReceiver;
                    }
                    arrayList.add(RSErrorHandler.MediaBrowserCompat$ItemReceiver[i8]);
                    i4 += i8 * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                } else {
                    arrayList.add(RSErrorHandler.MediaBrowserCompat$ItemReceiver[i4 % 103]);
                    arrayList.add(RSErrorHandler.MediaBrowserCompat$ItemReceiver[106]);
                    int i9 = 0;
                    for (int[] iArr : arrayList) {
                        for (int i10 : (int[]) r13.next()) {
                            i9 += i10;
                        }
                    }
                    boolean[] zArr = new boolean[i9];
                    for (int[] read2 : arrayList) {
                        i += read(zArr, i, read2, true);
                    }
                    return zArr;
                }
            }
        }

        private static read IconCompatParcelizer(CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i >= length) {
                return read.UNCODABLE;
            }
            char charAt = charSequence.charAt(i);
            if (charAt == 241) {
                return read.FNC_1;
            }
            if (charAt < '0' || charAt > '9') {
                return read.UNCODABLE;
            }
            int i2 = i + 1;
            if (i2 >= length) {
                return read.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 < '0' || charAt2 > '9') {
                return read.ONE_DIGIT;
            }
            return read.TWO_DIGITS;
        }

        private static int MediaBrowserCompat$ItemReceiver(CharSequence charSequence, int i, int i2) {
            read IconCompatParcelizer;
            read IconCompatParcelizer2;
            char charAt;
            read IconCompatParcelizer3 = IconCompatParcelizer(charSequence, i);
            if (IconCompatParcelizer3 == read.ONE_DIGIT) {
                return 100;
            }
            if (IconCompatParcelizer3 == read.UNCODABLE) {
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) {
                    return 100;
                }
                return 101;
            } else if (i2 == 99) {
                return 99;
            } else {
                if (i2 != 100) {
                    if (IconCompatParcelizer3 == read.FNC_1) {
                        IconCompatParcelizer3 = IconCompatParcelizer(charSequence, i + 1);
                    }
                    if (IconCompatParcelizer3 == read.TWO_DIGITS) {
                        return 99;
                    }
                    return 100;
                } else if (IconCompatParcelizer3 == read.FNC_1 || (IconCompatParcelizer = IconCompatParcelizer(charSequence, i + 2)) == read.UNCODABLE || IconCompatParcelizer == read.ONE_DIGIT) {
                    return 100;
                } else {
                    if (IconCompatParcelizer != read.FNC_1) {
                        int i3 = i + 4;
                        while (true) {
                            IconCompatParcelizer2 = IconCompatParcelizer(charSequence, i3);
                            if (IconCompatParcelizer2 != read.TWO_DIGITS) {
                                break;
                            }
                            i3 += 2;
                        }
                        if (IconCompatParcelizer2 == read.ONE_DIGIT) {
                            return 100;
                        }
                        return 99;
                    } else if (IconCompatParcelizer(charSequence, i + 3) == read.TWO_DIGITS) {
                        return 99;
                    } else {
                        return 100;
                    }
                }
            }
        }
    }

    /* renamed from: o.RenderScript$MessageThread */
    public final class MessageThread {
        private static final String[] MediaBrowserCompat$ItemReceiver = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

        public static getMaskAnimations.read MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i) {
            String str;
            StringBuilder sb = new StringBuilder(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
            if (i == 2 || i == 3) {
                if (i == 2) {
                    str = new DecimalFormat("0000000000".substring(0, read(bArr, new byte[]{39, 40, 41, ISO7816.INS_PSO, Ascii.f3259US, 32}))).format((long) read(bArr, new byte[]{33, ISO7816.INS_MSE, 35, ISO7816.INS_CHANGE_CHV, Ascii.f3248EM, Ascii.SUB, Ascii.ESC, 28, 29, 30, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, 13, 14, 15, 16, 17, Ascii.DC2, 7, 8, 9, 10, 11, 12, 1, 2}));
                } else {
                    str = String.valueOf(new char[]{MediaBrowserCompat$ItemReceiver[0].charAt(read(bArr, new byte[]{39, 40, 41, ISO7816.INS_PSO, Ascii.f3259US, 32})), MediaBrowserCompat$ItemReceiver[0].charAt(read(bArr, new byte[]{33, ISO7816.INS_MSE, 35, ISO7816.INS_CHANGE_CHV, Ascii.f3248EM, Ascii.SUB})), MediaBrowserCompat$ItemReceiver[0].charAt(read(bArr, new byte[]{Ascii.ESC, 28, 29, 30, 19, Ascii.DC4})), MediaBrowserCompat$ItemReceiver[0].charAt(read(bArr, new byte[]{Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, 13, 14})), MediaBrowserCompat$ItemReceiver[0].charAt(read(bArr, new byte[]{15, 16, 17, Ascii.DC2, 7, 8})), MediaBrowserCompat$ItemReceiver[0].charAt(read(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format((long) read(bArr, new byte[]{53, 54, 43, ISO7816.INS_UNBLOCK_CHV, 45, 46, 47, ISO7816.INS_DECREASE, 37, 38}));
                String format2 = decimalFormat.format((long) read(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED}));
                sb.append(write(bArr, 10, 84));
                if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(29);
                    sb2.append(format);
                    sb2.append(29);
                    sb2.append(format2);
                    sb2.append(29);
                    sb.insert(9, sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(29);
                    sb3.append(format);
                    sb3.append(29);
                    sb3.append(format2);
                    sb3.append(29);
                    sb.insert(0, sb3.toString());
                }
            } else if (i == 4) {
                sb.append(write(bArr, 1, 93));
            } else if (i == 5) {
                sb.append(write(bArr, 1, 77));
            }
            return new getMaskAnimations.read(bArr, sb.toString(), (List<byte[]>) null, String.valueOf(i));
        }

        private static int read(byte[] bArr, byte[] bArr2) {
            if (bArr2.length != 0) {
                int i = 0;
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    int i3 = bArr2[i2] - 1;
                    i += ((bArr[i3 / 6] & (1 << (5 - (i3 % 6)))) == 0 ? 0 : 1) << ((bArr2.length - i2) - 1);
                }
                return i;
            }
            throw new IllegalArgumentException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
            r6 = r5;
            r5 = r4;
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
            if (r6 != 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
            r4 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
            r3 = r3 + 1;
            r6 = r6 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
            r6 = -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String write(byte[] r15, int r16, int r17) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = -1
                r2 = 0
                r3 = r16
                r6 = r1
                r4 = r2
                r5 = r4
            L_0x000c:
                int r7 = r16 + r17
                r8 = 1
                if (r3 >= r7) goto L_0x0069
                java.lang.String[] r7 = MediaBrowserCompat$ItemReceiver
                r7 = r7[r4]
                byte r9 = r15[r3]
                char r7 = r7.charAt(r9)
                switch(r7) {
                    case 65520: goto L_0x005b;
                    case 65521: goto L_0x005b;
                    case 65522: goto L_0x005b;
                    case 65523: goto L_0x005b;
                    case 65524: goto L_0x005b;
                    case 65525: goto L_0x0056;
                    case 65526: goto L_0x0054;
                    case 65527: goto L_0x0051;
                    case 65528: goto L_0x004e;
                    case 65529: goto L_0x0052;
                    case 65530: goto L_0x001e;
                    case 65531: goto L_0x0022;
                    default: goto L_0x001e;
                }
            L_0x001e:
                r0.append(r7)
                goto L_0x0062
            L_0x0022:
                int r3 = r3 + 1
                byte r7 = r15[r3]
                int r3 = r3 + r8
                byte r9 = r15[r3]
                int r3 = r3 + r8
                byte r10 = r15[r3]
                int r3 = r3 + r8
                byte r11 = r15[r3]
                int r3 = r3 + r8
                byte r12 = r15[r3]
                java.text.DecimalFormat r13 = new java.text.DecimalFormat
                java.lang.String r14 = "000000000"
                r13.<init>(r14)
                int r7 = r7 << 24
                int r9 = r9 << 18
                int r7 = r7 + r9
                int r9 = r10 << 12
                int r7 = r7 + r9
                int r9 = r11 << 6
                int r7 = r7 + r9
                int r7 = r7 + r12
                long r9 = (long) r7
                java.lang.String r7 = r13.format(r9)
                r0.append(r7)
                goto L_0x0062
            L_0x004e:
                r6 = r1
                r4 = r8
                goto L_0x0062
            L_0x0051:
                r4 = r2
            L_0x0052:
                r6 = r1
                goto L_0x0062
            L_0x0054:
                r5 = 3
                goto L_0x0057
            L_0x0056:
                r5 = 2
            L_0x0057:
                r6 = r5
                r5 = r4
                r4 = r2
                goto L_0x0062
            L_0x005b:
                r5 = 65520(0xfff0, float:9.1813E-41)
                int r7 = r7 - r5
                r5 = r4
                r4 = r7
                r6 = r8
            L_0x0062:
                if (r6 != 0) goto L_0x0065
                r4 = r5
            L_0x0065:
                int r3 = r3 + r8
                int r6 = r6 + -1
                goto L_0x000c
            L_0x0069:
                int r1 = r0.length()
                if (r1 <= 0) goto L_0x0086
                int r1 = r0.length()
                int r1 = r1 - r8
                char r1 = r0.charAt(r1)
                r2 = 65532(0xfffc, float:9.183E-41)
                if (r1 != r2) goto L_0x0086
                int r1 = r0.length()
                int r1 = r1 - r8
                r0.setLength(r1)
                goto L_0x0069
            L_0x0086:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RenderScript.MessageThread.write(byte[], int, int):java.lang.String");
        }
    }

    /* renamed from: o.RenderScript$RSErrorHandler */
    public final class RSErrorHandler extends getMinification {
        static final int[][] MediaBrowserCompat$ItemReceiver = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

        private static int read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, int i) throws NotFoundException {
            MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i, iArr);
            float f = 0.25f;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                int[][] iArr2 = MediaBrowserCompat$ItemReceiver;
                if (i3 >= iArr2.length) {
                    break;
                }
                float IconCompatParcelizer = IconCompatParcelizer(iArr, iArr2[i3], 0.7f);
                if (IconCompatParcelizer < f) {
                    i2 = i3;
                    f = IconCompatParcelizer;
                }
                i3++;
            }
            if (i2 >= 0) {
                return i2;
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x019e, code lost:
            r16 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a0, code lost:
            r6 = false;
            r10 = 'd';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d2, code lost:
            r15 = 'e';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x01db, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x01de, code lost:
            if (r19 == false) goto L_0x01e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e0, code lost:
            if (r15 != 'e') goto L_0x01e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x01e2, code lost:
            r15 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x01e4, code lost:
            r15 = 'e';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e5, code lost:
            r19 = r6;
            r13 = r8;
            r8 = r22;
            r6 = 6;
            r24 = r18;
            r18 = r2;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0147, code lost:
            if (r9 != false) goto L_0x018f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x014d, code lost:
            r10 = 'd';
            r15 = 'd';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0189, code lost:
            r11 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x018d, code lost:
            if (r9 != false) goto L_0x018f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x018f, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0190, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0192, code lost:
            r9 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0194, code lost:
            r6 = false;
            r10 = 'd';
            r15 = 'c';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x019b, code lost:
            r10 = 'd';
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int r26, p040o.rsnScriptIntrinsicCreate r27, java.util.Map<p040o.rsnIncContextCreate, ?> r28) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
            /*
                r25 = this;
                r0 = r27
                r1 = r28
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0012
                o.rsnIncContextCreate r4 = p040o.rsnIncContextCreate.ASSUME_GS1
                boolean r1 = r1.containsKey(r4)
                if (r1 == 0) goto L_0x0012
                r1 = r2
                goto L_0x0013
            L_0x0012:
                r1 = r3
            L_0x0013:
                int r4 = r0.read
                int r5 = r0.read((int) r3)
                r6 = 6
                int[] r7 = new int[r6]
                r9 = r3
                r10 = r9
                r8 = r5
            L_0x001f:
                if (r5 >= r4) goto L_0x02ad
                r11 = r5 & 31
                int r11 = r2 << r11
                int[] r12 = r0.write
                int r13 = r5 / 32
                r12 = r12[r13]
                r11 = r11 & r12
                if (r11 == 0) goto L_0x0030
                r11 = r2
                goto L_0x0031
            L_0x0030:
                r11 = r3
            L_0x0031:
                if (r11 == r9) goto L_0x0041
                r11 = r7[r10]
                int r11 = r11 + r2
                r7[r10] = r11
                r6 = r26
                r24 = r3
                r3 = r2
                r2 = r24
                goto L_0x02a3
            L_0x0041:
                r11 = 5
                if (r10 != r11) goto L_0x0299
                r11 = 1048576000(0x3e800000, float:0.25)
                r12 = -1
                r14 = 103(0x67, float:1.44E-43)
            L_0x0049:
                r15 = 105(0x69, float:1.47E-43)
                if (r14 > r15) goto L_0x0061
                int[][] r15 = MediaBrowserCompat$ItemReceiver
                r15 = r15[r14]
                r13 = 1060320051(0x3f333333, float:0.7)
                float r13 = IconCompatParcelizer((int[]) r7, (int[]) r15, (float) r13)
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 >= 0) goto L_0x005e
                r11 = r13
                r12 = r14
            L_0x005e:
                int r14 = r14 + 1
                goto L_0x0049
            L_0x0061:
                r11 = 2
                if (r12 < 0) goto L_0x0283
                int r13 = r5 - r8
                int r13 = r13 / r11
                int r13 = r8 - r13
                int r13 = java.lang.Math.max(r3, r13)
                boolean r13 = r0.IconCompatParcelizer(r13, r8)
                if (r13 == 0) goto L_0x0283
                r4 = 3
                int[] r4 = new int[r4]
                r4[r3] = r8
                r4[r2] = r5
                r4[r11] = r12
                r5 = r4[r11]
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 20
                r7.<init>(r8)
                byte r9 = (byte) r5
                java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
                r7.add(r9)
                switch(r5) {
                    case 103: goto L_0x009b;
                    case 104: goto L_0x0098;
                    case 105: goto L_0x0095;
                    default: goto L_0x0090;
                }
            L_0x0090:
                com.google.zxing.FormatException r0 = com.google.zxing.FormatException.read()
                throw r0
            L_0x0095:
                r13 = 99
                goto L_0x009d
            L_0x0098:
                r13 = 100
                goto L_0x009d
            L_0x009b:
                r13 = 101(0x65, float:1.42E-43)
            L_0x009d:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>(r8)
                r8 = r4[r3]
                r15 = r4[r2]
                int[] r3 = new int[r6]
                r20 = r2
                r2 = 0
                r9 = 0
                r11 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r24 = r13
                r13 = r8
                r8 = r15
                r15 = r24
            L_0x00bb:
                if (r16 != 0) goto L_0x01f3
                int r2 = read(r0, r3, r8)
                byte r13 = (byte) r2
                java.lang.Byte r13 = java.lang.Byte.valueOf(r13)
                r7.add(r13)
                r13 = 106(0x6a, float:1.49E-43)
                if (r2 == r13) goto L_0x00cf
                r20 = 1
            L_0x00cf:
                if (r2 == r13) goto L_0x00d7
                int r17 = r17 + 1
                int r21 = r17 * r2
                int r5 = r5 + r21
            L_0x00d7:
                r22 = r8
                r10 = 0
            L_0x00da:
                if (r10 >= r6) goto L_0x00e3
                r23 = r3[r10]
                int r22 = r22 + r23
                int r10 = r10 + 1
                goto L_0x00da
            L_0x00e3:
                switch(r2) {
                    case 103: goto L_0x00f1;
                    case 104: goto L_0x00f1;
                    case 105: goto L_0x00f1;
                    default: goto L_0x00e6;
                }
            L_0x00e6:
                r10 = 96
                java.lang.String r6 = "]C1"
                switch(r15) {
                    case 99: goto L_0x01a4;
                    case 100: goto L_0x0153;
                    case 101: goto L_0x00f6;
                    default: goto L_0x00ed;
                }
            L_0x00ed:
                r10 = 100
                goto L_0x01db
            L_0x00f1:
                com.google.zxing.FormatException r0 = com.google.zxing.FormatException.read()
                throw r0
            L_0x00f6:
                r12 = 64
                if (r2 >= r12) goto L_0x010e
                if (r9 != r11) goto L_0x0104
                int r6 = r2 + 32
                char r6 = (char) r6
                r14.append(r6)
                goto L_0x0190
            L_0x0104:
                int r6 = r2 + 32
                int r6 = r6 + 128
                char r6 = (char) r6
                r14.append(r6)
                goto L_0x0190
            L_0x010e:
                if (r2 >= r10) goto L_0x0122
                if (r9 != r11) goto L_0x011a
                int r6 = r2 + -64
                char r6 = (char) r6
                r14.append(r6)
                goto L_0x0190
            L_0x011a:
                int r6 = r2 + 64
                char r6 = (char) r6
                r14.append(r6)
                goto L_0x0190
            L_0x0122:
                if (r2 == r13) goto L_0x0126
                r20 = 0
            L_0x0126:
                if (r2 == r13) goto L_0x019e
                switch(r2) {
                    case 98: goto L_0x014c;
                    case 99: goto L_0x0194;
                    case 100: goto L_0x014a;
                    case 101: goto L_0x0141;
                    case 102: goto L_0x012d;
                    default: goto L_0x012b;
                }
            L_0x012b:
                goto L_0x01a0
            L_0x012d:
                if (r1 == 0) goto L_0x01a0
                int r10 = r14.length()
                if (r10 != 0) goto L_0x013a
                r14.append(r6)
                goto L_0x01a0
            L_0x013a:
                r6 = 29
                r14.append(r6)
                goto L_0x01a0
            L_0x0141:
                if (r11 != 0) goto L_0x0145
                if (r9 != 0) goto L_0x0189
            L_0x0145:
                if (r11 == 0) goto L_0x0192
                if (r9 == 0) goto L_0x0192
                goto L_0x018f
            L_0x014a:
                r6 = 0
                goto L_0x014d
            L_0x014c:
                r6 = 1
            L_0x014d:
                r10 = 100
                r15 = 100
                goto L_0x01dc
            L_0x0153:
                if (r2 >= r10) goto L_0x0167
                if (r9 != r11) goto L_0x015e
                int r6 = r2 + 32
                char r6 = (char) r6
                r14.append(r6)
                goto L_0x0190
            L_0x015e:
                int r6 = r2 + 32
                int r6 = r6 + 128
                char r6 = (char) r6
                r14.append(r6)
                goto L_0x0190
            L_0x0167:
                if (r2 == r13) goto L_0x016b
                r20 = 0
            L_0x016b:
                if (r2 == r13) goto L_0x019e
                switch(r2) {
                    case 98: goto L_0x019a;
                    case 99: goto L_0x0194;
                    case 100: goto L_0x0185;
                    case 101: goto L_0x0183;
                    case 102: goto L_0x0171;
                    default: goto L_0x0170;
                }
            L_0x0170:
                goto L_0x01a0
            L_0x0171:
                if (r1 == 0) goto L_0x01a0
                int r10 = r14.length()
                if (r10 != 0) goto L_0x017d
                r14.append(r6)
                goto L_0x01a0
            L_0x017d:
                r6 = 29
                r14.append(r6)
                goto L_0x01a0
            L_0x0183:
                r6 = 0
                goto L_0x019b
            L_0x0185:
                if (r11 != 0) goto L_0x018b
                if (r9 == 0) goto L_0x018b
            L_0x0189:
                r11 = 1
                goto L_0x0190
            L_0x018b:
                if (r11 == 0) goto L_0x0192
                if (r9 == 0) goto L_0x0192
            L_0x018f:
                r11 = 0
            L_0x0190:
                r9 = 0
                goto L_0x01a0
            L_0x0192:
                r9 = 1
                goto L_0x01a0
            L_0x0194:
                r6 = 0
                r10 = 100
                r15 = 99
                goto L_0x01dc
            L_0x019a:
                r6 = 1
            L_0x019b:
                r10 = 100
                goto L_0x01d2
            L_0x019e:
                r16 = 1
            L_0x01a0:
                r6 = 0
                r10 = 100
                goto L_0x01dc
            L_0x01a4:
                r10 = 100
                if (r2 >= r10) goto L_0x01b5
                r6 = 10
                if (r2 >= r6) goto L_0x01b1
                r6 = 48
                r14.append(r6)
            L_0x01b1:
                r14.append(r2)
                goto L_0x01db
            L_0x01b5:
                if (r2 == r13) goto L_0x01b9
                r20 = 0
            L_0x01b9:
                if (r2 == r13) goto L_0x01d7
                switch(r2) {
                    case 100: goto L_0x01d5;
                    case 101: goto L_0x01d1;
                    case 102: goto L_0x01bf;
                    default: goto L_0x01be;
                }
            L_0x01be:
                goto L_0x01db
            L_0x01bf:
                if (r1 == 0) goto L_0x01db
                int r12 = r14.length()
                if (r12 != 0) goto L_0x01cb
                r14.append(r6)
                goto L_0x01db
            L_0x01cb:
                r6 = 29
                r14.append(r6)
                goto L_0x01db
            L_0x01d1:
                r6 = 0
            L_0x01d2:
                r15 = 101(0x65, float:1.42E-43)
                goto L_0x01dc
            L_0x01d5:
                r15 = r10
                goto L_0x01db
            L_0x01d7:
                r6 = 0
                r16 = 1
                goto L_0x01dc
            L_0x01db:
                r6 = 0
            L_0x01dc:
                r12 = 101(0x65, float:1.42E-43)
                if (r19 == 0) goto L_0x01e5
                if (r15 != r12) goto L_0x01e4
                r15 = r10
                goto L_0x01e5
            L_0x01e4:
                r15 = r12
            L_0x01e5:
                r19 = r6
                r13 = r8
                r8 = r22
                r6 = 6
                r24 = r18
                r18 = r2
                r2 = r24
                goto L_0x00bb
            L_0x01f3:
                int r1 = r0.write(r8)
                int r3 = r0.read
                int r6 = r1 - r13
                r9 = 2
                int r6 = r6 / r9
                int r6 = r6 + r1
                int r3 = java.lang.Math.min(r3, r6)
                boolean r0 = r0.IconCompatParcelizer(r1, r3)
                if (r0 == 0) goto L_0x027e
                int r17 = r17 * r2
                int r5 = r5 - r17
                r0 = 103(0x67, float:1.44E-43)
                int r5 = r5 % r0
                if (r5 != r2) goto L_0x0279
                int r0 = r14.length()
                if (r0 == 0) goto L_0x0274
                if (r0 <= 0) goto L_0x022a
                if (r20 == 0) goto L_0x022a
                r1 = 99
                if (r15 != r1) goto L_0x0225
                int r1 = r0 + -2
                r14.delete(r1, r0)
                goto L_0x022a
            L_0x0225:
                int r1 = r0 + -1
                r14.delete(r1, r0)
            L_0x022a:
                r0 = 1
                r1 = r4[r0]
                r0 = 0
                r2 = r4[r0]
                int r1 = r1 + r2
                float r0 = (float) r1
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                float r2 = (float) r13
                int r8 = r8 - r13
                float r3 = (float) r8
                float r3 = r3 / r1
                int r1 = r7.size()
                byte[] r4 = new byte[r1]
                r5 = 0
            L_0x0240:
                if (r5 >= r1) goto L_0x0251
                java.lang.Object r6 = r7.get(r5)
                java.lang.Byte r6 = (java.lang.Byte) r6
                byte r6 = r6.byteValue()
                r4[r5] = r6
                int r5 = r5 + 1
                goto L_0x0240
            L_0x0251:
                java.lang.String r1 = r14.toString()
                r5 = 2
                o.rsnScriptForEach[] r5 = new p040o.rsnScriptForEach[r5]
                r6 = r26
                float r6 = (float) r6
                o.rsnScriptForEach r7 = new o.rsnScriptForEach
                r7.<init>(r0, r6)
                r0 = 0
                r5[r0] = r7
                o.rsnScriptForEach r0 = new o.rsnScriptForEach
                float r2 = r2 + r3
                r0.<init>(r2, r6)
                r2 = 1
                r5[r2] = r0
                o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.getLayers$MediaBrowserCompat$CustomActionResultReceiver
                o.rsnIncAllocationCreateTyped r2 = p040o.rsnIncAllocationCreateTyped.CODE_128
                r0.<init>(r1, r4, r5, r2)
                return r0
            L_0x0274:
                com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
                throw r0
            L_0x0279:
                com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.write()
                throw r0
            L_0x027e:
                com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
                throw r0
            L_0x0283:
                r6 = r26
                r2 = r3
                r3 = r7[r2]
                r11 = 1
                r12 = r7[r11]
                int r3 = r3 + r12
                int r8 = r8 + r3
                int r3 = r10 + -1
                r11 = 2
                java.lang.System.arraycopy(r7, r11, r7, r2, r3)
                r7[r3] = r2
                r7[r10] = r2
                r10 = r3
                goto L_0x029e
            L_0x0299:
                r6 = r26
                r2 = r3
                int r10 = r10 + 1
            L_0x029e:
                r3 = 1
                r7[r10] = r3
                r9 = r9 ^ 1
            L_0x02a3:
                int r5 = r5 + 1
                r6 = 6
                r24 = r3
                r3 = r2
                r2 = r24
                goto L_0x001f
            L_0x02ad:
                com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RenderScript.RSErrorHandler.IconCompatParcelizer(int, o.rsnScriptIntrinsicCreate, java.util.Map):o.getLayers$MediaBrowserCompat$CustomActionResultReceiver");
        }
    }
}
