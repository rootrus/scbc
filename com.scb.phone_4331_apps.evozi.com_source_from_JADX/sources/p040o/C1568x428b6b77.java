package p040o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.entryRemoved;
import p040o.setUseCompatPadding;

/* renamed from: o.setUseCompatPadding$MediaBrowserCompat$CustomActionResultReceiver */
public class C1568x428b6b77 {
    final Map<setUseCompatPadding.IconCompatParcelizer, entryRemoved.write> IconCompatParcelizer;
    public final Map<entryRemoved.write, List<setUseCompatPadding.IconCompatParcelizer>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();

    C1568x428b6b77(Map<setUseCompatPadding.IconCompatParcelizer, entryRemoved.write> map) {
        this.IconCompatParcelizer = map;
        for (Map.Entry next : map.entrySet()) {
            entryRemoved.write write = (entryRemoved.write) next.getValue();
            List list = this.MediaBrowserCompat$CustomActionResultReceiver.get(write);
            if (list == null) {
                list = new ArrayList();
                this.MediaBrowserCompat$CustomActionResultReceiver.put(write, list);
            }
            list.add(next.getKey());
        }
    }

    public static void IconCompatParcelizer(List<setUseCompatPadding.IconCompatParcelizer> list, maxSize maxsize, entryRemoved.write write, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                setUseCompatPadding.IconCompatParcelizer iconCompatParcelizer = list.get(size);
                try {
                    int i = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                    if (i == 0) {
                        iconCompatParcelizer.read.invoke(obj, new Object[0]);
                    } else if (i == 1) {
                        iconCompatParcelizer.read.invoke(obj, new Object[]{maxsize});
                    } else if (i == 2) {
                        iconCompatParcelizer.read.invoke(obj, new Object[]{maxsize, write});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
