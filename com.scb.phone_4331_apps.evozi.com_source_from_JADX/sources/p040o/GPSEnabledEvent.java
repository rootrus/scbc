package p040o;

import java.util.List;
import p040o.C4989mz;
import p040o.QuickExtractorAgent;
import p040o.writeUInt64NoTag;

/* renamed from: o.GPSEnabledEvent */
public final /* synthetic */ class GPSEnabledEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4989mz.C49904 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List read;

    public /* synthetic */ GPSEnabledEvent(C4989mz.C49904 r1, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4989mz.C49904 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.read;
        QuickExtractorAgent.C70191 r4 = (QuickExtractorAgent.C70191) obj;
        r4.aj_();
        r4.read(C4989mz.this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(list, true));
    }
}
