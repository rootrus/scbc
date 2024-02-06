package p040o;

/* renamed from: o.EasycashBaseIntroductionActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class C6442xe8ff2f0c<T, U> extends JuristicStartingPinDeepLinkActivity<T, U> {
    private DirectDebitDeepLinkActivity<? super T, ? extends U> write;

    C6442xe8ff2f0c(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends U> directDebitDeepLinkActivity) {
        super(bankingAgentTransactionsDeepLinkActivity);
        this.write = directDebitDeepLinkActivity;
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
                this.read.onNext(null);
                return;
            }
            try {
                this.read.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.write.write(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                MediaBrowserCompat$ItemReceiver(th);
            }
        }
    }

    public final int write(int i) {
        return MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final U read() throws Exception {
        T read = this.IconCompatParcelizer.read();
        if (read != null) {
            return HmlLatestPersonalInformationDeepLinkActivity.write(this.write.write(read), "The mapper function returned a null value.");
        }
        return null;
    }
}
