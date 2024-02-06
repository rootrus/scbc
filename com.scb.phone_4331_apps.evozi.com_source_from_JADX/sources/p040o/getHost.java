package p040o;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.getHost */
public final class getHost {
    public final HashMap<Byte, List<byte[]>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>(10);

    /* renamed from: o.getHost$read */
    public static abstract class read implements Iterator<Integer> {
        public abstract int MediaBrowserCompat$ItemReceiver();

        public void remove() {
            throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
        }

        public /* synthetic */ Object next() {
            return Integer.valueOf(MediaBrowserCompat$ItemReceiver());
        }
    }
}
