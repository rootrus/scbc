package p040o;

import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.access$2300;
import p040o.getLastReturnCode;
import p040o.writeUInt64NoTag;

/* renamed from: o.MultiValidationEngine */
public final /* synthetic */ class MultiValidationEngine implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ getLastReturnCode.write write;

    public /* synthetic */ MultiValidationEngine(getLastReturnCode.write write2, Throwable th) {
        this.write = write2;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getLastReturnCode.write write2 = this.write;
        ((CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat) obj).write(getLastReturnCode.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
