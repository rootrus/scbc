package p040o;

/* renamed from: o.onClickApplyNow */
public final class onClickApplyNow<T> extends NtbUserInfoActivity<T, T> {
    private BaseChangePinWithMaxActivity<? extends T> read;

    public onClickApplyNow(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, BaseChangePinWithMaxActivity<? extends T> baseChangePinWithMaxActivity) {
        super(debitCardResetOtpActivity);
        this.read = baseChangePinWithMaxActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        onClickApplyNow$MediaBrowserCompat$ItemReceiver onclickapplynow_mediabrowsercompat_itemreceiver = new onClickApplyNow$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(onclickapplynow_mediabrowsercompat_itemreceiver);
        this.IconCompatParcelizer.subscribe(onclickapplynow_mediabrowsercompat_itemreceiver);
        this.read.read(onclickapplynow_mediabrowsercompat_itemreceiver.read);
    }
}
