package p040o;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: o.setIconified */
public class setIconified {
    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int MediaBrowserCompat$ItemReceiver(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
