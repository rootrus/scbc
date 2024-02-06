package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSourceImage */
public final /* synthetic */ class getSourceImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDisplayVersion MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getSourceImage(getDisplayVersion getdisplayversion) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getdisplayversion;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getProject.IconCompatParcelizer) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
