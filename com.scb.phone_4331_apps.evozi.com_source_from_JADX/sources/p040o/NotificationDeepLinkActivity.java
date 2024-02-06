package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.NotificationDeepLinkActivity */
public class NotificationDeepLinkActivity<T> extends LifestyleDeepLinkActivity<T> {
    private T MediaBrowserCompat$CustomActionResultReceiver;
    public final BankingAgentTransactionsDeepLinkActivity<? super T> write;

    public NotificationDeepLinkActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
    }

    public final int write(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void MediaBrowserCompat$ItemReceiver(T t) {
        int i = get();
        if ((i & 54) == 0) {
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.write;
            if (i == 8) {
                this.MediaBrowserCompat$CustomActionResultReceiver = t;
                lazySet(16);
                bankingAgentTransactionsDeepLinkActivity.onNext(null);
            } else {
                lazySet(2);
                bankingAgentTransactionsDeepLinkActivity.onNext(t);
            }
            if (get() != 4) {
                bankingAgentTransactionsDeepLinkActivity.onComplete();
            }
        }
    }

    public final void IconCompatParcelizer(Throwable th) {
        if ((get() & 54) != 0) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        lazySet(2);
        this.write.onError(th);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.write.onComplete();
        }
    }

    public final T read() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        lazySet(32);
        return t;
    }

    public final boolean write() {
        return get() != 16;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        lazySet(32);
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public void dispose() {
        set(4);
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }
}
