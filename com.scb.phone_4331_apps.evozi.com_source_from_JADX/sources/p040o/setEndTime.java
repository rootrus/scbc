package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setEndTime */
public final /* synthetic */ class setEndTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setEndTime(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        getErrDesc.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, (getProject.IconCompatParcelizer) obj);
    }
}
