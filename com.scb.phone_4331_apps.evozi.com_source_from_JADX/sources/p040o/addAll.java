package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.addAll */
public final /* synthetic */ class addAll implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity write;

    public /* synthetic */ addAll(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.write = bankingAgentReviewActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.write;
        KeyframeParser keyframeParser = (KeyframeParser) obj;
        synchronized (bankingAgentReviewActivity) {
            bankingAgentReviewActivity.IconCompatParcelizer = AbstractMultimap.AsMap.AsMapEntries.SUCCESS;
            bankingAgentReviewActivity.ParcelableVolumeInfo.RatingCompat = keyframeParser.RatingCompat;
            bankingAgentReviewActivity.ParcelableVolumeInfo.MediaMetadataCompat = keyframeParser.MediaMetadataCompat;
            bankingAgentReviewActivity.MediaSessionCompat$Token.write(bankingAgentReviewActivity.ParcelableVolumeInfo);
        }
    }
}
