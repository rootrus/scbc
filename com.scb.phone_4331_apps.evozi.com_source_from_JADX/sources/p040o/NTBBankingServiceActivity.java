package p040o;

/* renamed from: o.NTBBankingServiceActivity */
public final class NTBBankingServiceActivity<T> extends SCBBillPaymentDeepLinkActivity<T, T> implements DebitCardMarketConductDeepLinkActivity<T> {
    private DebitCardMarketConductDeepLinkActivity<? super T> IconCompatParcelizer = this;

    public final void IconCompatParcelizer(T t) {
    }

    public NTBBankingServiceActivity(DebitCardRequestReviewActivity<T> debitCardRequestReviewActivity) {
        super(debitCardRequestReviewActivity);
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        this.write.MediaBrowserCompat$ItemReceiver(new NTBBankingServiceActivity$MediaBrowserCompat$ItemReceiver(depositDetailRecyclerViewAdapter$DepositViewHolder, this.IconCompatParcelizer));
    }
}
