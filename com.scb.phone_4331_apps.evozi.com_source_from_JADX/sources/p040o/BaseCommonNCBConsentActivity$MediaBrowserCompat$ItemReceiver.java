package p040o;

/* renamed from: o.BaseCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver */
final class BaseCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver<T> extends JuristicStartingPinDeepLinkActivity<T, T> {
    private DebitCardMarketConductDeepLinkActivity<? super T> write;

    BaseCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        super(bankingAgentTransactionsDeepLinkActivity);
        this.write = debitCardMarketConductDeepLinkActivity;
    }

    public final void onNext(T t) {
        this.read.onNext(t);
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
            try {
                this.write.IconCompatParcelizer(t);
            } catch (Throwable th) {
                MediaBrowserCompat$ItemReceiver(th);
            }
        }
    }

    public final int write(int i) {
        return MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final T read() throws Exception {
        T read = this.IconCompatParcelizer.read();
        if (read != null) {
            this.write.IconCompatParcelizer(read);
        }
        return read;
    }
}
