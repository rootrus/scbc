package p040o;

import java.util.concurrent.TimeUnit;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.EasycashSuccessActivity */
public final class EasycashSuccessActivity extends DebitCardResetOtpActivity<Long> {
    private long IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private TimeUnit MediaMetadataCompat;
    private BankingAgentDeepLinkActivity read;
    private long write;

    public EasycashSuccessActivity(long j, long j2, long j3, long j4, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = j3;
        this.write = j4;
        this.MediaMetadataCompat = timeUnit;
        this.read = bankingAgentDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.IconCompatParcelizer = j2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
        EasycashSuccessActivity$MediaBrowserCompat$ItemReceiver easycashSuccessActivity$MediaBrowserCompat$ItemReceiver = new EasycashSuccessActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(easycashSuccessActivity$MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.read;
        if (bankingAgentDeepLinkActivity instanceof setVwModelConsentSeparator) {
            BankingAgentDeepLinkActivity.read write2 = bankingAgentDeepLinkActivity.write();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(easycashSuccessActivity$MediaBrowserCompat$ItemReceiver, write2);
            write2.MediaBrowserCompat$ItemReceiver(easycashSuccessActivity$MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver, this.write, this.MediaMetadataCompat);
            return;
        }
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(easycashSuccessActivity$MediaBrowserCompat$ItemReceiver, bankingAgentDeepLinkActivity.write(easycashSuccessActivity$MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver, this.write, this.MediaMetadataCompat));
    }
}
