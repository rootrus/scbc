package p040o;

import java.util.NoSuchElementException;

/* renamed from: o.getMarker$MediaBrowserCompat$ItemReceiver */
public final class getMarker$MediaBrowserCompat$ItemReceiver {
    private getMarker$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ getMarker$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static getMarker MediaBrowserCompat$ItemReceiver(setFlat setflat) {
        onGetStartedClick.write((Object) setflat, "function");
        for (getMarker getmarker : getMarker.values()) {
            if (getmarker.function == setflat) {
                return getmarker;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
