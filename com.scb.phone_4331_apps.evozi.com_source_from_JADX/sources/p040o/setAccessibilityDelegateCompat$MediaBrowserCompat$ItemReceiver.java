package p040o;

import android.util.Log;
import p040o.setAccessibilityDelegateCompat;
import p040o.setOnCloseListener;

/* renamed from: o.setAccessibilityDelegateCompat$MediaBrowserCompat$ItemReceiver */
final class setAccessibilityDelegateCompat$MediaBrowserCompat$ItemReceiver<T> implements setOnCloseListener.read<T> {
    private final C1446x798357e0<T> IconCompatParcelizer;
    private final setAccessibilityDelegateCompat.read<T> read;
    private final setOnCloseListener.read<T> write;

    setAccessibilityDelegateCompat$MediaBrowserCompat$ItemReceiver(setOnCloseListener.read<T> read2, C1446x798357e0<T> setaccessibilitydelegatecompat_mediabrowsercompat_customactionresultreceiver, setAccessibilityDelegateCompat.read<T> read3) {
        this.write = read2;
        this.IconCompatParcelizer = setaccessibilitydelegatecompat_mediabrowsercompat_customactionresultreceiver;
        this.read = read3;
    }

    public final T read() {
        T read2 = this.write.read();
        if (read2 == null) {
            read2 = this.IconCompatParcelizer.read();
            if (Log.isLoggable("FactoryPools", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Created new ");
                sb.append(read2.getClass());
                Log.v("FactoryPools", sb.toString());
            }
        }
        if (read2 instanceof setAccessibilityDelegateCompat.write) {
            ((setAccessibilityDelegateCompat.write) read2).MediaBrowserCompat$ItemReceiver().IconCompatParcelizer(false);
        }
        return read2;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(T t) {
        if (t instanceof setAccessibilityDelegateCompat.write) {
            ((setAccessibilityDelegateCompat.write) t).MediaBrowserCompat$ItemReceiver().IconCompatParcelizer(true);
        }
        this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
        return this.write.MediaBrowserCompat$CustomActionResultReceiver(t);
    }
}
