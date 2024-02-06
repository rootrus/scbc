package p040o;

import p040o.BillCaptureModule;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIBillDeserializerKtaFactory */
public final /* synthetic */ class BillCaptureModule_GetIBillDeserializerKtaFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ animateCameraWithDurationAndCallback MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C9758x38013f75 write;

    public /* synthetic */ BillCaptureModule_GetIBillDeserializerKtaFactory(C9758x38013f75 iBillExtractorListener$MediaBrowserCompat$CustomActionResultReceiver, animateCameraWithDurationAndCallback animatecamerawithdurationandcallback) {
        this.write = iBillExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = animatecamerawithdurationandcallback;
    }

    public final void IconCompatParcelizer(Object obj) {
        C9758x38013f75 iBillExtractorListener$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = this.MediaBrowserCompat$ItemReceiver;
        getTopLeftCornerWidth.setIcon seticon = (getTopLeftCornerWidth.setIcon) obj;
        seticon.aj_();
        seticon.read(animatecamerawithdurationandcallback.f2799x50fd9e4a, animatecamerawithdurationandcallback.RatingCompat, new BillCaptureModule.KtaExceptionResponseDeserializer(iBillExtractorListener$MediaBrowserCompat$CustomActionResultReceiver.write));
    }
}
