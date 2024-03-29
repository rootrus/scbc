package p040o;

/* renamed from: o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder */
public final class RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder {
    public final String IconCompatParcelizer;

    public static int compareInts(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int compareLongs(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    private RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder() {
    }

    public static <T> T requireNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Value must not be null");
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw new NullPointerException(sb.toString());
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Addition overflows an int: ");
        sb.append(i);
        sb.append(" + ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static long safeAdd(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Addition overflows a long: ");
        sb.append(j);
        sb.append(" + ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int safeSubtract(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) >= 0 || (i ^ i2) >= 0) {
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Subtraction overflows an int: ");
        sb.append(i);
        sb.append(" - ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static long safeSubtract(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Subtraction overflows a long: ");
        sb.append(j);
        sb.append(" - ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int safeMultiply(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows an int: ");
        sb.append(i);
        sb.append(" * ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static long safeMultiply(long j, int i) {
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Multiplication overflows a long: ");
            sb.append(j);
            sb.append(" * ");
            sb.append(i);
            throw new ArithmeticException(sb.toString());
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Multiplication overflows a long: ");
            sb2.append(j);
            sb2.append(" * ");
            sb2.append(i);
            throw new ArithmeticException(sb2.toString());
        }
    }

    public static long safeMultiply(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" * ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int safeToInt(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Calculation overflows an int: ");
        sb.append(j);
        throw new ArithmeticException(sb.toString());
    }

    public static long floorDiv(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static long floorMod(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static int floorMod(long j, int i) {
        long j2 = (long) i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static int floorDiv(int i, int i2) {
        return i >= 0 ? i / i2 : ((i + 1) / i2) - 1;
    }

    public static int floorMod(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder(String str) {
        onGetStartedClick.write((Object) str, "applicationId");
        this.IconCompatParcelizer = str;
    }
}
