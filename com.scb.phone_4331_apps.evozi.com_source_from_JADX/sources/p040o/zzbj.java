package p040o;

/* renamed from: o.zzbj */
public final /* synthetic */ class zzbj implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BankingAgentReviewActivity write;

    public /* synthetic */ zzbj(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
        this.write = bankingAgentReviewActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.write;
        return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, this.MediaBrowserCompat$CustomActionResultReceiver, bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver, bankingAgentReviewActivity.IconCompatParcelizer, bankingAgentReviewActivity.MediaBrowserCompat$MediaItem, bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
