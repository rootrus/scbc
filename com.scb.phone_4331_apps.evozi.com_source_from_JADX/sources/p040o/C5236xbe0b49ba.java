package p040o;

import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.requestWasSuccessful$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C5236xbe0b49ba<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.read> {
    private /* synthetic */ requestWasSuccessful MediaBrowserCompat$ItemReceiver;

    public C5236xbe0b49ba(requestWasSuccessful requestwassuccessful) {
        this.MediaBrowserCompat$ItemReceiver = requestwassuccessful;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetExtractionParametersFactory.read) obj).IconCompatParcelizer(requestWasSuccessful.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver));
    }
}
