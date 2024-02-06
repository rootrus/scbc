package p040o;

/* renamed from: o.EasycashAdditionalDocumentTypeActivity_ViewBinding */
public final class EasycashAdditionalDocumentTypeActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private T read;

    public EasycashAdditionalDocumentTypeActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, T t, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = j;
        this.read = t;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C6441x8d7233fd(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
