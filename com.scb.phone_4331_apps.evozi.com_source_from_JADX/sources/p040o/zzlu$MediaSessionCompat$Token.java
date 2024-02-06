package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzlu$MediaSessionCompat$Token */
final class zzlu$MediaSessionCompat$Token<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzlu$MediaSessionCompat$Token read = new zzlu$MediaSessionCompat$Token();

    zzlu$MediaSessionCompat$Token() {
    }

    public final /* bridge */ /* synthetic */ Object write(Object obj) {
        onGetStartedClick.write((Object) (SingleDataEntity) obj, "it");
        return Boolean.TRUE;
    }
}
