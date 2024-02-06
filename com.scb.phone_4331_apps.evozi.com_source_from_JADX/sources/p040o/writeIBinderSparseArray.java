package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzca;

/* renamed from: o.writeIBinderSparseArray */
public final /* synthetic */ class writeIBinderSparseArray implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ writeIBinderSparseArray MediaBrowserCompat$CustomActionResultReceiver = new writeIBinderSparseArray();

    private /* synthetic */ writeIBinderSparseArray() {
    }

    public final Object write(Object obj) {
        invalidateAllText invalidatealltext = (invalidateAllText) ((SingleDataEntity) obj).getData();
        String str = invalidatealltext.read;
        if (str != null) {
            String str2 = invalidatealltext.write;
            if (str2 != null) {
                String str3 = invalidatealltext.MediaBrowserCompat$ItemReceiver;
                if (str3 != null) {
                    String str4 = invalidatealltext.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str4 != null) {
                        List<CompoundTrimPathContent> list = invalidatealltext.IconCompatParcelizer;
                        if (list != null) {
                            Iterable<CompoundTrimPathContent> iterable = list;
                            int i = 10;
                            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                            if (iterable instanceof Collection) {
                                i = ((Collection) iterable).size();
                            }
                            Collection arrayList = new ArrayList(i);
                            for (CompoundTrimPathContent write : iterable) {
                                arrayList.add(write.write());
                            }
                            return new zzca.zza.C10763zza(str, str2, str3, str4, (List) arrayList);
                        }
                        throw new EntityMappingException("Some mandatory is missing.");
                    }
                    throw new EntityMappingException("Some mandatory is missing.");
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
        throw new EntityMappingException("Some mandatory is missing.");
    }
}
