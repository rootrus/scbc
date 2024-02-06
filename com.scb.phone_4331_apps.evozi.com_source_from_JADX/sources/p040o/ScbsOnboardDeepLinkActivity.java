package p040o;

/* renamed from: o.ScbsOnboardDeepLinkActivity */
public final class ScbsOnboardDeepLinkActivity<T> extends DebitCardRequestReviewActivity<T> {
    private final DebitCardResetOtpActivity<T> write;

    public ScbsOnboardDeepLinkActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity) {
        this.write = debitCardResetOtpActivity;
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        this.write.subscribe(new C7050x87e03c08(depositDetailRecyclerViewAdapter$DepositViewHolder));
    }
}
