package p040o;

import android.util.Property;

/* renamed from: o.nDeviceSetConfig$MediaBrowserCompat$CustomActionResultReceiver */
public class nDeviceSetConfig$MediaBrowserCompat$CustomActionResultReceiver extends Property<nDeviceSetConfig, Integer> {
    public static final Property<nDeviceSetConfig, Integer> MediaBrowserCompat$CustomActionResultReceiver = new nDeviceSetConfig$MediaBrowserCompat$CustomActionResultReceiver("circularRevealScrimColor");

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((nDeviceSetConfig) obj).write());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((nDeviceSetConfig) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }

    private nDeviceSetConfig$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        super(Integer.class, str);
    }
}
