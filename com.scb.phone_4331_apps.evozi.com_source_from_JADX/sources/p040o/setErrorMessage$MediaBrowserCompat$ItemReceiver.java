package p040o;

import p040o.ProcessingParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.setErrorMessage$MediaBrowserCompat$ItemReceiver */
public final class setErrorMessage$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
    public static final setErrorMessage$MediaBrowserCompat$ItemReceiver write = new setErrorMessage$MediaBrowserCompat$ItemReceiver();

    setErrorMessage$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ProcessingParameters.ProcessingType) obj).read(setErrorMessage$MediaBrowserCompat$CustomActionResultReceiver.OTA_ABOUT);
    }
}
