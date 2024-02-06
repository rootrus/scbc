package p040o;

import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.BankingAgentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6329x5b85be81 implements BulkTransferDeepLinkActivity, Runnable {
    private Thread IconCompatParcelizer;
    private BankingAgentDeepLinkActivity.read MediaBrowserCompat$CustomActionResultReceiver;
    private Runnable write;

    C6329x5b85be81(Runnable runnable, BankingAgentDeepLinkActivity.read read) {
        this.write = runnable;
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void run() {
        this.IconCompatParcelizer = Thread.currentThread();
        try {
            this.write.run();
        } finally {
            dispose();
            this.IconCompatParcelizer = null;
        }
    }

    public final void dispose() {
        if (this.IconCompatParcelizer == Thread.currentThread()) {
            BankingAgentDeepLinkActivity.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (read instanceof onBtnAcceptClicked) {
                onBtnAcceptClicked onbtnacceptclicked = (onBtnAcceptClicked) read;
                if (!onbtnacceptclicked.IconCompatParcelizer) {
                    onbtnacceptclicked.IconCompatParcelizer = true;
                    onbtnacceptclicked.read.shutdown();
                    return;
                }
                return;
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
    }
}
