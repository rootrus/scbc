package p040o;

/* renamed from: o.zzgb$MediaBrowserCompat$ItemReceiver */
final class zzgb$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzgb MediaBrowserCompat$ItemReceiver;

    zzgb$MediaBrowserCompat$ItemReceiver(zzgb zzgb) {
        this.MediaBrowserCompat$ItemReceiver = zzgb;
    }

    public final /* synthetic */ Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        onGetStartedClick.write((Object) setcurrentiteminternal, "it");
        return Boolean.valueOf(setcurrentiteminternal.getStatus().write().equals("1000"));
    }
}
