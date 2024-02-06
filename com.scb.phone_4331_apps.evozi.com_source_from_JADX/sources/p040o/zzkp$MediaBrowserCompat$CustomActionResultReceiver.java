package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzkp$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkp$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkp IconCompatParcelizer;

    zzkp$MediaBrowserCompat$CustomActionResultReceiver(zzkp zzkp) {
        this.IconCompatParcelizer = zzkp;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        buildClientSettings buildclientsettings = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        return buildclientsettings.MediaBrowserCompat$ItemReceiver((LottieFrameInfo) data);
    }
}
