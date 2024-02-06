package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzla$MediaBrowserCompat$CustomActionResultReceiver */
final class zzla$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzla$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new zzla$MediaBrowserCompat$CustomActionResultReceiver();

    zzla$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* bridge */ /* synthetic */ Object write(Object obj) {
        onGetStartedClick.write((Object) (SingleDataEntity) obj, "it");
        return Boolean.TRUE;
    }
}
