package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.getLastReturnCode;
import p040o.writeUInt64NoTag;

/* renamed from: o.IsInternalContrastLow */
public final /* synthetic */ class IsInternalContrastLow implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLastReturnCode.write MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ IsInternalContrastLow(getLastReturnCode.write write2, List list) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat mediaDescriptionCompat = (CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat) obj;
        mediaDescriptionCompat.write(this.write, this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver);
    }
}
