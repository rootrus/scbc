package p040o;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: o.NationalIdCameraActivity */
public final class NationalIdCameraActivity {
    public static final <E> List<E> IconCompatParcelizer() {
        return new CopyOnWriteArrayList<>();
    }

    public static final <E> Set<E> MediaBrowserCompat$ItemReceiver(int i) {
        Set<E> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i));
        onGetStartedClick.IconCompatParcelizer((Object) newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        return newSetFromMap;
    }

    static {
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
        }
    }
}
