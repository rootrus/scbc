package com.google.common.net;

import com.google.common.base.Preconditions;
import com.google.common.p002io.ByteStreams;
import com.google.common.primitives.Ints;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

public final class InetAddresses {
    /* access modifiers changed from: private */
    public static final Inet4Address ANY4 = ((Inet4Address) forString("0.0.0.0"));
    private static final int IPV4_PART_COUNT = 4;
    private static final int IPV6_PART_COUNT = 8;
    private static final Inet4Address LOOPBACK4 = ((Inet4Address) forString("127.0.0.1"));

    static int hash64To32(long j) {
        long j2 = (~j) + (j << 18);
        long j3 = ((j2 >>> 31) ^ j2) * 21;
        long j4 = j3 ^ (j3 >>> 11);
        long j5 = j4 + (j4 << 6);
        return (int) (j5 ^ (j5 >>> 22));
    }

    private InetAddresses() {
    }

    private static Inet4Address getInet4Address(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", Integer.valueOf(bArr.length));
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (byAddress instanceof Inet4Address) {
                return (Inet4Address) byAddress;
            }
            throw new UnknownHostException(String.format("'%s' is not an IPv4 address.", new Object[]{byAddress.getHostAddress()}));
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException(String.format("Host address '%s' is not a valid IPv4 address.", new Object[]{Arrays.toString(bArr)}), e);
        }
    }

    public static InetAddress forString(String str) {
        byte[] textToNumericFormatV4 = textToNumericFormatV4(str);
        if (textToNumericFormatV4 == null) {
            textToNumericFormatV4 = textToNumericFormatV6(str);
        }
        if (textToNumericFormatV4 != null) {
            try {
                return InetAddress.getByAddress(textToNumericFormatV4);
            } catch (UnknownHostException e) {
                throw new IllegalArgumentException(String.format("'%s' is extremely broken.", new Object[]{str}), e);
            }
        } else {
            throw new IllegalArgumentException(String.format("'%s' is not an IP string literal.", new Object[]{str}));
        }
    }

    public static boolean isInetAddress(String str) {
        try {
            forString(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static byte[] textToNumericFormatV4(String str) {
        if (str.contains(":")) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        while (i < 4) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                if (parseInt >= 0 && parseInt <= 255) {
                    if (split[i].startsWith("0") && split[i].length() != 1) {
                        return null;
                    }
                    bArr[i] = (byte) parseInt;
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
            return null;
        }
        return bArr;
    }

    private static byte[] textToNumericFormatV6(String str) {
        int i;
        if (!str.contains(":") || str.contains(":::")) {
            return null;
        }
        if (str.contains(".") && (str = convertDottedQuadToHex(str)) == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        String[] split = str.split("::", 2);
        int i2 = 0;
        if (!split[0].equals("")) {
            String[] split2 = split[0].split(":", 8);
            int i3 = 0;
            while (i3 < split2.length) {
                try {
                    if (split2[i3].equals("")) {
                        return null;
                    }
                    allocate.putShort(i3 << 1, (short) Integer.parseInt(split2[i3], 16));
                    i3++;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            i = split2.length;
        } else {
            i = 1;
        }
        if (split.length > 1) {
            if (!split[1].equals("")) {
                String[] split3 = split[1].split(":", 8);
                while (i2 < split3.length) {
                    try {
                        int length = (split3.length - i2) - 1;
                        if (split3[length].equals("")) {
                            return null;
                        }
                        allocate.putShort(((8 - i2) - 1) << 1, (short) Integer.parseInt(split3[length], 16));
                        i2++;
                    } catch (NumberFormatException unused2) {
                        return null;
                    }
                }
                i2 = split3.length;
            } else {
                i2 = 1;
            }
        }
        int i4 = i + i2;
        if (i4 > 8) {
            return null;
        }
        if (split.length != 1 || i4 == 8) {
            return allocate.array();
        }
        return null;
    }

    private static String convertDottedQuadToHex(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] textToNumericFormatV4 = textToNumericFormatV4(str.substring(lastIndexOf));
        if (textToNumericFormatV4 == null) {
            return null;
        }
        String hexString = Integer.toHexString(((textToNumericFormatV4[0] & 255) << 8) | (textToNumericFormatV4[1] & 255));
        String hexString2 = Integer.toHexString((textToNumericFormatV4[3] & 255) | ((textToNumericFormatV4[2] & 255) << 8));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(hexString);
        sb.append(":");
        sb.append(hexString2);
        return sb.toString();
    }

    public static String toUriString(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return inetAddress.getHostAddress();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(inetAddress.getHostAddress());
        sb.append("]");
        return sb.toString();
    }

    public static InetAddress forUriString(String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(str.length() > 0, "host string is empty");
        try {
            InetAddress forString = forString(str);
            if (forString instanceof Inet4Address) {
                return forString;
            }
        } catch (IllegalArgumentException unused) {
        }
        if (!str.startsWith("[") || !str.endsWith("]")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a valid address: \"");
            sb.append(str);
            sb.append('\"');
            throw new IllegalArgumentException(sb.toString());
        }
        InetAddress forString2 = forString(str.substring(1, str.length() - 1));
        if (forString2 instanceof Inet6Address) {
            return forString2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Not a valid address: \"");
        sb2.append(str);
        sb2.append('\"');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean isUriInetAddress(String str) {
        try {
            forUriString(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if (address[12] == 0 && address[13] == 0 && address[14] == 0 && (address[15] == 0 || address[15] == 1)) {
            return false;
        }
        return true;
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", inet6Address.getHostAddress());
        return getInet4Address(copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] == 32 && address[1] == 2) {
            return true;
        }
        return false;
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", inet6Address.getHostAddress());
        return getInet4Address(copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static final class TeredoInfo {
        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int i, int i2) {
            Preconditions.checkArgument(i >= 0 && i <= 65535, "port '%d' is out of range (0 <= port <= 0xffff)", Integer.valueOf(i));
            Preconditions.checkArgument(i2 >= 0 && i2 <= 65535, "flags '%d' is out of range (0 <= flags <= 0xffff)", Integer.valueOf(i2));
            if (inet4Address != null) {
                this.server = inet4Address;
            } else {
                this.server = InetAddresses.ANY4;
            }
            if (inet4Address2 != null) {
                this.client = inet4Address2;
            } else {
                this.client = InetAddresses.ANY4;
            }
            this.port = i;
            this.flags = i2;
        }

        public final Inet4Address getServer() {
            return this.server;
        }

        public final Inet4Address getClient() {
            return this.client;
        }

        public final int getPort() {
            return this.port;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0) {
            return true;
        }
        return false;
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", inet6Address.getHostAddress());
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4Address = getInet4Address(copyOfRange(address, 4, 8));
        short readShort = ByteStreams.newDataInput(address, 8).readShort();
        short readShort2 = ByteStreams.newDataInput(address, 10).readShort();
        byte[] copyOfRange = copyOfRange(address, 12, 16);
        for (int i = 0; i < copyOfRange.length; i++) {
            copyOfRange[i] = (byte) (~copyOfRange[i]);
        }
        return new TeredoInfo(inet4Address, getInet4Address(copyOfRange), (~readShort2) & Settings.DEFAULT_INITIAL_WINDOW_SIZE, readShort & 65535);
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if ((address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2) {
            return true;
        }
        return false;
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", inet6Address.getHostAddress());
        return getInet4Address(copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        return isCompatIPv4Address(inet6Address) || is6to4Address(inet6Address) || isTeredoAddress(inet6Address);
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw new IllegalArgumentException(String.format("'%s' has no embedded IPv4 address.", new Object[]{inet6Address.getHostAddress()}));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z;
        long j;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i = 0;
        while (true) {
            if (i >= 15) {
                z = true;
                break;
            } else if (address[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z && address[15] == 0) {
            return ANY4;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        if (hasEmbeddedIPv4ClientAddress(inet6Address)) {
            j = (long) getEmbeddedIPv4ClientAddress(inet6Address).hashCode();
        } else {
            j = ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int hash64To32 = hash64To32(j) | -536870912;
        if (hash64To32 == -1) {
            hash64To32 = -2;
        }
        return getInet4Address(Ints.toByteArray(hash64To32));
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    public static Inet4Address fromInteger(int i) {
        return getInet4Address(Ints.toByteArray(i));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    private static byte[] copyOfRange(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        int min = Math.min(i2, bArr.length);
        byte[] bArr2 = new byte[(i2 - i)];
        System.arraycopy(bArr, i, bArr2, 0, min - i);
        return bArr2;
    }
}
