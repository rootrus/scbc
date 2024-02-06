package p040o;

/* renamed from: o.RtpEBillSubscriptionDetailActivity */
public final class RtpEBillSubscriptionDetailActivity<T> extends DebitCardSaleSheetActivity<T> {
    private ChequeManagementDeepLinkActivity<T, T, T> read;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public RtpEBillSubscriptionDetailActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<T, T, T> chequeManagementDeepLinkActivity) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = chequeManagementDeepLinkActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
        this.write.subscribe(new C9818x545aba17(baseChangePinWithMaxActivity_ViewBinding, this.read));
    }
}
