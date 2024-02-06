package p040o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p040o.loadOrtho;

/* renamed from: o.loadProjectionNormalized */
public abstract class loadProjectionNormalized {
    public abstract RSIllegalArgumentException IconCompatParcelizer();

    public abstract String MediaBrowserCompat$CustomActionResultReceiver();

    public abstract long MediaBrowserCompat$ItemReceiver();

    public abstract long RatingCompat();

    public abstract Integer read();

    /* access modifiers changed from: protected */
    public abstract Map<String, String> write();

    public final Map<String, String> MediaBrowserCompat$SearchResultReceiver() {
        return Collections.unmodifiableMap(write());
    }

    public final int IconCompatParcelizer(String str) {
        String str2 = write().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long read(String str) {
        String str2 = write().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        String str2 = write().get(str);
        return str2 == null ? "" : str2;
    }

    public final IconCompatParcelizer MediaDescriptionCompat() {
        loadOrtho.write write = new loadOrtho.write();
        String MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            write.write = MediaBrowserCompat$CustomActionResultReceiver;
            return write.write(read()).MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer()).MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver()).write(RatingCompat()).MediaBrowserCompat$ItemReceiver(new HashMap(write()));
        }
        throw new NullPointerException("Null transportName");
    }

    /* renamed from: o.loadProjectionNormalized$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer {
        public abstract loadProjectionNormalized IconCompatParcelizer();

        /* access modifiers changed from: protected */
        public abstract Map<String, String> MediaBrowserCompat$CustomActionResultReceiver();

        public abstract IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(long j);

        public abstract IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(RSIllegalArgumentException rSIllegalArgumentException);

        /* access modifiers changed from: protected */
        public abstract IconCompatParcelizer MediaBrowserCompat$ItemReceiver(Map<String, String> map);

        public abstract IconCompatParcelizer write(long j);

        public abstract IconCompatParcelizer write(Integer num);

        public abstract IconCompatParcelizer write(String str);

        public final IconCompatParcelizer write(String str, String str2) {
            MediaBrowserCompat$CustomActionResultReceiver().put(str, str2);
            return this;
        }

        public final IconCompatParcelizer read(String str, long j) {
            MediaBrowserCompat$CustomActionResultReceiver().put(str, String.valueOf(j));
            return this;
        }

        public final IconCompatParcelizer write(String str, int i) {
            MediaBrowserCompat$CustomActionResultReceiver().put(str, String.valueOf(i));
            return this;
        }
    }
}
