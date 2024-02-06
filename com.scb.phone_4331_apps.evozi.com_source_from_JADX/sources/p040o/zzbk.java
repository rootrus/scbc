package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.zzbk */
public final /* synthetic */ class zzbk implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity write;

    public /* synthetic */ zzbk(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.write = bankingAgentReviewActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.write;
        synchronized (bankingAgentReviewActivity) {
            bankingAgentReviewActivity.IconCompatParcelizer = AbstractMultimap.AsMap.AsMapEntries.ERROR;
        }
    }
}
