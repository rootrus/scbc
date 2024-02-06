package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzkl$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkl$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkl IconCompatParcelizer;

    zzkl$MediaBrowserCompat$CustomActionResultReceiver(zzkl zzkl) {
        this.IconCompatParcelizer = zzkl;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        getOverallProgress getoverallprogress = (getOverallProgress) data;
        onGetStartedClick.write((Object) getoverallprogress, "entity");
        return new onFinish(getoverallprogress.IconCompatParcelizer, getoverallprogress.MediaBrowserCompat$ItemReceiver, getoverallprogress.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
