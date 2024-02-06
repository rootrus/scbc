package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.zzke$MediaBrowserCompat$ItemReceiver */
final class zzke$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzke MediaBrowserCompat$CustomActionResultReceiver;

    zzke$MediaBrowserCompat$ItemReceiver(zzke zzke) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzke;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "entity.data");
        isAtLeastVersion isatleastversion = (isAtLeastVersion) data;
        onGetStartedClick.write((Object) isatleastversion, "entity");
        String str = isatleastversion.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            String str2 = isatleastversion.read;
            if (str2 != null) {
                return new setOnMapLoadedCallback(str, str2);
            }
            throw new EntityMappingException("data must not be null or empty");
        }
        throw new EntityMappingException("data must not be null or empty");
    }
}
