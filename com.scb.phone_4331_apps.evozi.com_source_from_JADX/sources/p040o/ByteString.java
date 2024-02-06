package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ByteString */
public final /* synthetic */ class ByteString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ standardStartAndWait MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getSessionEventSize write;

    public /* synthetic */ ByteString(getSessionEventSize getsessioneventsize, standardStartAndWait standardstartandwait) {
        this.write = getsessioneventsize;
        this.MediaBrowserCompat$ItemReceiver = standardstartandwait;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSessionEventSize getsessioneventsize = this.write;
        standardStartAndWait standardstartandwait = this.MediaBrowserCompat$ItemReceiver;
        CheckCaptureModule_GetIExtractionServerRttiFactory checkCaptureModule_GetIExtractionServerRttiFactory = (CheckCaptureModule_GetIExtractionServerRttiFactory) obj;
        checkCaptureModule_GetIExtractionServerRttiFactory.IconCompatParcelizer(standardstartandwait.MediaDescriptionCompat);
        checkCaptureModule_GetIExtractionServerRttiFactory.write(!getsessioneventsize.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setShortcut());
        checkCaptureModule_GetIExtractionServerRttiFactory.MediaBrowserCompat$ItemReceiver(standardstartandwait.RatingCompat);
    }
}
