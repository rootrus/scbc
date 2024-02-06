package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.CardlessAtmDeepLinkActivity */
abstract class CardlessAtmDeepLinkActivity<T> extends AtomicReference<T> implements BulkTransferDeepLinkActivity {
    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(T t);

    CardlessAtmDeepLinkActivity(T t) {
        super(HmlLatestPersonalInformationDeepLinkActivity.write(t, "value is null"));
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            MediaBrowserCompat$ItemReceiver(andSet);
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
