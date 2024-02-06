package p040o;

/* renamed from: o.retainAll */
public final /* synthetic */ class retainAll implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ retainAll(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentReviewActivity;
        this.read = str;
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$ItemReceiver;
        return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, this.read, bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver, bankingAgentReviewActivity.IconCompatParcelizer, bankingAgentReviewActivity.MediaBrowserCompat$MediaItem, bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
