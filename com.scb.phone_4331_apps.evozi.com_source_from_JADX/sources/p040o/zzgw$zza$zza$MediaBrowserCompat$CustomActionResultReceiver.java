package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zzgw;

/* renamed from: o.zzgw$zza$zza$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgw$zza$zza$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzgw.zza.C10768zza MediaBrowserCompat$CustomActionResultReceiver;

    zzgw$zza$zza$MediaBrowserCompat$CustomActionResultReceiver(zzgw.zza.C10768zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        setPassword setpassword = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        return setpassword.IconCompatParcelizer((removeAnimatorUpdateListener) data);
    }
}
