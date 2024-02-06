package p040o;

import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.access$2300;
import p040o.getLastReturnCode;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeValidateWithImage */
public final /* synthetic */ class nativeValidateWithImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ getLastReturnCode.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeValidateWithImage(getLastReturnCode.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getLastReturnCode.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat) obj).IconCompatParcelizer(getLastReturnCode.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
    }
}
