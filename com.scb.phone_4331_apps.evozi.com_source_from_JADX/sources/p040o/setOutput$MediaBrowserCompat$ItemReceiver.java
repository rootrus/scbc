package p040o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.setOutput$MediaBrowserCompat$ItemReceiver */
public final class setOutput$MediaBrowserCompat$ItemReceiver implements Serializable, Comparator<getValue> {
    private final float write;

    public /* synthetic */ setOutput$MediaBrowserCompat$ItemReceiver(float f, byte b) {
        this(f);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(Math.abs(((getValue) obj2).write - this.write), Math.abs(((getValue) obj).write - this.write));
    }

    private setOutput$MediaBrowserCompat$ItemReceiver(float f) {
        this.write = f;
    }
}
