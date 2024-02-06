package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setEventTime */
public final /* synthetic */ class setEventTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setEventTime(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ErrorInfo.read(this.MediaBrowserCompat$CustomActionResultReceiver, (getProject.write) obj);
    }
}
