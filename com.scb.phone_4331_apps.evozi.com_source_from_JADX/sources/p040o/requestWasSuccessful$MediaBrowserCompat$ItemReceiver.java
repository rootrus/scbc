package p040o;

import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.requestWasSuccessful$MediaBrowserCompat$ItemReceiver */
public final class requestWasSuccessful$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.read> {
    public static final requestWasSuccessful$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new requestWasSuccessful$MediaBrowserCompat$ItemReceiver();

    requestWasSuccessful$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CheckCaptureModule_GetExtractionParametersFactory.read read = (CheckCaptureModule_GetExtractionParametersFactory.read) obj;
        read.read();
        read.MediaBrowserCompat$CustomActionResultReceiver(false);
    }
}
