package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.getConstantState */
public final /* synthetic */ class getConstantState implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity write;

    public /* synthetic */ getConstantState(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.write = bankingAgentReviewActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.write;
        KeyframeParser keyframeParser = (KeyframeParser) obj;
        synchronized (bankingAgentReviewActivity) {
            bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver = AbstractMultimap.AsMap.AsMapEntries.SUCCESS;
            bankingAgentReviewActivity.ParcelableVolumeInfo.write = keyframeParser.write;
            bankingAgentReviewActivity.ParcelableVolumeInfo.MediaBrowserCompat$SearchResultReceiver = keyframeParser.MediaBrowserCompat$SearchResultReceiver;
            bankingAgentReviewActivity.ParcelableVolumeInfo.IconCompatParcelizer = keyframeParser.IconCompatParcelizer;
            bankingAgentReviewActivity.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver = keyframeParser.MediaBrowserCompat$CustomActionResultReceiver;
            bankingAgentReviewActivity.MediaSessionCompat$Token.write(bankingAgentReviewActivity.ParcelableVolumeInfo);
        }
    }
}
