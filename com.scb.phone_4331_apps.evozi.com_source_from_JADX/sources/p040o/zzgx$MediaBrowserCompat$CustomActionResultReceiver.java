package p040o;

import okhttp3.ResponseBody;

/* renamed from: o.zzgx$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgx$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgx$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new zzgx$MediaBrowserCompat$CustomActionResultReceiver();

    zzgx$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* bridge */ /* synthetic */ Object write(Object obj) {
        onGetStartedClick.write((Object) (ResponseBody) obj, "it");
        return Boolean.TRUE;
    }
}
