package p040o;

import p040o.CrashlyticsCore;
import p040o.getImageWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDocumentSampleImage */
public final /* synthetic */ class getDocumentSampleImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsCore.C32494 IconCompatParcelizer;

    public /* synthetic */ getDocumentSampleImage(CrashlyticsCore.C32494 r1) {
        this.IconCompatParcelizer = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDiagnosticsViewEnabled.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, (getImageWidth.IconCompatParcelizer.read) obj);
    }
}
