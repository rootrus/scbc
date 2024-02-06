package p040o;

import android.app.Activity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.FragmentBuilder_BindGiftingMoneyTransferInputFragment */
public final class FragmentBuilder_BindGiftingMoneyTransferInputFragment {
    private static final Set<Class<? extends Activity>> read = new HashSet();

    public static void MediaBrowserCompat$ItemReceiver(Class<? extends Activity> cls) {
        read.add(cls);
    }

    public static <T extends Activity> boolean read(T t) {
        return read.contains(t.getClass());
    }
}
