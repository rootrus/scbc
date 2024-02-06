package p040o;

/* renamed from: o.SharingMomentsPreviewActivity$MediaBrowserCompat$ItemReceiver */
final class SharingMomentsPreviewActivity$MediaBrowserCompat$ItemReceiver<T, K> extends JuristicStartingPinDeepLinkActivity<T, T> {
    private K MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private DirectDebitDeepLinkActivity<? super T, K> RatingCompat;
    private CreditCardServiceTabDeepLinkActivity<? super K, ? super K> write;

    SharingMomentsPreviewActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity, CreditCardServiceTabDeepLinkActivity<? super K, ? super K> creditCardServiceTabDeepLinkActivity) {
        super(bankingAgentTransactionsDeepLinkActivity);
        this.RatingCompat = directDebitDeepLinkActivity;
        this.write = creditCardServiceTabDeepLinkActivity;
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
                this.read.onNext(t);
                return;
            }
            try {
                K write2 = this.RatingCompat.write(t);
                if (this.MediaMetadataCompat) {
                    boolean IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaDescriptionCompat, write2);
                    this.MediaDescriptionCompat = write2;
                    if (IconCompatParcelizer) {
                        return;
                    }
                } else {
                    this.MediaMetadataCompat = true;
                    this.MediaDescriptionCompat = write2;
                }
                this.read.onNext(t);
            } catch (Throwable th) {
                MediaBrowserCompat$ItemReceiver(th);
            }
        }
    }

    public final int write(int i) {
        return MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final T read() throws Exception {
        while (true) {
            T read = this.IconCompatParcelizer.read();
            if (read == null) {
                return null;
            }
            K write2 = this.RatingCompat.write(read);
            if (!this.MediaMetadataCompat) {
                this.MediaMetadataCompat = true;
                this.MediaDescriptionCompat = write2;
                return read;
            } else if (!this.write.IconCompatParcelizer(this.MediaDescriptionCompat, write2)) {
                this.MediaDescriptionCompat = write2;
                return read;
            } else {
                this.MediaDescriptionCompat = write2;
            }
        }
    }
}
