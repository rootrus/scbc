package p040o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.getXEnd */
final class getXEnd {
    private final Map<Integer, Integer> read = new HashMap();

    getXEnd() {
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(int i) {
        Integer num = this.read.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.read.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    /* access modifiers changed from: package-private */
    public final int[] MediaBrowserCompat$ItemReceiver() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.read.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
                arrayList.add(next.getKey());
            } else if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        return access$400.MediaBrowserCompat$ItemReceiver(arrayList);
    }
}
