package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.QueueFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.aP$MediaBrowserCompat$MediaItem */
public final class aP$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<isProcessed> {
    private /* synthetic */ QueueFile.Element MediaBrowserCompat$CustomActionResultReceiver;

    public aP$MediaBrowserCompat$MediaItem(QueueFile.Element element) {
        this.MediaBrowserCompat$CustomActionResultReceiver = element;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((isProcessed) obj).read((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
