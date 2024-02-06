package p040o;

import p040o.child;

/* renamed from: o.validatePart */
public final /* synthetic */ class validatePart {
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[child.read.values().length];
        read = iArr;
        iArr[child.read.TRANSFER.ordinal()] = 1;
        read[child.read.TOPUP.ordinal()] = 2;
        read[child.read.BILLPAYMENT.ordinal()] = 3;
        int[] iArr2 = new int[child.read.values().length];
        write = iArr2;
        iArr2[child.read.TRANSFER.ordinal()] = 1;
        write[child.read.TOPUP.ordinal()] = 2;
        write[child.read.BILLPAYMENT.ordinal()] = 3;
    }
}
