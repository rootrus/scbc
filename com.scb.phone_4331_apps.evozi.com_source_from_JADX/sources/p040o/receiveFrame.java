package p040o;

import p040o.LocalProjectProvider;
import p040o.zzbt;

/* renamed from: o.receiveFrame */
public final class receiveFrame extends IndoorBuilding {
    private final LocalProjectProvider.C69375 write;

    @HmlPinActivity
    public receiveFrame(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = r3;
    }

    public final DebitCardResetOtpActivity<zzbt.zzf.zza> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return write(this.write.write(str));
    }
}
