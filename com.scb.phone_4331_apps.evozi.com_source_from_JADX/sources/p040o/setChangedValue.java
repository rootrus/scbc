package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setChangedValue */
public final /* synthetic */ class setChangedValue implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setChangedValue(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ErrorInfo.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, (getProject.write) obj);
    }
}
