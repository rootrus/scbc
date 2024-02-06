package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.getErrorInfo;
import p040o.zzcz;

/* renamed from: o.getErrorInfo$write$MediaBrowserCompat$ItemReceiver */
public final class getErrorInfo$write$MediaBrowserCompat$ItemReceiver {
    private getErrorInfo$write$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ getErrorInfo$write$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static getErrorInfo.write read(zzcz.zzc zzc) {
        onGetStartedClick.write((Object) zzc, "status");
        switch (isCertificateError.write[zzc.ordinal()]) {
            case 1:
                return getErrorInfo.write.LANDING;
            case 2:
                return getErrorInfo.write.PERSONAL;
            case 3:
                return getErrorInfo.write.BUSINESS;
            case 4:
                return getErrorInfo.write.DOCUMENTS;
            case 5:
                return getErrorInfo.write.NCB;
            case 6:
                return getErrorInfo.write.SUBMISSION;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return getErrorInfo.write.OUTCOME;
            case 12:
                return getErrorInfo.write.SETUP;
            case 13:
            case 14:
            case 15:
                return getErrorInfo.write.SUCCESSFUL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
