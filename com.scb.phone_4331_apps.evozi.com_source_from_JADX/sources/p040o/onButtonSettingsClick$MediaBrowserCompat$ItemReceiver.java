package p040o;

import java.util.concurrent.TimeUnit;
import p040o.BankingAgentDeepLinkActivity;
import p040o.onButtonSettingsClick;

/* renamed from: o.onButtonSettingsClick$MediaBrowserCompat$ItemReceiver */
final class onButtonSettingsClick$MediaBrowserCompat$ItemReceiver extends BankingAgentDeepLinkActivity.read {
    private final HmlBusinessOwnerGenericDeepLinkActivity IconCompatParcelizer;
    private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final onButtonSettingsClick.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final ChequeInquiryDeepLinkActivity read = new ChequeInquiryDeepLinkActivity();
    private final HmlBusinessOwnerGenericDeepLinkActivity write = new HmlBusinessOwnerGenericDeepLinkActivity();

    onButtonSettingsClick$MediaBrowserCompat$ItemReceiver(onButtonSettingsClick.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        HmlBusinessOwnerGenericDeepLinkActivity hmlBusinessOwnerGenericDeepLinkActivity = new HmlBusinessOwnerGenericDeepLinkActivity();
        this.IconCompatParcelizer = hmlBusinessOwnerGenericDeepLinkActivity;
        hmlBusinessOwnerGenericDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }

    public final void dispose() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.IconCompatParcelizer.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final BulkTransferDeepLinkActivity IconCompatParcelizer(Runnable runnable) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(runnable, 0, TimeUnit.MILLISECONDS, this.write);
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(runnable, j, timeUnit, this.read);
    }
}
