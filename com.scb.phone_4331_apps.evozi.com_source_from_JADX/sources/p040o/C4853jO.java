package p040o;

import p040o.CrashlyticsReport;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jO */
public final /* synthetic */ class C4853jO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ C4895kb write;

    public /* synthetic */ C4853jO(C4895kb kbVar, String str, int i) {
        this.write = kbVar;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        C4895kb kbVar = this.write;
        String str2 = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        getCarbonStrip.IconCompatParcelizer iconCompatParcelizer = (getCarbonStrip.IconCompatParcelizer) obj;
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = kbVar.MediaDescriptionCompat;
        if (builder == null || builder.read <= 0.0d) {
            str = null;
        } else {
            str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(kbVar.MediaDescriptionCompat.read);
            iconCompatParcelizer.read(false);
        }
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(str2, str, i);
    }
}
