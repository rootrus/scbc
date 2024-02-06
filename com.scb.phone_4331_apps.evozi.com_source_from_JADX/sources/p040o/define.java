package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.define */
public final /* synthetic */ class define implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSummaryFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ define(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindSummaryFragment;
    }

    public final Object write(Object obj) {
        FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        FileExtension fileExtension = (FileExtension) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) fileExtension, "suitabilitiesEntity");
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : fileExtension.MediaBrowserCompat$CustomActionResultReceiver) {
            Integer valueOf = Integer.valueOf(Integer.parseInt(((filenameForUrl) next).MediaBrowserCompat$CustomActionResultReceiver));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(next);
        }
        Collection arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Iterable<filenameForUrl> iterable = (Iterable) entry.getValue();
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (filenameForUrl write : iterable) {
                arrayList2.add(IStatusCallback.write(write, fileExtension.write));
            }
            arrayList.add(new getLocale(intValue, (List) arrayList2));
        }
        getPriceLevel getpricelevel = new getPriceLevel((List) arrayList);
        fragmentBuilder_BindSummaryFragment.RatingCompat.IconCompatParcelizer = getpricelevel;
        return getpricelevel;
    }
}
