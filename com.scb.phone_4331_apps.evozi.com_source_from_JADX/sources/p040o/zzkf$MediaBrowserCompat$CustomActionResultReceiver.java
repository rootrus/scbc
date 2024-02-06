package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zzkf$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkf$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzkf$MediaBrowserCompat$CustomActionResultReceiver write = new zzkf$MediaBrowserCompat$CustomActionResultReceiver();

    zzkf$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        beginArray beginarray = (beginArray) data;
        onGetStartedClick.write((Object) beginarray, "$this$toDomain");
        onGetStartedClick.write((Object) beginarray, "entity");
        String str = beginarray.IconCompatParcelizer;
        if (str != null) {
            List<List<String>> list = beginarray.write;
            if (list != null) {
                Iterable<List> iterable = list;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                int i = 10;
                Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                for (List list2 : iterable) {
                    if (list2 != null) {
                        Iterable<String> iterable2 = list2;
                        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
                        Collection arrayList2 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
                        for (String str2 : iterable2) {
                            if (str2 != null) {
                                arrayList2.add(str2);
                            } else {
                                throw new EntityMappingException("Some mandatory is missing.");
                            }
                        }
                        arrayList.add((List) arrayList2);
                    } else {
                        throw new EntityMappingException("Some mandatory is missing.");
                    }
                }
                List list3 = (List) arrayList;
                List<skipName> list4 = beginarray.MediaBrowserCompat$ItemReceiver;
                if (list4 != null) {
                    Iterable<skipName> iterable3 = list4;
                    onGetStartedClick.write((Object) iterable3, "$this$collectionSizeOrDefault");
                    if (iterable3 instanceof Collection) {
                        i = ((Collection) iterable3).size();
                    }
                    Collection arrayList3 = new ArrayList(i);
                    for (skipName skipname : iterable3) {
                        if (skipname != null) {
                            String str3 = skipname.MediaBrowserCompat$ItemReceiver;
                            if (str3 != null) {
                                String str4 = skipname.write;
                                if (str4 != null) {
                                    String str5 = skipname.read;
                                    if (str5 != null) {
                                        arrayList3.add(new setLatLngBounds(str3, str5, str4));
                                    } else {
                                        throw new EntityMappingException("Some mandatory is missing.");
                                    }
                                } else {
                                    throw new EntityMappingException("Some mandatory is missing.");
                                }
                            } else {
                                throw new EntityMappingException("Some mandatory is missing.");
                            }
                        } else {
                            throw new EntityMappingException("Some mandatory is missing.");
                        }
                    }
                    return new PlacePicker(str, list3, (List) arrayList3);
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
        throw new EntityMappingException("Some mandatory is missing.");
    }
}
