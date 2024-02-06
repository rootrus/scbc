package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerKtaFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.setStatusText */
public final /* synthetic */ class setStatusText implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setStringValue IconCompatParcelizer;
    private final /* synthetic */ setCores read;

    public /* synthetic */ setStatusText(setStringValue setstringvalue, setCores setcores) {
        this.IconCompatParcelizer = setstringvalue;
        this.read = setcores;
    }

    public final void IconCompatParcelizer(Object obj) {
        IdCaptureModule_GetIIdDeserializerKtaFactory.read read2 = (IdCaptureModule_GetIIdDeserializerKtaFactory.read) obj;
        read2.MediaBrowserCompat$ItemReceiver(this.read, this.IconCompatParcelizer.IconCompatParcelizer);
    }
}
