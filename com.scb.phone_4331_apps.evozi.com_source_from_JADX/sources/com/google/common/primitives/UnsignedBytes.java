package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Comparator;
import sun.misc.Unsafe;

public final class UnsignedBytes {
    public static byte saturatedCast(long j) {
        if (j > 255) {
            return -1;
        }
        if (j < 0) {
            return 0;
        }
        return (byte) ((int) j);
    }

    public static int toInt(byte b) {
        return b & 255;
    }

    private UnsignedBytes() {
    }

    public static byte checkedCast(long j) {
        Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", Long.valueOf(j));
        return (byte) ((int) j);
    }

    public static int compare(byte b, byte b2) {
        return toInt(b) - toInt(b2);
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i = toInt(bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            int i3 = toInt(bArr[i2]);
            if (i3 < i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i = toInt(bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            int i3 = toInt(bArr[i2]);
            if (i3 > i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 5);
        sb.append(toInt(bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append(toInt(bArr[i]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    static class LexicographicalComparatorHolder {
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();
        static final String UNSAFE_COMPARATOR_NAME;

        LexicographicalComparatorHolder() {
        }

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(LexicographicalComparatorHolder.class.getName());
            sb.append("$UnsafeComparator");
            UNSAFE_COMPARATOR_NAME = sb.toString();
        }

        enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;
            
            static final int BYTE_ARRAY_BASE_OFFSET = 0;
            static final boolean littleEndian = false;
            static final Unsafe theUnsafe = null;

            static boolean lessThanUnsigned(long j, long j2) {
                return j - Long.MIN_VALUE < j2 - Long.MIN_VALUE;
            }

            static {
                Class<byte[]> cls;
                littleEndian = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
                Unsafe unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedAction<Object>() {
                    public final Object run() {
                        try {
                            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            return declaredField.get((Object) null);
                        } catch (NoSuchFieldException unused) {
                            throw new Error();
                        } catch (IllegalAccessException unused2) {
                            throw new Error();
                        }
                    }
                });
                theUnsafe = unsafe;
                BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(cls);
                if (theUnsafe.arrayIndexScale(cls) != 1) {
                    throw new AssertionError();
                }
            }

            public final int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i = min / 8;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i << 3;
                    if (i3 < i4) {
                        long j = (long) i3;
                        long j2 = theUnsafe.getLong(bArr, ((long) BYTE_ARRAY_BASE_OFFSET) + j);
                        long j3 = theUnsafe.getLong(bArr2, ((long) BYTE_ARRAY_BASE_OFFSET) + j);
                        long j4 = j2 ^ j3;
                        if (j4 == 0) {
                            i3 += 8;
                        } else if (!littleEndian) {
                            return lessThanUnsigned(j2, j3) ? -1 : 1;
                        } else {
                            int i5 = (int) j4;
                            if (i5 == 0) {
                                i5 = (int) (j4 >>> 32);
                                i2 = 32;
                            }
                            int i6 = i5 << 16;
                            if (i6 == 0) {
                                i2 += 16;
                            } else {
                                i5 = i6;
                            }
                            if ((i5 << 8) == 0) {
                                i2 += 8;
                            }
                            return (int) (((j2 >>> i2) & 255) - (255 & (j3 >>> i2)));
                        }
                    } else {
                        while (i4 < min) {
                            int compare = UnsignedBytes.compare(bArr[i4], bArr2[i4]);
                            if (compare != 0) {
                                return compare;
                            }
                            i4++;
                        }
                        return bArr.length - bArr2.length;
                    }
                }
            }
        }

        enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            public final int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int compare = UnsignedBytes.compare(bArr[i], bArr2[i]);
                    if (compare != 0) {
                        return compare;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        static Comparator<byte[]> getBestComparator() {
            try {
                return (Comparator) Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants()[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }
}
