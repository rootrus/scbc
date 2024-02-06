package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.writeUInt64NoTag;

/* renamed from: o.aP$MediaBrowserCompat$SearchResultReceiver */
public final class aP$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<isProcessed> {
    private /* synthetic */ setLength IconCompatParcelizer;

    public aP$MediaBrowserCompat$SearchResultReceiver(setLength setlength) {
        this.IconCompatParcelizer = setlength;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((isProcessed) obj).read((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) this.IconCompatParcelizer);
    }
}
