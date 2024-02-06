package p040o;

/* renamed from: o.lF */
public final /* synthetic */ class C10034lF {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[setVersion.values().length];
        IconCompatParcelizer = iArr;
        iArr[setVersion.WEAK.ordinal()] = 1;
        IconCompatParcelizer[setVersion.FAIR.ordinal()] = 2;
        IconCompatParcelizer[setVersion.GOOD.ordinal()] = 3;
        IconCompatParcelizer[setVersion.ERROR.ordinal()] = 4;
    }
}
