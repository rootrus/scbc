package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.zzbl */
public final /* synthetic */ class zzbl implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ BankingAgentReviewActivity read;

    public /* synthetic */ zzbl(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
        this.read = bankingAgentReviewActivity;
        this.IconCompatParcelizer = str;
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.read;
        String str = this.IconCompatParcelizer;
        if (bankingAgentReviewActivity.ParcelableVolumeInfo != null) {
            return bankingAgentReviewActivity.read(str);
        }
        KeyframeParser keyframeParser = new KeyframeParser();
        bankingAgentReviewActivity.ParcelableVolumeInfo = keyframeParser;
        getRemoteContext getremotecontext = bankingAgentReviewActivity.write;
        AbstractMultimap.AsMap.AsMapEntries asMapEntries = AbstractMultimap.AsMap.AsMapEntries.ERROR;
        AbstractMultimap.AsMap.AsMapEntries asMapEntries2 = AbstractMultimap.AsMap.AsMapEntries.ERROR;
        return getremotecontext.MediaBrowserCompat$CustomActionResultReceiver(keyframeParser, str, asMapEntries, asMapEntries, asMapEntries2, asMapEntries2);
    }
}
