package p040o;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.PrepaidInputActivity */
abstract class PrepaidInputActivity<F extends Format> {
    private final ConcurrentMap<IconCompatParcelizer, F> write = new ConcurrentHashMap(7);

    /* access modifiers changed from: protected */
    public abstract F IconCompatParcelizer(String str, TimeZone timeZone, Locale locale);

    PrepaidInputActivity() {
    }

    static {
        new ConcurrentHashMap(7);
    }

    public final F MediaBrowserCompat$CustomActionResultReceiver(String str, Locale locale) {
        Object[] objArr = new Object[0];
        if (str != null) {
            TimeZone timeZone = TimeZone.getDefault();
            if (locale == null) {
                locale = Locale.getDefault();
            }
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(str, timeZone, locale);
            F f = (Format) this.write.get(iconCompatParcelizer);
            if (f != null) {
                return f;
            }
            F IconCompatParcelizer2 = IconCompatParcelizer(str, timeZone, locale);
            F f2 = (Format) this.write.putIfAbsent(iconCompatParcelizer, IconCompatParcelizer2);
            return f2 != null ? f2 : IconCompatParcelizer2;
        }
        throw new NullPointerException(String.format("pattern must not be null", objArr));
    }

    /* renamed from: o.PrepaidInputActivity$IconCompatParcelizer */
    static class IconCompatParcelizer {
        private final Object[] MediaBrowserCompat$CustomActionResultReceiver;
        private int MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(Object... objArr) {
            this.MediaBrowserCompat$CustomActionResultReceiver = objArr;
        }

        public final boolean equals(Object obj) {
            return Arrays.equals(this.MediaBrowserCompat$CustomActionResultReceiver, ((IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            if (this.MediaBrowserCompat$ItemReceiver == 0) {
                int i = 0;
                for (Object obj : this.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (obj != null) {
                        i = (i * 7) + obj.hashCode();
                    }
                }
                this.MediaBrowserCompat$ItemReceiver = i;
            }
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }
}
