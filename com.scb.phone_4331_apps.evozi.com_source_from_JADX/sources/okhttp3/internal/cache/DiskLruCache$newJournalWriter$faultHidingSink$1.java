package okhttp3.internal.cache;

import java.io.IOException;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlBusinessOwnerDocumentSubmissionActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends CheckEligibilityActivity implements FundFactSheetActivity<IOException, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final void invoke(IOException iOException) {
        onGetStartedClick.write((Object) iOException, "it");
        boolean holdsLock = Thread.holdsLock(this.this$0);
        if (!HmlBusinessOwnerDocumentSubmissionActivity.write || holdsLock) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
