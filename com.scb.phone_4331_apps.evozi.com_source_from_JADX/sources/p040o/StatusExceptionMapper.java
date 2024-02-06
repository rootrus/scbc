package p040o;

import retrofit2.adapter.rxjava2.Result;

/* renamed from: o.StatusExceptionMapper */
public final /* synthetic */ class StatusExceptionMapper implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zabr$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ StatusExceptionMapper(zabr$MediaBrowserCompat$ItemReceiver zabr_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = zabr_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        zabr$MediaBrowserCompat$ItemReceiver zabr_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        if (obj instanceof setCurrentItemInternal) {
            zabr.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
        } else if (obj instanceof Result) {
            Result result = (Result) obj;
            if (result.isError()) {
                throw zabr.MediaBrowserCompat$CustomActionResultReceiver(zabr_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver, result.error());
            }
        }
    }
}
