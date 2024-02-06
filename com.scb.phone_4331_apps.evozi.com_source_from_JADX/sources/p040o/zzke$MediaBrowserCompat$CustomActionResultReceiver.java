package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.zzke$MediaBrowserCompat$CustomActionResultReceiver */
final class zzke$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzke read;

    zzke$MediaBrowserCompat$CustomActionResultReceiver(zzke zzke) {
        this.read = zzke;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "entity.data");
        getAnimationScale getanimationscale = (getAnimationScale) data;
        onGetStartedClick.write((Object) getanimationscale, "payNowTransactionEntity");
        String str = getanimationscale.read;
        if (str != null) {
            String str2 = getanimationscale.IconCompatParcelizer;
            if (str2 != null) {
                setOnMapLoadedCallback setonmaploadedcallback = new setOnMapLoadedCallback(str, str2);
                setOnCameraMoveListener write = registerConnectionCallbacks.write(getanimationscale.MediaBrowserCompat$CustomActionResultReceiver);
                setOnInfoWindowClickListener MediaBrowserCompat$ItemReceiver = stopAutoManage.MediaBrowserCompat$ItemReceiver(getanimationscale.write);
                setOnMapLongClickListener MediaBrowserCompat$ItemReceiver2 = setHandler.MediaBrowserCompat$ItemReceiver(getanimationscale.MediaBrowserCompat$MediaItem);
                String str3 = getanimationscale.MediaBrowserCompat$ItemReceiver;
                if (str3 == null) {
                    str3 = "";
                }
                return new setOnMapClickListener(setonmaploadedcallback, new setOnInfoWindowLongClickListener(write, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2, str3));
            }
            throw new EntityMappingException("data must not be null or empty");
        }
        throw new EntityMappingException("data must not be null or empty");
    }
}
