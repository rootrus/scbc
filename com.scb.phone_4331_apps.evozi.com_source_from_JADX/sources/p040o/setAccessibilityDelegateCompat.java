package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.setOnCloseListener;

/* renamed from: o.setAccessibilityDelegateCompat */
public final class setAccessibilityDelegateCompat {
    private static final read<Object> read = new read<Object>() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        }
    };

    /* renamed from: o.setAccessibilityDelegateCompat$read */
    public interface read<T> {
        void MediaBrowserCompat$CustomActionResultReceiver(T t);
    }

    /* renamed from: o.setAccessibilityDelegateCompat$write */
    public interface write {
        setClipToPadding MediaBrowserCompat$ItemReceiver();
    }

    public static <T extends write> setOnCloseListener.read<T> MediaBrowserCompat$ItemReceiver(int i, C1446x798357e0<T> setaccessibilitydelegatecompat_mediabrowsercompat_customactionresultreceiver) {
        return new setAccessibilityDelegateCompat$MediaBrowserCompat$ItemReceiver(new setOnCloseListener.write(i), setaccessibilitydelegatecompat_mediabrowsercompat_customactionresultreceiver, read);
    }

    public static <T> setOnCloseListener.read<List<T>> write() {
        return new setAccessibilityDelegateCompat$MediaBrowserCompat$ItemReceiver(new setOnCloseListener.write(20), new C1446x798357e0<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new read<List<T>>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                ((List) obj).clear();
            }
        });
    }
}
