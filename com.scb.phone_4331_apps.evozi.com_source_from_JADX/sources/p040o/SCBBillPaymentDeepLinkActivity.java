package p040o;

/* renamed from: o.SCBBillPaymentDeepLinkActivity */
abstract class SCBBillPaymentDeepLinkActivity<T, R> extends DebitCardRequestReviewActivity<R> {
    protected final DebitCardRequestReviewActivity<T> write;

    SCBBillPaymentDeepLinkActivity(DebitCardRequestReviewActivity<T> debitCardRequestReviewActivity) {
        this.write = (DebitCardRequestReviewActivity) HmlLatestPersonalInformationDeepLinkActivity.write(debitCardRequestReviewActivity, "source is null");
    }
}
