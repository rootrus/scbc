package p040o;

/* renamed from: o.zzba */
public final /* synthetic */ class zzba implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ zzba(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentReviewActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$ItemReceiver;
        return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, this.MediaBrowserCompat$CustomActionResultReceiver, bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver, bankingAgentReviewActivity.IconCompatParcelizer, bankingAgentReviewActivity.MediaBrowserCompat$MediaItem, bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
