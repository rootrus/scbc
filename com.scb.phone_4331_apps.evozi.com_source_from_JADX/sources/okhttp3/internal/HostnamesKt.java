package okhttp3.internal;

import java.net.InetAddress;
import java.util.Arrays;
import p040o.GoodToKnowActivity;
import p040o.GroupFavoriteActivity;
import p040o.SCBUniversalWebViewActivity;

public final class HostnamesKt {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String toCanonicalHost(java.lang.String r5) {
        /*
            java.lang.String r0 = "$this$toCanonicalHost"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = ":"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            boolean r0 = p040o.GoodToKnowActivity.read(r0, r1, r2)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "["
            boolean r0 = p040o.GoodToKnowActivity.read(r5, r0, r2)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "]"
            java.lang.String r4 = "$this$endsWith"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r4)
            java.lang.String r4 = "suffix"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            boolean r0 = r5.endsWith(r0)
            if (r0 == 0) goto L_0x0039
            int r0 = r5.length()
            int r0 = r0 - r1
            java.net.InetAddress r0 = decodeIpv6(r5, r1, r0)
            goto L_0x0041
        L_0x0039:
            int r0 = r5.length()
            java.net.InetAddress r0 = decodeIpv6(r5, r2, r0)
        L_0x0041:
            if (r0 == 0) goto L_0x007d
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L_0x0056
            java.lang.String r5 = "address"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r5)
            java.lang.String r5 = inet6AddressToAscii(r1)
            return r5
        L_0x0056:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L_0x005f
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L_0x005f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid IPv6 address: '"
            r0.append(r1)
            r0.append(r5)
            r5 = 39
            r0.append(r5)
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x007d:
            return r3
        L_0x007e:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            java.lang.String r0 = "IDN.toASCII(host)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x00b7 }
            java.lang.String r4 = "Locale.US"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r4)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            if (r5 == 0) goto L_0x00af
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ IllegalArgumentException -> 0x00b7 }
            int r0 = r0.length()     // Catch:{ IllegalArgumentException -> 0x00b7 }
            if (r0 != 0) goto L_0x00a3
            r2 = r1
        L_0x00a3:
            if (r2 == 0) goto L_0x00a6
            return r3
        L_0x00a6:
            boolean r0 = containsInvalidHostnameAsciiCodes(r5)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            if (r0 == 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r3 = r5
        L_0x00ae:
            return r3
        L_0x00af:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException     // Catch:{ IllegalArgumentException -> 0x00b7 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            throw r5     // Catch:{ IllegalArgumentException -> 0x00b7 }
        L_0x00b7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.toCanonicalHost(java.lang.String):java.lang.String");
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) " #%/:?@[\\]", charAt, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 == i3 + 4) {
            return true;
        }
        return false;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        while (i < bArr.length) {
            if (i == i2) {
                sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(58);
                i += i4;
                if (i == 16) {
                    sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(58);
                }
            } else {
                if (i > 0) {
                    sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(58);
                }
                sCBUniversalWebViewActivity.MediaSessionCompat$ResultReceiverWrapper((long) ((Util.and(bArr[i], 255) << 8) | Util.and(bArr[i + 1], 255)));
                i += 2;
            }
        }
        return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
    }

    private static final InetAddress decodeIpv6(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i5 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !GoodToKnowActivity.write(str, "::", i, false)) {
                    if (i5 != 0) {
                        if (GoodToKnowActivity.write(str, ":", i, false)) {
                            i++;
                        } else if (!GoodToKnowActivity.write(str, ".", i, false) || !decodeIpv4Suffix(str, i4, i2, bArr, i5 - 2)) {
                            return null;
                        } else {
                            i5 += 2;
                        }
                    }
                    i4 = i;
                } else if (i3 != -1) {
                    return null;
                } else {
                    i5 += 2;
                    i3 = i5;
                    if (i6 == i2) {
                        break;
                    }
                    i4 = i6;
                }
                int i7 = 0;
                i = i4;
                while (i < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i));
                    if (parseHexDigit == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + parseHexDigit;
                    i++;
                }
                int i8 = i - i4;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i5 + 1;
                bArr[i5] = (byte) (i7 >>> 8);
                i5 = i9 + 1;
                bArr[i9] = (byte) i7;
            }
        }
        if (i5 != 16) {
            if (i3 == -1) {
                return null;
            }
            int i10 = i5 - i3;
            System.arraycopy(bArr, i3, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i3, (16 - i5) + i3, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }
}
