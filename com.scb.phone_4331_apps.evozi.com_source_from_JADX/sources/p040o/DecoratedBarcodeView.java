package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerKtaFactory;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DecoratedBarcodeView */
public final /* synthetic */ class DecoratedBarcodeView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setStringValue MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ DecoratedBarcodeView(setStringValue setstringvalue, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setstringvalue;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setStringValue setstringvalue = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((IdCaptureModule_GetIIdDeserializerKtaFactory.read) obj).write(setstringvalue.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
