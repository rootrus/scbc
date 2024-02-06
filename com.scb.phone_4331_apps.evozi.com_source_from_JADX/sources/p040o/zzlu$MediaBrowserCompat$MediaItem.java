package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zzlu$MediaBrowserCompat$MediaItem */
final class zzlu$MediaBrowserCompat$MediaItem<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzlu read;

    zzlu$MediaBrowserCompat$MediaItem(zzlu zzlu) {
        this.read = zzlu;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        setMinAngleForSlices setminangleforslices = (setMinAngleForSlices) data;
        onGetStartedClick.write((Object) setminangleforslices, "entity");
        List<setCenterTextSize> list = setminangleforslices.IconCompatParcelizer;
        if (list != null) {
            Iterable<setCenterTextSize> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (setCenterTextSize setcentertextsize : iterable) {
                onGetStartedClick.write((Object) setcentertextsize, "entity");
                String str = setcentertextsize.MediaBrowserCompat$CustomActionResultReceiver;
                if (str != null) {
                    String str2 = setcentertextsize.write;
                    if (str2 != null) {
                        arrayList.add(new getMinZoomPreference(str, str2));
                    } else {
                        throw new EntityMappingException("Mandatory field is missing.");
                    }
                } else {
                    throw new EntityMappingException("Mandatory field is missing.");
                }
            }
            return new minZoomPreference((List) arrayList);
        }
        throw new EntityMappingException("Mandatory field is missing.");
    }
}
