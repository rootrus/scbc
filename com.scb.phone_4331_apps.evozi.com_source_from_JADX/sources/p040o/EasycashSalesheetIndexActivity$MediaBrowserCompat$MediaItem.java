package p040o;

import java.util.concurrent.Callable;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaBrowserCompat$MediaItem */
public final class EasycashSalesheetIndexActivity$MediaBrowserCompat$MediaItem<T> implements Callable<HmlConsumerGuidelinesBaseDeepLinkActivity<T>> {
    private final DebitCardResetOtpActivity<T> write;

    public EasycashSalesheetIndexActivity$MediaBrowserCompat$MediaItem(DebitCardResetOtpActivity<T> debitCardResetOtpActivity) {
        this.write = debitCardResetOtpActivity;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.write.replay();
    }
}
