package p040o;

import java.util.Iterator;

/* renamed from: o.EasycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6451xde8e6db2<T> extends InvestmentDeepLinkActivity<T> {
    private volatile boolean IconCompatParcelizer;
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    private boolean MediaMetadataCompat;
    final Iterator<? extends T> read;
    private boolean write;

    C6451xde8e6db2(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, Iterator<? extends T> it) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = it;
    }

    public final int write(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        return 1;
    }

    public final T read() {
        if (this.MediaMetadataCompat) {
            return null;
        }
        if (!this.write) {
            this.write = true;
        } else if (!this.read.hasNext()) {
            this.MediaMetadataCompat = true;
            return null;
        }
        return HmlLatestPersonalInformationDeepLinkActivity.write(this.read.next(), "The iterator returned a null value");
    }

    public final boolean write() {
        return this.MediaMetadataCompat;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaMetadataCompat = true;
    }

    public final void dispose() {
        this.IconCompatParcelizer = true;
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }
}
