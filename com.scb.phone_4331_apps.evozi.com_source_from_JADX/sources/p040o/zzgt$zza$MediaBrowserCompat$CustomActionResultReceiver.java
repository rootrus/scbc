package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzgt$zza$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgt$zza$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgt$zza$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new zzgt$zza$MediaBrowserCompat$CustomActionResultReceiver();

    zzgt$zza$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* bridge */ /* synthetic */ Object write(Object obj) {
        onGetStartedClick.write((Object) (SingleDataEntity) obj, "it");
        return Boolean.TRUE;
    }
}
