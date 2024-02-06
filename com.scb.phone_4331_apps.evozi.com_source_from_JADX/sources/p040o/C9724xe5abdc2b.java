package p040o;

import java.util.concurrent.Callable;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9724xe5abdc2b<T> implements Callable<HmlConsumerGuidelinesBaseDeepLinkActivity<T>> {
    private final int MediaBrowserCompat$ItemReceiver;
    private final DebitCardResetOtpActivity<T> write;

    public C9724xe5abdc2b(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, int i) {
        this.write = debitCardResetOtpActivity;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.write.replay(this.MediaBrowserCompat$ItemReceiver);
    }
}
