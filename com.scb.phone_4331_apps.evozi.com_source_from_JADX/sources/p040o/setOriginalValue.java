package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOriginalValue */
public final /* synthetic */ class setOriginalValue implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getErr MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setOriginalValue(getErr geterr) {
        this.MediaBrowserCompat$ItemReceiver = geterr;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((getProject.read) obj);
    }
}
