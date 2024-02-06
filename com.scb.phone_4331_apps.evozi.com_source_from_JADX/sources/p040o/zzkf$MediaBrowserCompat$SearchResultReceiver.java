package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.List;
import p040o.zzm;

/* renamed from: o.zzkf$MediaBrowserCompat$SearchResultReceiver */
final class zzkf$MediaBrowserCompat$SearchResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzkf$MediaBrowserCompat$SearchResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new zzkf$MediaBrowserCompat$SearchResultReceiver();

    zzkf$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        List<String> list = ((peek) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return new zzm.zzd(list);
        }
        throw new EntityMappingException((String) null);
    }
}
