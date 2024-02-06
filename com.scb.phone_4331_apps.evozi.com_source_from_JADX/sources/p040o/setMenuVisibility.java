package p040o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.setMenuVisibility */
public final class setMenuVisibility implements setNextAnim {
    private final Map<String, List<getTransit>> MediaBrowserCompat$ItemReceiver;
    private volatile Map<String, String> read;

    setMenuVisibility(Map<String, List<getTransit>> map) {
        this.MediaBrowserCompat$ItemReceiver = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read == null) {
            synchronized (this) {
                if (this.read == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : this.MediaBrowserCompat$ItemReceiver.entrySet()) {
                        String read2 = read((List) next.getValue());
                        if (!TextUtils.isEmpty(read2)) {
                            hashMap.put(next.getKey(), read2);
                        }
                    }
                    this.read = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.read;
    }

    private static String read(List<getTransit> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String MediaBrowserCompat$CustomActionResultReceiver = list.get(i).MediaBrowserCompat$CustomActionResultReceiver();
            if (!TextUtils.isEmpty(MediaBrowserCompat$CustomActionResultReceiver)) {
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setMenuVisibility) {
            return this.MediaBrowserCompat$ItemReceiver.equals(((setMenuVisibility) obj).MediaBrowserCompat$ItemReceiver);
        }
        return false;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    /* renamed from: o.setMenuVisibility$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private static final String IconCompatParcelizer;
        private static final Map<String, List<getTransit>> MediaBrowserCompat$CustomActionResultReceiver;
        Map<String, List<getTransit>> write = MediaBrowserCompat$CustomActionResultReceiver;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            IconCompatParcelizer = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(IconCompatParcelizer)) {
                hashMap.put("User-Agent", Collections.singletonList(new setMenuVisibility$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer)));
            }
            MediaBrowserCompat$CustomActionResultReceiver = Collections.unmodifiableMap(hashMap);
        }
    }
}
