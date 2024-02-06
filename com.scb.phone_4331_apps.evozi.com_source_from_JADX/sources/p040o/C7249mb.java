package p040o;

import p040o.getErrorInfo;

/* renamed from: o.mb */
public final /* synthetic */ class C7249mb {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[getErrorInfo.write.values().length];
        read = iArr;
        iArr[getErrorInfo.write.LANDING.ordinal()] = 1;
        read[getErrorInfo.write.PERSONAL.ordinal()] = 2;
        read[getErrorInfo.write.BUSINESS.ordinal()] = 3;
        read[getErrorInfo.write.DOCUMENTS.ordinal()] = 4;
        read[getErrorInfo.write.NCB.ordinal()] = 5;
        read[getErrorInfo.write.SUBMISSION.ordinal()] = 6;
        read[getErrorInfo.write.OUTCOME.ordinal()] = 7;
        read[getErrorInfo.write.SETUP.ordinal()] = 8;
        read[getErrorInfo.write.SUCCESSFUL.ordinal()] = 9;
    }
}
