package p040o;

import p040o.BillCaptureModule;
import p040o.IBillExtractorListener;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetExtractionParametersFactory */
public final /* synthetic */ class BillCaptureModule_GetExtractionParametersFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ animateCameraWithDurationAndCallback IconCompatParcelizer;
    private final /* synthetic */ IBillExtractorListener.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ BillCaptureModule_GetExtractionParametersFactory(IBillExtractorListener.read read, animateCameraWithDurationAndCallback animatecamerawithdurationandcallback) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.IconCompatParcelizer = animatecamerawithdurationandcallback;
    }

    public final void IconCompatParcelizer(Object obj) {
        IBillExtractorListener.read read = this.MediaBrowserCompat$ItemReceiver;
        animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = this.IconCompatParcelizer;
        getTopLeftCornerWidth.setIcon seticon = (getTopLeftCornerWidth.setIcon) obj;
        seticon.aj_();
        seticon.read(animatecamerawithdurationandcallback.f2799x50fd9e4a, animatecamerawithdurationandcallback.RatingCompat, new BillCaptureModule.KtaExceptionResponseDeserializer(IBillExtractorListener.this));
    }
}
