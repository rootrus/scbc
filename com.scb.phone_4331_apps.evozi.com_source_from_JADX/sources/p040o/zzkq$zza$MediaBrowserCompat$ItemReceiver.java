package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zzkq;

/* renamed from: o.zzkq$zza$MediaBrowserCompat$ItemReceiver */
final class zzkq$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkq.zza IconCompatParcelizer;

    zzkq$zza$MediaBrowserCompat$ItemReceiver(zzkq.zza zza) {
        this.IconCompatParcelizer = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        setInterval setinterval = (setInterval) data;
        onGetStartedClick.write((Object) setinterval, "entity");
        return new onIndoorBuildingFocused(setinterval.write.read, setinterval.write.MediaBrowserCompat$ItemReceiver);
    }
}
