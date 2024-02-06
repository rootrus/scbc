package p040o;

import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.IntroductionActivity_ViewBinding */
public final class IntroductionActivity_ViewBinding<T> extends SCBBillPaymentDeepLinkActivity<T, T> {
    private BankingAgentDeepLinkActivity IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;

    public IntroductionActivity_ViewBinding(DebitCardRequestReviewActivity<T> debitCardRequestReviewActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        super(debitCardRequestReviewActivity);
        this.IconCompatParcelizer = bankingAgentDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        BankingAgentDeepLinkActivity.read write = this.IconCompatParcelizer.write();
        C6922x25028937 introductionActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C6922x25028937(depositDetailRecyclerViewAdapter$DepositViewHolder, write, this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
        depositDetailRecyclerViewAdapter$DepositViewHolder.read(introductionActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        write.IconCompatParcelizer(introductionActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
    }
}
