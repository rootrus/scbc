package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.dispatchMessage */
public final /* synthetic */ class dispatchMessage implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ dispatchMessage(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentReviewActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        KeyframeParser keyframeParser = (KeyframeParser) obj;
        synchronized (bankingAgentReviewActivity) {
            bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver = AbstractMultimap.AsMap.AsMapEntries.SUCCESS;
            bankingAgentReviewActivity.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver = keyframeParser.MediaBrowserCompat$ItemReceiver;
            bankingAgentReviewActivity.MediaSessionCompat$Token.write(bankingAgentReviewActivity.ParcelableVolumeInfo);
        }
    }
}
