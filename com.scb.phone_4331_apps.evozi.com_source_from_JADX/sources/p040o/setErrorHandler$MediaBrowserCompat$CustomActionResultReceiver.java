package p040o;

import java.io.Serializable;
import java.util.Comparator;
import p040o.setErrorHandler;

/* renamed from: o.setErrorHandler$MediaBrowserCompat$CustomActionResultReceiver */
public final class setErrorHandler$MediaBrowserCompat$CustomActionResultReceiver implements Serializable, Comparator<setErrorHandler.write> {
    private setErrorHandler$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ setErrorHandler$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((setErrorHandler.write) obj).IconCompatParcelizer - ((setErrorHandler.write) obj2).IconCompatParcelizer;
    }
}
