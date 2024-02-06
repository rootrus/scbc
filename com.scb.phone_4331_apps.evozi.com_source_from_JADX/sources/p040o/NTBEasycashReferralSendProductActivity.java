package p040o;

/* renamed from: o.NTBEasycashReferralSendProductActivity */
public final class NTBEasycashReferralSendProductActivity<T> extends DebitCardResetOtpActivity<T> implements HmlPersonalInformationDeepLinkActivity<T> {
    private final T IconCompatParcelizer;

    public NTBEasycashReferralSendProductActivity(T t) {
        this.IconCompatParcelizer = t;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        C7302xdc8a7a62 onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver = new C7302xdc8a7a62(bankingAgentTransactionsDeepLinkActivity, this.IconCompatParcelizer);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver);
        onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver.run();
    }

    public final T call() {
        return this.IconCompatParcelizer;
    }
}
