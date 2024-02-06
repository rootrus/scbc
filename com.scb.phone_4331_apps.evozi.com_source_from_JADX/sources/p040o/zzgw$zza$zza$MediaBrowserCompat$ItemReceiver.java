package p040o;

import okhttp3.ResponseBody;

/* renamed from: o.zzgw$zza$zza$MediaBrowserCompat$ItemReceiver */
final class zzgw$zza$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgw$zza$zza$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new zzgw$zza$zza$MediaBrowserCompat$ItemReceiver();

    zzgw$zza$zza$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* bridge */ /* synthetic */ Object write(Object obj) {
        onGetStartedClick.write((Object) (ResponseBody) obj, "it");
        return Boolean.TRUE;
    }
}
