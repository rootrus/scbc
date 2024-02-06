package p040o;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.nAllocationCreateFromBitmap */
public abstract class nAllocationCreateFromBitmap {

    /* renamed from: o.nAllocationCreateFromBitmap$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        public Map<Int4, write> MediaBrowserCompat$ItemReceiver = new HashMap();
        public CreditCardCaptureModule_GetIParametersFactory read;
    }

    /* renamed from: o.nAllocationCreateFromBitmap$write */
    public static abstract class write {
        /* access modifiers changed from: package-private */
        public abstract long IconCompatParcelizer();

        public abstract Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> read();

        /* access modifiers changed from: package-private */
        public abstract long write();
    }

    /* access modifiers changed from: package-private */
    public abstract CreditCardCaptureModule_GetIParametersFactory IconCompatParcelizer();

    public abstract Map<Int4, write> read();

    public final long write(Int4 int4, long j, int i) {
        long MediaBrowserCompat$ItemReceiver = IconCompatParcelizer().MediaBrowserCompat$ItemReceiver();
        write write2 = read().get(int4);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * write2.IconCompatParcelizer(), j - MediaBrowserCompat$ItemReceiver), write2.write());
    }
}
