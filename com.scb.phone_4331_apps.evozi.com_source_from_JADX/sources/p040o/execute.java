package p040o;

/* renamed from: o.execute */
public enum execute {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final execute[] FOR_BITS = null;
    public final int bits;

    static {
        execute execute;
        execute execute2;
        execute execute3;
        execute execute4;
        FOR_BITS = new execute[]{execute3, execute2, execute, execute4};
    }

    private execute(int i) {
        this.bits = i;
    }

    public static execute read(int i) {
        if (i >= 0) {
            execute[] executeArr = FOR_BITS;
            if (i < executeArr.length) {
                return executeArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
