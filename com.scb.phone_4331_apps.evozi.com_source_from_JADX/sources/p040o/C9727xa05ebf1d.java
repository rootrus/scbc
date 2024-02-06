package p040o;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaSessionCompat$ResultReceiverWrapper */
public final class C9727xa05ebf1d<T> implements Callable<HmlConsumerGuidelinesBaseDeepLinkActivity<T>> {
    private final BankingAgentDeepLinkActivity IconCompatParcelizer;
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private final TimeUnit MediaBrowserCompat$ItemReceiver;
    private final DebitCardResetOtpActivity<T> read;

    public C9727xa05ebf1d(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.read = debitCardResetOtpActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.MediaBrowserCompat$ItemReceiver = timeUnit;
        this.IconCompatParcelizer = bankingAgentDeepLinkActivity;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.read.replay(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
    }
}
