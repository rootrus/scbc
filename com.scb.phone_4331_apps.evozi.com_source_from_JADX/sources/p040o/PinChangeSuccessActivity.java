package p040o;

import java.util.Arrays;

/* renamed from: o.PinChangeSuccessActivity */
public final class PinChangeSuccessActivity {
    private static final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver;
    private static final char[] write = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        byte[] bArr = new byte[0];
        onGetStartedClick.write((Object) bArr, "data");
        onGetStartedClick.write((Object) bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, 0);
        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        MediaBrowserCompat$ItemReceiver = new SCBUniversalWebViewActivity_ViewBinding(copyOf);
    }

    public static final boolean IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, Object obj) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        if (obj != sCBUniversalWebViewActivity_ViewBinding) {
            if (!(obj instanceof SCBUniversalWebViewActivity_ViewBinding)) {
                return false;
            }
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = (SCBUniversalWebViewActivity_ViewBinding) obj;
            if (sCBUniversalWebViewActivity_ViewBinding2.write() != sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer.length || !sCBUniversalWebViewActivity_ViewBinding2.read(0, sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer, 0, sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer.length)) {
                return false;
            }
        }
        return true;
    }

    public static final SCBUniversalWebViewActivity_ViewBinding read() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final SCBUniversalWebViewActivity_ViewBinding read(String str) {
        onGetStartedClick.write((Object) str, "$receiver");
        onGetStartedClick.write((Object) str, "$receiver");
        byte[] bytes = str.getBytes(GroupFavoriteActivity.IconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = new SCBUniversalWebViewActivity_ViewBinding(bytes);
        sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = str;
        return sCBUniversalWebViewActivity_ViewBinding;
    }

    public static final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "$receiver");
        byte[] write2 = PartnerLandingAdapter$PartnerTileHolder_ViewBinding.write(str);
        if (write2 != null) {
            return new SCBUniversalWebViewActivity_ViewBinding(write2);
        }
        return null;
    }

    public static final SCBUniversalWebViewActivity_ViewBinding write(String str) {
        onGetStartedClick.write((Object) str, "$receiver");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((write(str.charAt(i2)) << 4) + write(str.charAt(i2 + 1)));
            }
            return new SCBUniversalWebViewActivity_ViewBinding(bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private static final int write(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'A';
        if ('a' <= c && 'f' >= c) {
            c2 = 'a';
        } else if ('A' > c || 'F' < c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex digit: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        return (c - c2) + 10;
    }

    public static final String write(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        return PartnerLandingAdapter$PartnerTileHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer);
    }

    public static final int IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding2, "other");
        int write2 = sCBUniversalWebViewActivity_ViewBinding.write();
        int write3 = sCBUniversalWebViewActivity_ViewBinding2.write();
        int min = Math.min(write2, write3);
        int i = 0;
        while (i < min) {
            byte IconCompatParcelizer = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i) & 255;
            byte IconCompatParcelizer2 = sCBUniversalWebViewActivity_ViewBinding2.IconCompatParcelizer(i) & 255;
            if (IconCompatParcelizer == IconCompatParcelizer2) {
                i++;
            } else if (IconCompatParcelizer >= IconCompatParcelizer2) {
                return 1;
            } else {
                return -1;
            }
        }
        if (write2 == write3) {
            return 0;
        }
        if (write2 >= write3) {
            return 1;
        }
        return -1;
    }

    public static final byte IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, int i) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        return sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer[i];
    }

    public static final int MediaBrowserCompat$CustomActionResultReceiver(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        return sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer.length;
    }

    public static final int MediaBrowserCompat$ItemReceiver(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        int i = sCBUniversalWebViewActivity_ViewBinding.read;
        if (i != 0) {
            return i;
        }
        sCBUniversalWebViewActivity_ViewBinding.read = Arrays.hashCode(sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer);
        return sCBUniversalWebViewActivity_ViewBinding.read;
    }

    public static final String read(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        char[] cArr = new char[(sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer.length << 1)];
        int i = 0;
        for (byte b : sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer) {
            int i2 = i + 1;
            char[] cArr2 = write;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static final byte[] IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        return sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer;
    }

    public static final boolean MediaBrowserCompat$CustomActionResultReceiver(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2, int i2, int i3) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding2, "other");
        return sCBUniversalWebViewActivity_ViewBinding2.read(0, sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer, 0, i3);
    }

    public static final boolean write(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, int i, byte[] bArr, int i2, int i3) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        onGetStartedClick.write((Object) bArr, "other");
        return i >= 0 && i <= sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AlertController$RecycleListView.read(sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer, i, bArr, i2, i3);
    }

    public static final boolean read(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding2, "prefix");
        return sCBUniversalWebViewActivity_ViewBinding.read(0, sCBUniversalWebViewActivity_ViewBinding2, sCBUniversalWebViewActivity_ViewBinding2.write());
    }

    public static final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$MediaItem(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        int i = 0;
        while (i < sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer.length) {
            byte b = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new SCBUniversalWebViewActivity_ViewBinding(copyOf);
            }
        }
        return sCBUniversalWebViewActivity_ViewBinding;
    }

    public static final byte[] MediaDescriptionCompat(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        byte[] bArr = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0116, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x014d, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0160, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0171, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0180, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0196, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01a4, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ac, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01de, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x001a, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x001a, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r11 < 65536) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r8 = r8 + r7;
        r6 = r6 + 1;
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r6 >= r5) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r2[r6] < 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r11 = r2[r6];
        r17 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r7 != 64) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r11 == 10) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r11 == 13) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r11 < 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if (31 >= r11) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        if (Byte.MAX_VALUE > r11) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        if (159 < r11) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0072, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r7 != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r11 != 65533) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        if (r11 >= 65536) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0086, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0088, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0098, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a2, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d7, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e9, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00f7, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0108, code lost:
        if (r7 != 64) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String MediaBrowserCompat$SearchResultReceiver(p040o.SCBUniversalWebViewActivity_ViewBinding r18) {
        /*
            r0 = r18
            java.lang.String r1 = "$receiver"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            byte[] r2 = r0.IconCompatParcelizer
            int r2 = r2.length
            if (r2 != 0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x0014:
            byte[] r2 = r0.IconCompatParcelizer
            int r5 = r2.length
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x001a:
            r10 = 64
            if (r6 >= r5) goto L_0x01e2
            byte r11 = r2[r6]
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 31
            r14 = 127(0x7f, float:1.78E-43)
            r15 = 13
            r4 = 65533(0xfffd, float:9.1831E-41)
            r3 = 10
            r9 = 65536(0x10000, float:9.18355E-41)
            r16 = 2
            if (r11 < 0) goto L_0x007b
            int r17 = r7 + 1
            if (r7 == r10) goto L_0x01e2
            if (r11 == r3) goto L_0x0048
            if (r11 == r15) goto L_0x0048
            if (r11 < 0) goto L_0x003f
            if (r13 >= r11) goto L_0x0043
        L_0x003f:
            if (r14 > r11) goto L_0x0045
            if (r12 < r11) goto L_0x0045
        L_0x0043:
            r7 = 1
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            if (r7 != 0) goto L_0x0088
        L_0x0048:
            if (r11 != r4) goto L_0x004b
            goto L_0x0088
        L_0x004b:
            if (r11 >= r9) goto L_0x004f
        L_0x004d:
            r7 = 1
            goto L_0x0051
        L_0x004f:
            r7 = r16
        L_0x0051:
            int r8 = r8 + r7
            int r6 = r6 + 1
            r7 = r17
            if (r6 >= r5) goto L_0x001a
            byte r11 = r2[r6]
            if (r11 < 0) goto L_0x001a
            byte r11 = r2[r6]
            int r17 = r7 + 1
            if (r7 != r10) goto L_0x0064
            goto L_0x01e2
        L_0x0064:
            if (r11 == r3) goto L_0x0075
            if (r11 == r15) goto L_0x0075
            if (r11 < 0) goto L_0x006c
            if (r13 >= r11) goto L_0x0070
        L_0x006c:
            if (r14 > r11) goto L_0x0072
            if (r12 < r11) goto L_0x0072
        L_0x0070:
            r7 = 1
            goto L_0x0073
        L_0x0072:
            r7 = 0
        L_0x0073:
            if (r7 != 0) goto L_0x0088
        L_0x0075:
            if (r11 != r4) goto L_0x0078
            goto L_0x0088
        L_0x0078:
            if (r11 >= r9) goto L_0x004f
            goto L_0x004d
        L_0x007b:
            int r9 = r11 >> 5
            r4 = -2
            r12 = 128(0x80, float:1.794E-43)
            if (r9 != r4) goto L_0x00cf
            int r4 = r6 + 1
            if (r5 > r4) goto L_0x008b
            if (r7 == r10) goto L_0x01e2
        L_0x0088:
            r8 = -1
            goto L_0x01e2
        L_0x008b:
            byte r9 = r2[r6]
            byte r4 = r2[r4]
            r11 = r4 & 192(0xc0, float:2.69E-43)
            if (r11 != r12) goto L_0x0095
            r11 = 1
            goto L_0x0096
        L_0x0095:
            r11 = 0
        L_0x0096:
            if (r11 != 0) goto L_0x009b
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x009b:
            r4 = r4 ^ 3968(0xf80, float:5.56E-42)
            int r9 = r9 << 6
            r4 = r4 ^ r9
            if (r4 >= r12) goto L_0x00a5
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x00a5:
            int r9 = r7 + 1
            if (r7 == r10) goto L_0x01e2
            if (r4 == r3) goto L_0x00bc
            if (r4 == r15) goto L_0x00bc
            if (r4 < 0) goto L_0x00b1
            if (r13 >= r4) goto L_0x00b7
        L_0x00b1:
            if (r14 > r4) goto L_0x00b9
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x00b9
        L_0x00b7:
            r3 = 1
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r3 != 0) goto L_0x0088
        L_0x00bc:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x00c2
            goto L_0x0088
        L_0x00c2:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x00c8
            r16 = 1
        L_0x00c8:
            int r8 = r8 + r16
            int r6 = r6 + 2
        L_0x00cc:
            r7 = r9
            goto L_0x001a
        L_0x00cf:
            int r9 = r11 >> 4
            if (r9 != r4) goto L_0x0145
            int r4 = r6 + 2
            if (r5 > r4) goto L_0x00da
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x00da:
            byte r9 = r2[r6]
            int r11 = r6 + 1
            byte r11 = r2[r11]
            r14 = r11 & 192(0xc0, float:2.69E-43)
            if (r14 != r12) goto L_0x00e6
            r14 = 1
            goto L_0x00e7
        L_0x00e6:
            r14 = 0
        L_0x00e7:
            if (r14 != 0) goto L_0x00ec
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x00ec:
            byte r4 = r2[r4]
            r14 = r4 & 192(0xc0, float:2.69E-43)
            if (r14 != r12) goto L_0x00f4
            r12 = 1
            goto L_0x00f5
        L_0x00f4:
            r12 = 0
        L_0x00f5:
            if (r12 != 0) goto L_0x00fa
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x00fa:
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r12
            int r11 = r11 << 6
            r4 = r4 ^ r11
            int r9 = r9 << 12
            r4 = r4 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r4 >= r9) goto L_0x010c
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x010c:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 > r4) goto L_0x011a
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r9 < r4) goto L_0x011a
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x011a:
            int r9 = r7 + 1
            if (r7 == r10) goto L_0x01e2
            if (r4 == r3) goto L_0x0133
            if (r4 == r15) goto L_0x0133
            if (r4 < 0) goto L_0x0126
            if (r13 >= r4) goto L_0x012e
        L_0x0126:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L_0x0130
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x0130
        L_0x012e:
            r3 = 1
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            if (r3 != 0) goto L_0x0088
        L_0x0133:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x013a
            goto L_0x0088
        L_0x013a:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x0140
            r16 = 1
        L_0x0140:
            int r8 = r8 + r16
            int r6 = r6 + 3
            goto L_0x00cc
        L_0x0145:
            int r9 = r11 >> 3
            if (r9 != r4) goto L_0x01de
            int r4 = r6 + 3
            if (r5 > r4) goto L_0x0151
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x0151:
            byte r9 = r2[r6]
            int r11 = r6 + 1
            byte r11 = r2[r11]
            r14 = r11 & 192(0xc0, float:2.69E-43)
            if (r14 != r12) goto L_0x015d
            r14 = 1
            goto L_0x015e
        L_0x015d:
            r14 = 0
        L_0x015e:
            if (r14 != 0) goto L_0x0164
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x0164:
            int r14 = r6 + 2
            byte r14 = r2[r14]
            r13 = r14 & 192(0xc0, float:2.69E-43)
            if (r13 != r12) goto L_0x016e
            r13 = 1
            goto L_0x016f
        L_0x016e:
            r13 = 0
        L_0x016f:
            if (r13 != 0) goto L_0x0175
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x0175:
            byte r4 = r2[r4]
            r13 = r4 & 192(0xc0, float:2.69E-43)
            if (r13 != r12) goto L_0x017d
            r12 = 1
            goto L_0x017e
        L_0x017d:
            r12 = 0
        L_0x017e:
            if (r12 != 0) goto L_0x0184
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x0184:
            r12 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r12
            int r12 = r14 << 6
            r4 = r4 ^ r12
            int r11 = r11 << 12
            r4 = r4 ^ r11
            int r9 = r9 << 18
            r4 = r4 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r9) goto L_0x019a
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x019a:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 > r4) goto L_0x01a8
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r9 < r4) goto L_0x01a8
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x01a8:
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r9) goto L_0x01b0
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x01b0:
            int r9 = r7 + 1
            if (r7 == r10) goto L_0x01e2
            if (r4 == r3) goto L_0x01cb
            if (r4 == r15) goto L_0x01cb
            if (r4 < 0) goto L_0x01be
            r3 = 31
            if (r3 >= r4) goto L_0x01c6
        L_0x01be:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L_0x01c8
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x01c8
        L_0x01c6:
            r3 = 1
            goto L_0x01c9
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            if (r3 != 0) goto L_0x0088
        L_0x01cb:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x01d2
            goto L_0x0088
        L_0x01d2:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x01d8
            r16 = 1
        L_0x01d8:
            int r8 = r8 + r16
            int r6 = r6 + 4
            goto L_0x00cc
        L_0x01de:
            if (r7 == r10) goto L_0x01e2
            goto L_0x0088
        L_0x01e2:
            java.lang.String r2 = "…]"
            r3 = 93
            java.lang.String r4 = "[size="
            r5 = -1
            if (r8 != r5) goto L_0x027a
            byte[] r5 = r0.IconCompatParcelizer
            int r5 = r5.length
            if (r5 > r10) goto L_0x0209
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[hex="
            r1.append(r2)
            java.lang.String r0 = r18.read()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            goto L_0x0254
        L_0x0209:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            byte[] r4 = r0.IconCompatParcelizer
            int r4 = r4.length
            r3.append(r4)
            java.lang.String r4 = " hex="
            r3.append(r4)
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            byte[] r1 = r0.IconCompatParcelizer
            int r1 = r1.length
            if (r10 > r1) goto L_0x0226
            r4 = 1
            goto L_0x0227
        L_0x0226:
            r4 = 0
        L_0x0227:
            if (r4 == 0) goto L_0x0255
            byte[] r1 = r0.IconCompatParcelizer
            int r1 = r1.length
            if (r10 != r1) goto L_0x022f
            goto L_0x0246
        L_0x022f:
            byte[] r1 = new byte[r10]
            byte[] r0 = r0.IconCompatParcelizer
            java.lang.String r4 = "src"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            java.lang.String r4 = "dest"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r1, r4, r10)
            o.SCBUniversalWebViewActivity_ViewBinding r0 = new o.SCBUniversalWebViewActivity_ViewBinding
            r0.<init>(r1)
        L_0x0246:
            java.lang.String r0 = r0.read()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L_0x0254:
            return r0
        L_0x0255:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex > length("
            r1.append(r2)
            byte[] r0 = r0.IconCompatParcelizer
            int r0 = r0.length
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x027a:
            java.lang.String r1 = MediaMetadataCompat(r18)
            if (r1 == 0) goto L_0x02db
            r5 = 0
            java.lang.String r6 = r1.substring(r5, r8)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r7)
            java.lang.String r7 = "\\"
            java.lang.String r9 = "\\\\"
            java.lang.String r6 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r6, r7, r9, r5)
            java.lang.String r7 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r6 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r6, r7, r9, r5)
            java.lang.String r7 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r5 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r6, r7, r9, r5)
            int r1 = r1.length()
            if (r8 >= r1) goto L_0x02c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            byte[] r0 = r0.IconCompatParcelizer
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " text="
            r1.append(r0)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L_0x02da
        L_0x02c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[text="
            r0.append(r1)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x02da:
            return r0
        L_0x02db:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PinChangeSuccessActivity.MediaBrowserCompat$SearchResultReceiver(o.SCBUniversalWebViewActivity_ViewBinding):java.lang.String");
    }

    public static final String MediaMetadataCompat(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$receiver");
        String str = sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str;
        }
        byte[] MediaBrowserCompat$CustomActionResultReceiver = sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "$receiver");
        String str2 = new String(MediaBrowserCompat$CustomActionResultReceiver, GroupFavoriteActivity.IconCompatParcelizer);
        sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = str2;
        return str2;
    }
}
