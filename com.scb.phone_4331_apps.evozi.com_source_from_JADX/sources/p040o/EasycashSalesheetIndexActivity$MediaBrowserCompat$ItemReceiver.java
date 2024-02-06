package p040o;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaBrowserCompat$ItemReceiver */
public final class EasycashSalesheetIndexActivity$MediaBrowserCompat$ItemReceiver<T> implements Callable<HmlConsumerGuidelinesBaseDeepLinkActivity<T>> {
    private final int IconCompatParcelizer;
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private final TimeUnit MediaBrowserCompat$ItemReceiver;
    private final BankingAgentDeepLinkActivity read;
    private final DebitCardResetOtpActivity<T> write;

    public EasycashSalesheetIndexActivity$MediaBrowserCompat$ItemReceiver(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, int i, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.write = debitCardResetOtpActivity;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.MediaBrowserCompat$ItemReceiver = timeUnit;
        this.read = bankingAgentDeepLinkActivity;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.write.replay(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read);
    }
}
