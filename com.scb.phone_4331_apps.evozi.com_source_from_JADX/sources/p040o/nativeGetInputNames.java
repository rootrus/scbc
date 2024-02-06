package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.getLastReturnCode;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetInputNames */
public final /* synthetic */ class nativeGetInputNames implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLastReturnCode.write IconCompatParcelizer;
    private final /* synthetic */ List read;

    public /* synthetic */ nativeGetInputNames(getLastReturnCode.write write, List list) {
        this.IconCompatParcelizer = write;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat mediaDescriptionCompat = (CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat) obj;
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.read, this.IconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver);
    }
}
