package p040o;

import java.util.Comparator;

/* renamed from: o.readUnsignedShort */
public final class readUnsignedShort {
    public final writeChars MediaBrowserCompat$ItemReceiver;
    public final ByteArrayDataOutput write;

    @HmlPinActivity
    public readUnsignedShort(writeChars writechars, ByteArrayDataOutput byteArrayDataOutput) {
        onGetStartedClick.write((Object) writechars, "staticStringsMapper");
        onGetStartedClick.write((Object) byteArrayDataOutput, "categoryDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = writechars;
        this.write = byteArrayDataOutput;
    }

    /* renamed from: o.readUnsignedShort$write */
    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((EventBus$$Lambda$1) t).read);
            Comparable valueOf2 = Integer.valueOf(((EventBus$$Lambda$1) t2).read);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }
}
