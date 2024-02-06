package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setProcessingProfile */
public final /* synthetic */ class setProcessingProfile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setProcessingProfile(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        getErrDesc.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, (getProject.IconCompatParcelizer) obj);
    }
}
