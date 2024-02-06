package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.zzkg$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkg$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkg read;

    zzkg$MediaBrowserCompat$CustomActionResultReceiver(zzkg zzkg) {
        this.read = zzkg;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        getResultFromConnection getresultfromconnection = (getResultFromConnection) data;
        onGetStartedClick.write((Object) getresultfromconnection, "entity");
        return new PlaceFilter(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) getresultfromconnection.read), getresultfromconnection.IconCompatParcelizer, false);
    }
}
