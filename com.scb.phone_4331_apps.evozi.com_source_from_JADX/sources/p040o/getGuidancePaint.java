package p040o;

import p040o.LogFileManager;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGuidancePaint */
public final /* synthetic */ class getGuidancePaint implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5411sl write;

    public /* synthetic */ getGuidancePaint(C5411sl slVar) {
        this.write = slVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5411sl slVar = this.write;
        ServerProjectProvider.C128911 r3 = (ServerProjectProvider.C128911) obj;
        if (slVar.read) {
            r3.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        LogFileManager.DirectoryProvider directoryProvider = slVar.MediaBrowserCompat$SearchResultReceiver;
        if (directoryProvider != null) {
            r3.read(directoryProvider);
        } else {
            r3.write();
        }
    }
}
