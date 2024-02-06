package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIParametersFactory */
public final /* synthetic */ class BillCaptureModule_GetIParametersFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ IBillDeserializer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ parseSession read;

    public /* synthetic */ BillCaptureModule_GetIParametersFactory(IBillDeserializer iBillDeserializer, parseSession parsesession) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iBillDeserializer;
        this.read = parsesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        IBillDeserializer iBillDeserializer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getTopLeftCornerWidth.ListMenuItemView) obj).MediaBrowserCompat$CustomActionResultReceiver(iBillDeserializer.IconCompatParcelizer, iBillDeserializer.MediaDescriptionCompat, iBillDeserializer.MediaBrowserCompat$ItemReceiver, this.read);
    }
}
