package p040o;

import java.util.LinkedList;
import p040o.CrashlyticsCore;
import p040o.writeUInt64NoTag;

/* renamed from: o.aq */
public final /* synthetic */ class C9857aq implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LinkedList MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getOsBuildVersionString MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C9857aq(getOsBuildVersionString getosbuildversionstring, LinkedList linkedList) {
        this.MediaBrowserCompat$ItemReceiver = getosbuildversionstring;
        this.MediaBrowserCompat$CustomActionResultReceiver = linkedList;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6397xabb2c88d) obj).write(this.MediaBrowserCompat$ItemReceiver, (CrashlyticsCore.C32462) this.MediaBrowserCompat$CustomActionResultReceiver.getFirst());
    }
}
