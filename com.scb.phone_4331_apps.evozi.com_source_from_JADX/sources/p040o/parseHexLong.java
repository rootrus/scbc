package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.tryCrossOverAndBubbleUp;

/* renamed from: o.parseHexLong */
public final /* synthetic */ class parseHexLong implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ tryCrossOverAndBubbleUp.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ parseHexLong(tryCrossOverAndBubbleUp.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final Object write(Object obj) {
        setRepeatCount setrepeatcount = (setRepeatCount) obj;
        onGetStartedClick.write((Object) setrepeatcount, "debitCardActivationEntity");
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : setrepeatcount.read) {
            String str = ((updateBitmap) next).write;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(next);
        }
        Collection arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterable<updateBitmap> iterable = (Iterable) entry.getValue();
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (updateBitmap MediaBrowserCompat$ItemReceiver2 : iterable) {
                arrayList2.add(FragmentBuilder_BindUnlinkAccountFragment.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
            }
            List list = (List) arrayList2;
            String str3 = ((updateBitmap) ((List) entry.getValue()).get(0)).MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new getFadeIn(str2, list, str3, false, false, 0, 56));
        }
        return (List) arrayList;
    }
}
