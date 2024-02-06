package p040o;

import java.util.concurrent.TimeUnit;
import p040o.onBtnSaveClicked;

/* renamed from: o.onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper */
final class onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper<T> implements onBtnSaveClicked.read<T> {
    private final long IconCompatParcelizer;
    private final TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
    private final BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private final int write;

    onBtnSaveClicked$MediaSessionCompat$ResultReceiverWrapper(int i, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.write = i;
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit;
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
    }

    public final onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> read() {
        return new onBtnSaveClicked$MediaSessionCompat$Token(this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
