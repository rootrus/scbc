package p040o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.DirectDebitOtpActivity */
public final class DirectDebitOtpActivity<T> extends NtbUserInfoActivity<T, T> {
    private BankingAgentDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private long read;
    private TimeUnit write;

    public DirectDebitOtpActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = j;
        this.write = timeUnit;
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver(!this.MediaBrowserCompat$ItemReceiver ? new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity) : bankingAgentTransactionsDeepLinkActivity, this.read, this.write, this.MediaBrowserCompat$CustomActionResultReceiver.write(), this.MediaBrowserCompat$ItemReceiver));
    }
}
