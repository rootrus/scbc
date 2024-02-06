package p040o;

import com.scb.phone.data.network.service.ISprintService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.nC */
public final class C4998nC {
    private final String IconCompatParcelizer;
    private List<Integer> MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.nC$read */
    public static final class read {
        public ISprintService MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        @HmlPinActivity
        public read(ISprintService iSprintService) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iSprintService;
        }
    }

    public C4998nC(String str, List<String> list) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver(list);
    }

    private static List<Integer> MediaBrowserCompat$ItemReceiver(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (GoodToKnowActivity.read((String) next) != null) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable = (List) arrayList;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(((Collection) iterable).size());
        for (String parseInt : iterable) {
            arrayList2.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        return (List) arrayList2;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            if (str != null) {
                int length = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString().length();
                List<Integer> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (list != null) {
                    return list.contains(Integer.valueOf(length));
                }
                if (length > 1) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return false;
    }
}
